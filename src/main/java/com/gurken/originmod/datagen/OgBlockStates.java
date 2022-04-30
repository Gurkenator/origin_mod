package com.gurken.originmod.datagen;

import com.gurken.originmod.OriginMod;
import com.gurken.originmod.setup.Registration;
import net.minecraft.ResourceLocationException;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class OgBlockStates extends BlockStateProvider {

    public OgBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, OriginMod.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        registerSkeleton();
        registerCrateFood();
        registerCrateCommon();
        registerCrateGood();
        registerCrateRare();
        registerCrateEpic();
        registerCrateLegendary();

        simpleBlock(Registration.SCRAP_BLOCK.get());
        simpleBlock(Registration.TIRE.get());
        simpleBlock(Registration.SCORCHSTONE.get());
    }

    private void registerSkeleton() {
        Block block = Registration.SKELETON_BLOCK.get();
        ResourceLocation side = modLoc("block/skeleton_block");
        simpleBlock(block, models().cube(block.getRegistryName().getPath(), side, side, side, side, side, side));
    }

    private void registerCrateFood() {
        Block block = Registration.CRATE_FOOD.get();
        ResourceLocation top = modLoc("block/crate_food_top");
        ResourceLocation side1 = modLoc("block/crate_food_side_meat");
        ResourceLocation side2 = modLoc("block/crate_food_side_vegetables");
        ResourceLocation side3 = modLoc("block/crate_food_side_soup");
        ResourceLocation bottom = modLoc("block/crate_bottom");
        simpleBlock(block, models().cube(block.getRegistryName().getPath(), bottom, top, side1, side2, side3, side3));
    }

    private void registerCrateCommon() {
        Block block = Registration.CRATE_COMMON.get();
        ResourceLocation top = modLoc("block/crate_common_top");
        ResourceLocation side = modLoc("block/crate_common_side");
        ResourceLocation bottom = modLoc("block/crate_bottom");
        simpleBlock(block, models().cube(block.getRegistryName().getPath(), bottom, top, side, side, side, side));
    }

    private void registerCrateGood() {
        Block block = Registration.CRATE_GOOD.get();
        ResourceLocation top = modLoc("block/crate_good_top");
        ResourceLocation side = modLoc("block/crate_good_side");
        ResourceLocation bottom = modLoc("block/crate_bottom");
        simpleBlock(block, models().cube(block.getRegistryName().getPath(), bottom, top, side, side, side, side));
    }

    private void registerCrateRare() {
        Block block = Registration.CRATE_RARE.get();
        ResourceLocation top = modLoc("block/crate_rare_top");
        ResourceLocation side = modLoc("block/crate_rare_side");
        ResourceLocation bottom = modLoc("block/crate_bottom");
        simpleBlock(block, models().cube(block.getRegistryName().getPath(), bottom, top, side, side, side, side));
    }

    private void registerCrateEpic() {
        Block block = Registration.CRATE_EPIC.get();
        ResourceLocation top = modLoc("block/crate_epic_top");
        ResourceLocation side = modLoc("block/crate_epic_side");
        ResourceLocation bottom = modLoc("block/crate_bottom");
        simpleBlock(block, models().cube(block.getRegistryName().getPath(), bottom, top, side, side, side, side));
    }

    private void registerCrateLegendary() {
        Block block = Registration.CRATE_LEGENDARY.get();
        ResourceLocation top = modLoc("block/crate_legendary_top");
        ResourceLocation side = modLoc("block/crate_legendary_side");
        ResourceLocation bottom = modLoc("block/crate_bottom");
        simpleBlock(block, models().cube(block.getRegistryName().getPath(), bottom, top, side, side, side, side));
    }
}
