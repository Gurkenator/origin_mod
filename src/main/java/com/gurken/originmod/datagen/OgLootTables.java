package com.gurken.originmod.datagen;

import com.gurken.originmod.setup.Registration;
import net.minecraft.data.DataGenerator;

public class OgLootTables extends BaseLootTableProvider {

    public OgLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        lootTables.put(Registration.CRATE_FOOD.get(), createSilkTouchTable("crate_food", Registration.CRATE_FOOD.get(), Registration.CANNED_VEGETABLES.get(), 1, 3));
        lootTables.put(Registration.CRATE_COMMON.get(), createSilkTouchTable("crate_common", Registration.CRATE_COMMON.get(), Registration.IRON_SCRAPS.get(), 1, 3));
        lootTables.put(Registration.CRATE_GOOD.get(), createSilkTouchTable("crate_good", Registration.CRATE_GOOD.get(), Registration.ALUMINIUM_SCRAPS.get(), 1, 3));
        lootTables.put(Registration.CRATE_RARE.get(), createSilkTouchTable("crate_rare", Registration.CRATE_RARE.get(), Registration.GOLD_SCRAPS.get(), 1, 3));
        lootTables.put(Registration.CRATE_EPIC.get(), createSilkTouchTable("crate_epic", Registration.CRATE_EPIC.get(), Registration.PLATINUM_SCRAPS.get(), 1, 3));
        lootTables.put(Registration.CRATE_LEGENDARY.get(), createSilkTouchTable("crate_legendary", Registration.CRATE_LEGENDARY.get(), Registration.COBALT_SCRAPS.get(), 1, 3));
    }
}
