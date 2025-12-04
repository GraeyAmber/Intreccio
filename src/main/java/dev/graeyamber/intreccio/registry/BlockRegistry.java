package dev.graeyamber.intreccio.registry;

import dev.graeyamber.intreccio.Intreccio;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Intreccio.MOD_ID);

    public static final DeferredBlock<Block> SAPPHIRE_BLOCK = registerSimpleBlockWithItem("sapphire_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));

    private static DeferredBlock<Block> registerSimpleBlockWithItem(String name, BlockBehaviour.Properties properties) {
        DeferredBlock<Block> block = BLOCKS.registerSimpleBlock(name, properties);

        ItemRegistry.ITEMS.registerSimpleBlockItem(name, block);
        return block;
    }
}
