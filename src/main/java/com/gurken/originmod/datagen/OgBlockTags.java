package com.gurken.originmod.datagen;

import com.gurken.originmod.OriginMod;
import com.gurken.originmod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class OgBlockTags extends BlockTagsProvider {

    public OgBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, OriginMod.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(Registration.CRATE_FOOD.get())
                .add(Registration.CRATE_COMMON.get())
                .add(Registration.CRATE_GOOD.get())
                .add(Registration.CRATE_RARE.get())
                .add(Registration.CRATE_EPIC.get())
                .add(Registration.CRATE_LEGENDARY.get());

        tag(Registration.CRATE)
                .add(Registration.CRATE_FOOD.get())
                .add(Registration.CRATE_COMMON.get())
                .add(Registration.CRATE_GOOD.get())
                .add(Registration.CRATE_RARE.get())
                .add(Registration.CRATE_EPIC.get())
                .add(Registration.CRATE_LEGENDARY.get());
    }

    @Override
    public String getName() {
        return "OriginMod Tags";
    }
}
