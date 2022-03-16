package com.gurken.originmod.datagen;

import com.gurken.originmod.OriginMod;
import com.gurken.originmod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class OgBlockStates extends BlockStateProvider {

    public OgBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, OriginMod.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.CRATE_FOOD.get());
        simpleBlock(Registration.CRATE_COMMON.get());
        simpleBlock(Registration.CRATE_GOOD.get());
        simpleBlock(Registration.CRATE_RARE.get());
        simpleBlock(Registration.CRATE_EPIC.get());
        simpleBlock(Registration.CRATE_LEGENDARY.get());
        simpleBlock(Registration.SCRAP_BLOCK.get());
        simpleBlock(Registration.TIRE.get());
    }
}
