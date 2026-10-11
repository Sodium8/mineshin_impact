package com.sodium.mineshinImpact.event;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.ServerChatEvent;
import net.neoforged.neoforge.event.level.ChunkEvent;
import net.neoforged.neoforge.event.tick.ServerTickEvent;
import org.joml.Vector3d;

import java.util.Objects;

public class ModEvents {

    @SubscribeEvent
    public static void onServerTick(ServerTickEvent.Post event) {

    }

    @SubscribeEvent
    public static void onChunkLoad(ChunkEvent.Load event) {

    }

}
