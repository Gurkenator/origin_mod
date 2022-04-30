package com.gurken.originmod.setup;

import com.gurken.originmod.screen.SkeletonScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {

    public static void init(FMLClientSetupEvent event){
        MenuScreens.register(Registration.SKELETON_MENU.get(), SkeletonScreen::new);
    }
}
