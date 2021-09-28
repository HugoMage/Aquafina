package com.hugomage.aquafina.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.extensions.IForgeBlock;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class StuffedPiranha extends Block implements IWaterLoggable, IForgeBlock
{
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    protected static final VoxelShape SHAPE_N = Stream.of(
            Block.box(7, 1, 8, 9, 2, 9),
            Block.box(6, 0, 6, 10, 1, 11),
            Block.box(7, 2, 6, 9, 7, 12),
            Block.box(9, 3, 8, 9, 4, 10),
            Block.box(7, 3, 8, 7, 4, 10),
            Block.box(8, 7, 9, 8, 8, 11),
            Block.box(8, 1, 10, 8, 3, 13),
            Block.box(8, 3, 12, 8, 6, 15),
            Block.box(7, 2, 5, 9, 4, 6)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();
    protected static final VoxelShape SHAPE_W =Stream.of(
            Block.box(8, 1, 8, 9, 2, 10),
            Block.box(6, 0, 7, 11, 1, 11),
            Block.box(5, 2, 8, 11, 7, 10),
            Block.box(6.541196100146195, 3, 7.693437035123624, 8.541196100146195, 4, 7.693437035123624),
            Block.box(6.5411961001461965, 3, 10.306562964876376, 8.541196100146196, 4, 10.306562964876376),
            Block.box(6, 7, 9, 8, 8, 9),
            Block.box(4, 1, 9, 7, 3, 9),
            Block.box(2, 3, 9, 5, 6, 9),
            Block.box(11, 2, 8, 12, 4, 10)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();
    protected static final VoxelShape SHAPE_S = Stream.of(
            Block.box(7, 1, 9, 9, 2, 10),
            Block.box(6, 0, 7, 10, 1, 12),
            Block.box(7, 2, 6, 9, 7, 12),
            Block.box(9.306562964876376, 3, 7.541196100146195, 9.306562964876376, 4, 9.541196100146195),
            Block.box(6.693437035123624, 3, 7.5411961001461965, 6.693437035123624, 4, 9.541196100146196),
            Block.box(8, 7, 7, 8, 8, 9),
            Block.box(8, 1, 5, 8, 3, 8),
            Block.box(8, 3, 3, 8, 6, 6),
            Block.box(7, 2, 12, 9, 4, 13)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();
    protected static final VoxelShape SHAPE_E = Stream.of(
            Block.box(7, 1, 8, 8, 2, 10),
            Block.box(5, 0, 7, 10, 1, 11),
            Block.box(5, 2, 8, 11, 7, 10),
            Block.box(7.458803899853805, 3, 10.306562964876376, 9.458803899853805, 4, 10.306562964876376),
            Block.box(7.4588038998538035, 3, 7.693437035123624, 9.458803899853804, 4, 7.693437035123624),
            Block.box(8, 7, 9, 10, 8, 9),
            Block.box(9, 1, 9, 12, 3, 9),
            Block.box(11, 3, 9, 14, 6, 9),
            Block.box(4, 2, 8, 5, 4, 10)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();


    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        switch(p_220053_1_.getValue(FACING)) {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case EAST:
                return SHAPE_E;
            case WEST:
                return SHAPE_W;
            default:
                return SHAPE_N;

        }
    }


    public StuffedPiranha() {
        super(Properties.of(Material.WOOL, MaterialColor.COLOR_ORANGE).sound(SoundType.WOOL));
    }
    public BlockState rotate(BlockState p_185499_1_, Rotation p_185499_2_) {
        return p_185499_1_.setValue(FACING, p_185499_2_.rotate(p_185499_1_.getValue(FACING)));
    }

    public BlockState mirror(BlockState p_185471_1_, Mirror p_185471_2_) {
        return p_185471_1_.rotate(p_185471_2_.getRotation(p_185471_1_.getValue(FACING)));
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
        IWorld iworld = p_196258_1_.getLevel();
        BlockPos blockpos = p_196258_1_.getClickedPos();
        boolean flag = iworld.getFluidState(blockpos).getType() == Fluids.WATER;
        return this.defaultBlockState().setValue(WATERLOGGED, Boolean.valueOf(flag)).setValue(FACING, p_196258_1_.getHorizontalDirection());
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add( WATERLOGGED, FACING);
    }
    @Override
    public int getHarvestLevel(BlockState state) {
        return 3;
    }

    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.AXE;
    }
}