package com.gurken.originmod.setup;

import com.gurken.originmod.OriginMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.gurken.originmod.OriginMod.MODID;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

    //common properties
    public static final BlockBehaviour.Properties CRATE_PROPERTIES = BlockBehaviour.Properties.of(Material.WOOD).strength(2f);
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);

    public static final RegistryObject<Block> CRATE_FOOD = BLOCKS.register("crate_food", () -> new Block(CRATE_PROPERTIES));
    public static final RegistryObject<Item> CRATE_FOOD_ITEM = fromBlock(CRATE_FOOD);
    public static final RegistryObject<Block> CRATE_COMMON = BLOCKS.register("crate_common", () -> new Block(CRATE_PROPERTIES));
    public static final RegistryObject<Item> CRATE_COMMON_ITEM = fromBlock(CRATE_COMMON);
    public static final RegistryObject<Block> CRATE_GOOD = BLOCKS.register("crate_good", () -> new Block(CRATE_PROPERTIES));
    public static final RegistryObject<Item> CRATE_GOOD_ITEM = fromBlock(CRATE_GOOD);
    public static final RegistryObject<Block> CRATE_RARE = BLOCKS.register("crate_rare", () -> new Block(CRATE_PROPERTIES));
    public static final RegistryObject<Item> CRATE_RARE_ITEM = fromBlock(CRATE_RARE);
    public static final RegistryObject<Block> CRATE_EPIC = BLOCKS.register("crate_epic", () -> new Block(CRATE_PROPERTIES));
    public static final RegistryObject<Item> CRATE_EPIC_ITEM = fromBlock(CRATE_EPIC);
    public static final RegistryObject<Block> CRATE_LEGENDARY = BLOCKS.register("crate_legendary", () -> new Block(CRATE_PROPERTIES));
    public static final RegistryObject<Item> CRATE_LEGENDARY_ITEM = fromBlock(CRATE_LEGENDARY);

    public static final RegistryObject<Item> ROTTEN_WOOD = ITEMS.register("rotten_wood", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> CANNED_VEGETABLES = ITEMS.register("canned_vegetables", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> IRON_SCRAPS = ITEMS.register("iron_scraps", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COPPER_SCRAPS = ITEMS.register("copper_scraps", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> ALUMINIUM_SCRAPS = ITEMS.register("aluminium_scraps", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> GOLD_SCRAPS = ITEMS.register("gold_scraps", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_SCRAPS = ITEMS.register("platinum_scraps", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COBALT_SCRAPS = ITEMS.register("cobalt_scraps", () -> new Item(ITEM_PROPERTIES));

    public static final Tags.IOptionalNamedTag<Block> CRATE = BlockTags.createOptional(new ResourceLocation(OriginMod.MODID, "crate"));
    public static final Tags.IOptionalNamedTag<Item> SCRAPS = ItemTags.createOptional(new ResourceLocation(OriginMod.MODID, "scraps"));

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
