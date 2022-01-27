package com.sweetrpg.minecraft.gamemaster;

import com.sweetrpg.minecraft.gamemaster.init.BlockInit;
import com.sweetrpg.minecraft.gamemaster.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(GameMaster.MOD_ID)
public class GameMaster {

    public static final String MOD_ID = "gamemaster";

    private static final Logger LOGGER = LogManager.getLogger();

    public static final CreativeModeTab GAMEMASTER_TAB = new CreativeModeTab(MOD_ID + "_main") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.SCEPTER_ITEM.get());
        }
    };

    public GameMaster() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

}
