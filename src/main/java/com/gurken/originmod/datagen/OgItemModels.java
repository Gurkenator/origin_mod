package com.gurken.originmod.datagen;

import com.gurken.originmod.OriginMod;
import com.gurken.originmod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class OgItemModels extends ItemModelProvider {

    public OgItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, OriginMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.CRATE_FOOD_ITEM.get().getRegistryName().getPath(), modLoc("block/crate_food"));
        withExistingParent(Registration.CRATE_COMMON_ITEM.get().getRegistryName().getPath(), modLoc("block/crate_common"));
        withExistingParent(Registration.CRATE_GOOD_ITEM.get().getRegistryName().getPath(), modLoc("block/crate_good"));
        withExistingParent(Registration.CRATE_RARE_ITEM.get().getRegistryName().getPath(), modLoc("block/crate_rare"));
        withExistingParent(Registration.CRATE_EPIC_ITEM.get().getRegistryName().getPath(), modLoc("block/crate_epic"));
        withExistingParent(Registration.CRATE_LEGENDARY_ITEM.get().getRegistryName().getPath(), modLoc("block/crate_legendary"));

        withExistingParent(Registration.SCRAP_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/scrap_block"));
        withExistingParent(Registration.TIRE_ITEM.get().getRegistryName().getPath(), modLoc("block/tire"));
        withExistingParent(Registration.SCORCHSTONE_ITEM.get().getRegistryName().getPath(), modLoc("block/scorchstone"));
        withExistingParent(Registration.SKELETON_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/skeleton_block"));

        singleTexture(Registration.ROTTEN_WOOD.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/rotten_wood"));
        singleTexture(Registration.CANNED_VEGETABLES.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/canned_vegetables"));
        singleTexture(Registration.IRON_SCRAPS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/iron_scraps"));
        singleTexture(Registration.COPPER_SCRAPS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/copper_scraps"));
        singleTexture(Registration.ALUMINIUM_SCRAPS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/aluminium_scraps"));
        singleTexture(Registration.GOLD_SCRAPS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/gold_scraps"));
        singleTexture(Registration.PLATINUM_SCRAPS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinum_scraps"));
        singleTexture(Registration.COBALT_SCRAPS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/cobalt_scraps"));

        singleTexture(Registration.RAIDER_SWORD.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/raider_sword"));
        singleTexture(Registration.RAIDER_AXE.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/raider_axe"));
        singleTexture(Registration.LUNATIC_SWORD.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/lunatic_sword"));
        singleTexture(Registration.SPEED_SWORD.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/speed_sword"));
        singleTexture(Registration.BLOOD_SWORD.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/blood_sword"));
        singleTexture(Registration.GAMBLER_SWORD.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/gambler_sword"));
        singleTexture(Registration.KNIFE_SWORD.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/knife_sword"));
        singleTexture(Registration.BROKEN_SWORD.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/broken_sword"));
        singleTexture(Registration.BAT_SWORD.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/bat_sword"));
    }
}
