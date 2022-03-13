package com.gurken.originmod.datagen;

import com.gurken.originmod.OriginMod;
import com.gurken.originmod.datagen.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = OriginMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new OgRecipes(generator));
            generator.addProvider(new OgLootTables(generator));
            OgBlockTags blockTags = new OgBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new OgItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new OgBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new OgItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new OgLanguageProvider(generator, "en_us"));
        }
    }
}
