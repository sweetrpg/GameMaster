package com.sweetrpg.minecraft.gamemaster.network;

import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class PacketOpenGUI {

    public boolean handle(Supplier<NetworkEvent.Context> ctx) {
//        ctx.get().enqueueWork(SpawnerScreen::open);
        return true;
    }

}