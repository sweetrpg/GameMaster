package com.sweetrpg.minecraft.gamemaster;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(GameMaster.MOD_ID)
public class GameMaster {

    public static final String MOD_ID = "gamemaster";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public GameMaster() {
        MinecraftForge.EVENT_BUS.register(this);
    }

}
