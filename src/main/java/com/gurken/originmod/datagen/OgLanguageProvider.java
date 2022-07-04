package com.gurken.originmod.datagen;

import com.gurken.originmod.OriginMod;
import com.gurken.originmod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.gurken.originmod.setup.ModSetup.TAB_NAME;

public class OgLanguageProvider extends LanguageProvider {

    public OgLanguageProvider(DataGenerator gen, String locale) {
        super(gen, OriginMod.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "Origin Mod");

        add(Registration.CRATE_FOOD.get(), "Crate");
        add(Registration.CRATE_COMMON.get(), "Crate");
        add(Registration.CRATE_GOOD.get(), "Crate");
        add(Registration.CRATE_RARE.get(), "Crate");
        add(Registration.CRATE_EPIC.get(), "Crate");
        add(Registration.CRATE_LEGENDARY.get(), "Crate");

        add(Registration.SCRAP_BLOCK.get(), "Scrap Block");
        add(Registration.TIRE.get(), "Tire");
        add(Registration.SCORCHSTONE.get(), "Scorchstone");
        add(Registration.SKELETON_BLOCK.get(), "Skeleton");

        add(Registration.ROTTEN_WOOD.get(), "Rotten Wood");
        add(Registration.CANNED_VEGETABLES.get(), "Canned Vegetables");
        add(Registration.IRON_SCRAPS.get(), "Iron Scraps");
        add(Registration.COPPER_SCRAPS.get(), "Copper Scraps");
        add(Registration.ALUMINIUM_SCRAPS.get(), "Aluminium Scraps");
        add(Registration.GOLD_SCRAPS.get(), "Gold Scraps");
        add(Registration.PLATINUM_SCRAPS.get(), "Platinum Scraps");
        add(Registration.COBALT_SCRAPS.get(), "Cobalt Scraps");

        add(Registration.RAIDER_SWORD.get(), "Raider Sword");
        add(Registration.RAIDER_AXE.get(), "Raider Battleaxe");
        add(Registration.LUNATIC_SWORD.get(), "Lunatic Chainsword");
        add(Registration.SPEED_SWORD.get(), "Relic Speed Sword");
        add(Registration.BLOOD_SWORD.get(), "Bloody Blade");
        add(Registration.GAMBLER_SWORD.get(), "Gambler's Blade");
        add(Registration.KNIFE_SWORD.get(), "Makeshift Knife");
        add(Registration.BROKEN_SWORD.get(), "Broken Sword");
        add(Registration.BAT_SWORD.get(), "Bat");

        //add(Registration.CAVE_THING_SPAWN_EGG.get(), "Cave Thing Spawn Egg");
    }
}
