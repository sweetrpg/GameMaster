package com.sweetrpg.minecraft.gamemaster.util;

import com.sweetrpg.minecraft.gamemaster.Constants;
import com.sweetrpg.minecraft.gamemaster.GameMaster;
import net.minecraft.resources.ResourceLocation;
import org.checkerframework.checker.nullness.qual.NonNull;

import javax.annotation.Nonnull;

public class Utils {

    @NonNull
    public static ResourceLocation modResLoc(String name) {
        return new ResourceLocation(GameMaster.MOD_ID, name);
    }

    @NonNull
    public static String modResLocStr(String name) {
        return modResLoc(name).toString();
    }

    @NonNull
    public static ResourceLocation mcResLoc(String name) {
        return new ResourceLocation(Constants.MINECRAFT_ID, name);
    }

    @NonNull
    public static String mcResLocStr(String name) {
        return mcResLoc(name).toString();
    }

}
