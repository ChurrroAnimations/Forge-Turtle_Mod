package net.churro.turtlemod.item;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class StaffOfOwO extends Item {
    public StaffOfOwO(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        BlockPos newOwOpos = pContext.getClickedPos().relative(pContext.getClickedFace());
        if (level.getBlockState(newOwOpos).isAir()) {
            level.setBlock(newOwOpos, Blocks.ANVIL.defaultBlockState(), 3);

            return InteractionResult.SUCCESS;
        }

        return InteractionResult.FAIL;
    }
}
