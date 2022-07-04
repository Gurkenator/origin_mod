package com.gurken.originmod.entity.variants;

import com.gurken.originmod.OriginMod;
import com.gurken.originmod.entity.cave_thing.CaveThingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, OriginMod.MODID);

    public static final RegistryObject<EntityType<CaveThingEntity>> CAVE_THING =
            ENTITY_TYPES.register("cave_thing",
                    () -> EntityType.Builder.of(CaveThingEntity::new, MobCategory.CREATURE)
                            .sized(10f, 10f)
                            .build(new ResourceLocation(OriginMod.MODID, "textures/entity/cave_thing.png").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
