package com.sweetrpg.minecraft.gamemaster.init;

import com.sweetrpg.minecraft.gamemaster.GameMaster;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.google.common.base.Supplier;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GameMaster.MOD_ID);

    public static final RegistryObject<Item> SCEPTER_ITEM = register("gm_scepter", () -> new Item(new Item.Properties().tab(GameMaster.GAMEMASTER_TAB)));
    public static final RegistryObject<Item> USURPER_ITEM = register("gm_usurper", () -> new Item(new Item.Properties().tab(GameMaster.GAMEMASTER_TAB)));
    public static final RegistryObject<Item> ROD_ITEM = register("player_rod", () -> new Item(new Item.Properties().tab(GameMaster.GAMEMASTER_TAB)));

    private static <T extends Item>RegistryObject<T> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }
}
