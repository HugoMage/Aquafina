package com.hugomage.aquafina.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.lighting.LightEngine;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.extensions.IForgeBlock;

import java.util.Random;

public class SeaWeedBlock extends Block implements IGrowable
{
    public SeaWeedBlock() {
        super(Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5F).sound(SoundType.SAND));
    }
    private static boolean canBeSand(BlockState p_235516_0_, IWorldReader p_235516_1_, BlockPos p_235516_2_) {
        BlockPos blockpos = p_235516_2_.above();
        BlockState blockstate = p_235516_1_.getBlockState(blockpos);
        int i = LightEngine.getLightBlockInto(p_235516_1_, p_235516_0_, p_235516_2_, blockstate, blockpos, Direction.UP, blockstate.getLightBlock(p_235516_1_, blockpos));
        return i < p_235516_1_.getMaxLightLevel();
    }


    @Override
    public int getHarvestLevel(BlockState state) {
        return 0;
    }

    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.SHOVEL;
    }


    public void randomTick(BlockState p_225542_1_, ServerWorld p_225542_2_, BlockPos p_225542_3_, Random p_225542_4_) {
        if (!canBeSand(p_225542_1_, p_225542_2_, p_225542_3_)) {
            p_225542_2_.setBlockAndUpdate(p_225542_3_, Blocks.SAND.defaultBlockState());
        }

    }

    @Override
    public boolean isValidBonemealTarget(IBlockReader p_176473_1_, BlockPos p_176473_2_, BlockState p_176473_3_, boolean p_176473_4_) {
        return p_176473_1_.getBlockState(p_176473_2_.above()).isAir();
    }

    @Override
    public boolean isBonemealSuccess(World p_180670_1_, Random p_180670_2_, BlockPos p_180670_3_, BlockState p_180670_4_) {
        return true;
    }

    @Override
    public void performBonemeal(ServerWorld p_225535_1_, Random p_225535_2_, BlockPos p_225535_3_, BlockState p_225535_4_) {

    }
}
