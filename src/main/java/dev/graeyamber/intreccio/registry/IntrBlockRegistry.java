package dev.graeyamber.intreccio.registry;

import dev.graeyamber.intreccio.Intreccio;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class IntrBlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Intreccio.MOD_ID);

    public static final DeferredBlock<Block> SAPPHIRE_BLOCK = regSimpleBlockWithItem("sapphire_block", BlockBehaviour.Properties.of());
    public static final DeferredBlock<Block> SAPPHIRE_DEEPSLATE_ORE = regSimpleBlockWithItem("sapphire_deepslate_ore", BlockBehaviour.Properties.of());
    public static final DeferredBlock<Block> SAPPHIRE_ORE = regSimpleBlockWithItem("sapphire_ore", BlockBehaviour.Properties.of());

    private static DeferredBlock<Block> regSimpleBlockWithItem(String name, BlockBehaviour.Properties properties) {
        DeferredBlock<Block> block = BLOCKS.registerSimpleBlock(name, properties);

        IntrItemRegistry.ITEMS.registerSimpleBlockItem(name, block);
        return block;
    }
}
