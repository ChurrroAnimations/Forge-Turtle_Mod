package net.churro.turtlemod.block;

import net.churro.turtlemod.TurtleMod;
import net.churro.turtlemod.block.block_entites.owoBlock;
import net.churro.turtlemod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TurtleMod.MOD_ID);

    public static final RegistryObject<Block> TORTOISESCUTEBLOCK =
            registerBlock(
                    "tortoise_scute_block",
                    () -> new Block(BlockBehaviour.Properties
                            .copy(Blocks.BONE_BLOCK)
                            .requiresCorrectToolForDrops()
                    )
            );
    public static final RegistryObject<Block> TORTOISESCUTEBRICKS =
            registerBlock(
                    "tortoise_scute_bricks",
                    () -> new Block(BlockBehaviour.Properties
                            .copy(Blocks.BONE_BLOCK)
                            .requiresCorrectToolForDrops()
                    )
            );
    public static final RegistryObject<Block> TURTLESCUTEBLOCK =
            registerBlock(
                    "turtle_scute_block",
                    () -> new Block(BlockBehaviour.Properties
                            .copy(Blocks.BONE_BLOCK)
                            .requiresCorrectToolForDrops()
                    )
            );
    public static final RegistryObject<Block> TURTLESCUTEBRICKS =
            registerBlock(
                    "turtle_scute_bricks",
                    () -> new Block(BlockBehaviour.Properties
                            .copy(Blocks.BONE_BLOCK)
                            .requiresCorrectToolForDrops()
                    )
            );
    public static final RegistryObject<Block> OWOFACEBLOCK =
            registerBlock(
                    "owo",
                    () -> new owoBlock(BlockBehaviour.Properties
                            .copy(Blocks.BONE_BLOCK)
                            .requiresCorrectToolForDrops())
            );


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(
                name,
                () -> new BlockItem(block.get(), new Item.Properties())
        );
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}