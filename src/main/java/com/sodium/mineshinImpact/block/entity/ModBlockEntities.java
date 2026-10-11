package com.sodium.mineshinImpact.block.entity;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.sodium.mineshinImpact.MineshinImpact.MODID;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, MODID);

    /*public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RedstoneComputerEntity>> REDSTONE_COMPUTER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("my_block_entity",
                    () -> BlockEntityType.Builder.of(
                            RedstoneComputerEntity::new,
                            ModBlocks.REDSTONE_COMPUTER_BLOCK.get()
                    ).build(null));*/
}