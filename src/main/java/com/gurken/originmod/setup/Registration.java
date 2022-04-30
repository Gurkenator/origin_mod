package com.gurken.originmod.setup;

import com.gurken.originmod.OriginMod;
import com.gurken.originmod.block.custom.SkeletonBlock;
import com.gurken.originmod.block.entity.custom.SkeletonBlockEntity;
import com.gurken.originmod.item.custom.BloodSwordItem;
import com.gurken.originmod.item.custom.GamblerSwordItem;
import com.gurken.originmod.item.custom.SpeedSwordItem;
import com.gurken.originmod.screen.SkeletonMenu;
import com.gurken.originmod.varia.OgModTiers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.gurken.originmod.OriginMod.MODID;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MODID);
    private static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, MODID);
    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, MODID);
    private static final DeferredRegister<StructureFeature<?>> STRUCTURES = DeferredRegister.create(ForgeRegistries.STRUCTURE_FEATURES, MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITIES.register(bus);
        CONTAINERS.register(bus);
        ENTITIES.register(bus);
        STRUCTURES.register(bus);
        MENUS.register(bus);
    }

    public static final BlockBehaviour.Properties CRATE_PROPERTIES = BlockBehaviour.Properties.of(Material.WOOD).strength(2f);
    public static final BlockBehaviour.Properties SCRAP_PROPERTIES = BlockBehaviour.Properties.of(Material.METAL).strength(1f);
    public static final BlockBehaviour.Properties SCORCHSTONE_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(4f);
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

    public static final RegistryObject<Block> SCRAP_BLOCK = BLOCKS.register("scrap_block", () -> new Block(SCRAP_PROPERTIES));
    public static final RegistryObject<Item> SCRAP_BLOCK_ITEM = fromBlock(SCRAP_BLOCK);
    public static final RegistryObject<Block> TIRE = BLOCKS.register("tire", () -> new Block(SCRAP_PROPERTIES));
    public static final RegistryObject<Item> TIRE_ITEM = fromBlock(TIRE);

    public static final RegistryObject<Block> SCORCHSTONE = BLOCKS.register("scorchstone", () -> new Block(SCORCHSTONE_PROPERTIES));
    public static final RegistryObject<Item> SCORCHSTONE_ITEM = fromBlock(SCORCHSTONE);
    public static final RegistryObject<Block> SKELETON_BLOCK = BLOCKS.register("skeleton_block", () -> new Block(SCORCHSTONE_PROPERTIES));
    public static final RegistryObject<Item> SKELETON_BLOCK_ITEM = fromBlock(SKELETON_BLOCK);

    public static final RegistryObject<BlockEntityType<SkeletonBlockEntity>> SKELETON_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("skeleton_block_entity", () ->
                    BlockEntityType.Builder.of(SkeletonBlockEntity::new,
                            Registration.SKELETON_BLOCK.get()).build(null));

    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.CONTAINERS, OriginMod.MODID);

    /*
    public static final RegistryObject<MenuType<SkeletonMenu>> SKELETON_MENU = CONTAINERS.register("skeleton_menu",
            () -> IForgeMenuType.create((windowId, inv, data) -> new SkeletonMenu(windowId, data.readBlockPos(), inv, inv.player)));
    */

    public static final RegistryObject<MenuType<SkeletonMenu>> SKELETON_MENU =
            registerMenuType(SkeletonMenu::new, "skeleton_menu");

    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory,
                                                                                                 String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    /*
    *public static final RegistryObject<SkeletonBlock> SKELETON = BLOCKS.register("SkeletonBlock", SkeletonBlock::new);
    *public static final RegistryObject<Item> SKELETON_ITEM = fromBlock(SKELETON);
    *public static final RegistryObject<BlockEntityType<SkeletonBlockEntity>> SKELETON_BLOCK_ENTITY = BLOCK_ENTITIES.register("skeleton", () -> BlockEntityType).Builder.of(SkeletonBlockEntity::new, SKELETON.get()).build(null));
    *public static final RegistryObject<MenuType<SkeletonBlockContainer>> SKELETON_CONTAINER = CONTAINERS.register("skeleton",
            () -> IForgeMenuType.create((windowId, inv, data) -> new SkeletonBlockContainer(windowId, data.readBlockPos(), inv, inv.player)));
    */

    /*
    public static final RegistryObject<Block> SKELETON_BLOCK = BLOCKS.register("skeleton",
            () -> new SkeletonBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).noOcclusion()));
    public static final RegistryObject<Item> SKELETON_BLOCK_ITEM = fromBlock(SKELETON_BLOCK);
    */
    public static final RegistryObject<Item> ROTTEN_WOOD = ITEMS.register("rotten_wood", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> CANNED_VEGETABLES = ITEMS.register("canned_vegetables", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> IRON_SCRAPS = ITEMS.register("iron_scraps", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COPPER_SCRAPS = ITEMS.register("copper_scraps", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> ALUMINIUM_SCRAPS = ITEMS.register("aluminium_scraps", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> GOLD_SCRAPS = ITEMS.register("gold_scraps", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_SCRAPS = ITEMS.register("platinum_scraps", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COBALT_SCRAPS = ITEMS.register("cobalt_scraps", () -> new Item(ITEM_PROPERTIES));

    public static final RegistryObject<Item> RAIDER_SWORD = ITEMS.register("raider_sword",
            () -> new SwordItem(OgModTiers.RAIDER_1, 4, -2.6f,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> RAIDER_AXE = ITEMS.register("raider_axe",
            () -> new SwordItem(OgModTiers.RAIDER_1, 4, -2.6f,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> LUNATIC_SWORD = ITEMS.register("lunatic_sword",
            () -> new SwordItem(OgModTiers.LUNATIC_1, 4, -3.2f,  ITEM_PROPERTIES));

    public static final RegistryObject<Item> SPEED_SWORD = ITEMS.register("speed_sword",
            () -> new SpeedSwordItem(OgModTiers.RELIC_1, 4, -2.0f,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> BLOOD_SWORD = ITEMS.register("blood_sword",
            () -> new BloodSwordItem(OgModTiers.RELIC_2, 4, -2.0f,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> GAMBLER_SWORD = ITEMS.register("gambler_sword",
            () -> new GamblerSwordItem(OgModTiers.UNIQUE_1, 4, -2.0f,  ITEM_PROPERTIES));

    public static final RegistryObject<Item> KNIFE_SWORD = ITEMS.register("knife_sword",
            () -> new SwordItem(OgModTiers.KNIFE, 1, -2.0f,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> BROKEN_SWORD = ITEMS.register("broken_sword",
            () -> new SwordItem(OgModTiers.BROKEN, 1, -2.0f,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> BAT_SWORD = ITEMS.register("bat_sword",
            () -> new SwordItem(OgModTiers.BAT, 1, -2.0f,  ITEM_PROPERTIES));

    public static final Tags.IOptionalNamedTag<Block> CRATE = BlockTags.createOptional(new ResourceLocation(OriginMod.MODID, "crate"));
    public static final Tags.IOptionalNamedTag<Item> SCRAPS = ItemTags.createOptional(new ResourceLocation(OriginMod.MODID, "scraps"));

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));

    }
}
