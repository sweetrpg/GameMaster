package com.sweetrpg.minecraft.gamemaster.setup;

import com.sweetrpg.minecraft.gamemaster.GameMaster;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.sweetrpg.minecraft.gamemaster.util.Utils.modResLoc;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GameMaster.MOD_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GameMaster.MOD_ID);
    private static final DeferredRegister<BlockEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, GameMaster.MOD_ID);
    private static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, GameMaster.MOD_ID);
    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, GameMaster.MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        TILES.register(FMLJavaModLoadingContext.get().getModEventBus());
        CONTAINERS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> SCEPTER_ITEM = ITEMS.register("gm_scepter", () ->
            new Item(new Item.Properties().tab(ModSetup.GAMEMASTER_TAB).stacksTo(1).setNoRepair().fireResistant().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> USURPER_ITEM = ITEMS.register("gm_usurper", () ->
            new Item(new Item.Properties().tab(ModSetup.GAMEMASTER_TAB).stacksTo(1).durability(1).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> ROD_ITEM = ITEMS.register("player_rod", () ->
            new Item(new Item.Properties().tab(ModSetup.GAMEMASTER_TAB).stacksTo(1).durability(1).rarity(Rarity.RARE)));

    public static final Tags.IOptionalNamedTag<Item> RPG_ITEMS_TAG = ItemTags.createOptional(modResLoc("rpg_tools"));

}