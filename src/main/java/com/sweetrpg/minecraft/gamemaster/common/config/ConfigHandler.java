package com.sweetrpg.minecraft.gamemaster.common.config;

import com.sweetrpg.catherder.CatHerder;
import com.sweetrpg.catherder.api.CatHerderAPI;
import com.sweetrpg.catherder.api.registry.Talent;
import com.sweetrpg.catherder.common.lib.Constants;
import com.sweetrpg.minecraft.gamemaster.GameMaster;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;
import java.util.Map;

public class ConfigHandler {

    public static ClientConfig CLIENT;
    public static ServerConfig SERVER;
    private static ForgeConfigSpec CONFIG_SERVER_SPEC;
    private static ForgeConfigSpec CONFIG_CLIENT_SPEC;

    public static void init(IEventBus modEventBus) {
        Pair<ServerConfig, ForgeConfigSpec> commonPair = new ForgeConfigSpec.Builder().configure(ServerConfig::new);
        CONFIG_SERVER_SPEC = commonPair.getRight();
        SERVER = commonPair.getLeft();
        Pair<ClientConfig, ForgeConfigSpec> clientPair = new ForgeConfigSpec.Builder().configure(ClientConfig::new);
        CONFIG_CLIENT_SPEC = clientPair.getRight();
        CLIENT = clientPair.getLeft();
        GameMaster.LOGGER.debug("Register configs");

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, CONFIG_SERVER_SPEC);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CONFIG_CLIENT_SPEC);
    }

    public static class ClientConfig {


        public ClientConfig(ForgeConfigSpec.Builder builder) {
            {
                builder.push("General");

//                SKITTISH_OWNER = builder.comment("Sets the likelihood (in percent) that a skittish cat will avoid its owner.").translation("catherder.config.client.skittish_owner").defineInRange("skittish_owner", 25, 1, 100);
//                SKITTISH_ANIMALS = builder.comment("Sets the likelihood (in percent) that a skittish cat will avoid other animals.").translation("catherder.config.client.skittish_animals").defineInRange("skittish_animals", 40, 1, 100);
//                SKITTISH_OTHERS = builder.comment("Sets the likelihood (in percent) that a skittish cat will avoid any other creature.").translation("catherder.config.client.skittish_others").defineInRange("skittish_others", 75, 1, 100);
//                SKITTISH_TWITCHINESS = builder.comment("Sets how sensitive the check for fleeing from an entity is.").translation("catherder.config.client.skittish_twitchiness").defineInRange("skittish_twitchiness", 750, 1, 1000);

                builder.pop();
            }
        }
    }

    public static class ServerConfig {

        public ServerConfig(ForgeConfigSpec.Builder builder) {
            {
                builder.push("General");

                //DEBUG_MODE = builder
                //        .comment("Enables debugging mode, which would output values for the sake of finding issues in the mod.")
                //        .define("debugMode", false);
//                CHANCE_WILD_CATNIP = builder.comment("Chance that catnip appears in the wild").translation(Constants.TRANSLATION_KEY_CONFIG_CHANCE_WILD_CATNIP).defineInRange("chance_wild_catnip", 50, 1, 100);
//                WILD_CATNIP_SPREAD = builder.comment("Horizontal spread of patches of catnip").translation(Constants.TRANSLATION_KEY_CONFIG_WILD_CATNIP_SPREAD).defineInRange("wild_catnip_spread", 6, 1, 20);

                builder.pop();
            }

        }
    }

}
