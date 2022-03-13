package com.gurken.originmod.datagen;

import com.gurken.originmod.OriginMod;
import com.gurken.originmod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class OgItemTags extends ItemTagsProvider {

    public OgItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, OriginMod.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(Registration.CRATE_FOOD_ITEM.get())
                .add(Registration.CRATE_COMMON_ITEM.get())
                .add(Registration.CRATE_GOOD_ITEM.get())
                .add(Registration.CRATE_RARE_ITEM.get())
                .add(Registration.CRATE_EPIC_ITEM.get())
                .add(Registration.CRATE_LEGENDARY_ITEM.get());

        tag(Registration.SCRAPS)
                .add(Registration.IRON_SCRAPS.get())
                .add(Registration.COPPER_SCRAPS.get())
                .add(Registration.ALUMINIUM_SCRAPS.get())
                .add(Registration.GOLD_SCRAPS.get())
                .add(Registration.PLATINUM_SCRAPS.get())
                .add(Registration.COBALT_SCRAPS.get());
    }

    @Override
    public String getName() {
        return "OriginMod Tags";
    }
}
