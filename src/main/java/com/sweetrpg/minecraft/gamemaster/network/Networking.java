package com.sweetrpg.minecraft.gamemaster.network;

import com.sweetrpg.minecraft.gamemaster.GameMaster;
import com.sweetrpg.minecraft.gamemaster.util.Utils;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

public class Networking {

    private static SimpleChannel INSTANCE;
    private static int ID = 0;

    private static int nextID() {
        return ID++;
    }

    public static void registerMessages() {
        INSTANCE = NetworkRegistry.newSimpleChannel(Utils.modResLoc(GameMaster.MOD_ID),
                () -> "1.0",
                s -> true,
                s -> true);

        INSTANCE.messageBuilder(PacketOpenGUI.class, nextID())
                .encoder((packetOpenGui, packetBuffer) -> {})
                .decoder(buf -> new PacketOpenGUI())
                .consumer(PacketOpenGUI::handle)
                .add();
        INSTANCE.messageBuilder(PacketSpawn.class, nextID())
                .encoder(PacketSpawn::toBytes)
                .decoder(PacketSpawn::new)
                .consumer(PacketSpawn::handle)
                .add();
    }

    public static void sendToClient(Object packet, ServerPlayer player) {
        INSTANCE.sendTo(packet, player.connection.connection, NetworkDirection.PLAY_TO_CLIENT);
    }

    public static void sendToServer(Object packet) {
        INSTANCE.sendToServer(packet);
    }
}