package com.gurken.originmod.varia;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

import java.util.function.Function;

public class OgModTiers {

    public static final ForgeTier RAIDER_1 = new ForgeTier(3, 1000, 1.5f,
            3f, 7, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.EMPTY);

    public static final ForgeTier LUNATIC_1 = new ForgeTier(3, 825, 1.5f,
            5f, 11, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.EMPTY);

    public static final ForgeTier RELIC_1 = new ForgeTier(3, 825, 1.5f,
            5f, 11, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.EMPTY);
    public static final ForgeTier RELIC_2 = new ForgeTier(3, 825, 1.5f,
            5f, 11, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.EMPTY);
    public static final ForgeTier UNIQUE_1 = new ForgeTier(3, 825, 1.5f,
            5f, 11, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.EMPTY);

    public static final ForgeTier KNIFE = new ForgeTier(3, 72, 1.5f,
            1f, 8, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.EMPTY);
    public static final ForgeTier BROKEN = new ForgeTier(3, 12, 1.5f,
            0f, 8, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.EMPTY);
    public static final ForgeTier BAT = new ForgeTier(1, 24, 1.5f,
            2f, 8, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.EMPTY);
}