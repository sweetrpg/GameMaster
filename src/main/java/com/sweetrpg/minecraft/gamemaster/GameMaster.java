package com.sweetrpg.minecraft.gamemaster;

import com.sweetrpg.minecraft.gamemaster.common.config.ConfigHandler;
import com.sweetrpg.minecraft.gamemaster.common.lib.Constants;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Constants.MOD_ID)
public class GameMaster {

    public static final Logger LOGGER = LogManager.getLogger();

    public GameMaster() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();






        ConfigHandler.init(modEventBus);
    }

}
