package com.gurken.originmod.setup;

import com.gurken.originmod.entity.cave_thing.CaveThingRenderer;
import com.gurken.originmod.entity.variants.ModEntityTypes;
import com.gurken.originmod.screen.SkeletonScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {

    public static void init(FMLClientSetupEvent event){
        MenuScreens.register(Registration.SKELETON_MENU.get(), SkeletonScreen::new);
        EntityRenderers.register(ModEntityTypes.CAVE_THING.get(), CaveThingRenderer::new);
    }
}
