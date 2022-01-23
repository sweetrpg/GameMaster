package com.sweetrpg.minecraft.gamemaster.common.config;

import com.sweetrpg.minecraft.gamemaster.GameMasterMod;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.commons.lang3.tuple.Pair;

public class Config {

    public static class Common {

        Common(ForgeConfigSpec.Builder builder) {
            builder.comment("Everything to do with gameplay").push("gameplay");

            builder.pop();
        }
    }

    public static class Client {
        Client(ForgeConfigSpec.Builder builder) {
            builder.comment("Client only settings").push("client");


            builder.pop();
        }
    }

    public static final ForgeConfigSpec clientSpec;
    public static final Client CLIENT;

    static {
        final Pair<Client, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Client::new);
        clientSpec = specPair.getRight();
        CLIENT = specPair.getLeft();
    }

    public static final ForgeConfigSpec commonSpec;
    public static final Common COMMON;

    static {
        final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
        commonSpec = specPair.getRight();
        COMMON = specPair.getLeft();
    }


    /** Registers any relevant listeners for config */
    public static void init() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.commonSpec);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.clientSpec);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
//        bus.addListener(Config::configChanged);
    }

    /** Called when config reloaded to update cached settings */
//    private static void configChanged(ModConfig event) {
//        ModConfig config = event.getConfig();
//        if (config.getModId().equals(GameMasterMod.MOD_ID)) {
//            ForgeConfigSpec spec = config.getSpec();
//            if (spec == Config.commonSpec) {
////                TinkerStructures.addStructureSeparation();
//            }
//        }
//    }

}