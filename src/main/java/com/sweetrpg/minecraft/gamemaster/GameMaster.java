package com.sweetrpg.minecraft.gamemaster;

import com.sweetrpg.minecraft.gamemaster.setup.ClientSetup;
import com.sweetrpg.minecraft.gamemaster.setup.Config;
import com.sweetrpg.minecraft.gamemaster.setup.ModSetup;
import com.sweetrpg.minecraft.gamemaster.setup.Registration;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(GameMaster.MOD_ID)
public class GameMaster {

    public static final String MOD_ID = Constants.MOD_ID;

    private static final Logger LOGGER = LogManager.getLogger();

    public GameMaster() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER_CONFIG);

        Registration.init();

        // Register the setup method for modloading
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ModSetup::init);
        modbus.addListener(ModSetup::onAttributeCreate);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
    }

}
