package com.gurken.originmod.event.loot;

import com.gurken.originmod.OriginMod;
import com.gurken.originmod.entity.cave_thing.CaveThingEntity;
import com.gurken.originmod.entity.variants.ModEntityTypes;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = OriginMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    /**
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new CucumberSeedsFromGrassAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(TutorialMod.MOD_ID,"cucumber_seeds_from_grass")),
                new DowsingRodInIglooAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(TutorialMod.MOD_ID,"dowsing_rod_in_igloo")),
                new CoalCokeFromCreeperAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(TutorialMod.MOD_ID,"coal_coke_from_creeper"))
        );
    }

    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
        Registry.register(Registry.RECIPE_TYPE, GemCuttingStationRecipe.Type.ID, GemCuttingStationRecipe.Type.INSTANCE);
    }
     **/

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.CAVE_THING.get(), CaveThingEntity.setAttributes());
    }
}