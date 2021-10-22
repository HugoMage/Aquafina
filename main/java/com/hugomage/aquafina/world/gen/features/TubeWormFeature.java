package com.hugomage.aquafina.world.gen.features;

import com.hugomage.aquafina.util.RegistryHandler;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.KelpTopBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureSpreadConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.ProbabilityConfig;

import java.util.Random;

public class TubeWormFeature extends Feature<ProbabilityConfig> {
    public TubeWormFeature(Codec<ProbabilityConfig> p_i231967_1_) {
        super(p_i231967_1_);
    }

    @Override
    public boolean place(ISeedReader p_241855_1_, ChunkGenerator p_241855_2_, Random p_241855_3_, BlockPos p_241855_4_, ProbabilityConfig p_241855_5_) {
        int i = 0;
        int j = p_241855_1_.getHeight(Heightmap.Type.OCEAN_FLOOR, p_241855_4_.getX(), p_241855_4_.getZ());
        BlockPos blockpos = new BlockPos(p_241855_4_.getX(), j, p_241855_4_.getZ());
        if (p_241855_1_.getBlockState(blockpos).is(Blocks.WATER)) {
            BlockState blockstate = RegistryHandler.TUBE.get().defaultBlockState();
            BlockState blockstate1 = RegistryHandler.TUBE_PLANT.get().defaultBlockState();
            int k = 1 + p_241855_3_.nextInt(10);

            for(int l = 0; l <= k; ++l) {
                if (p_241855_1_.getBlockState(blockpos).is(Blocks.WATER) && p_241855_1_.getBlockState(blockpos.above()).is(Blocks.WATER) && blockstate1.canSurvive(p_241855_1_, blockpos)) {
                    if (l == k) {
                        p_241855_1_.setBlock(blockpos, blockstate.setValue(KelpTopBlock.AGE, Integer.valueOf(p_241855_3_.nextInt(4) + 20)), 2);
                        ++i;
                    } else {
                        p_241855_1_.setBlock(blockpos, blockstate1, 2);
                    }
                } else if (l > 0) {
                    BlockPos blockpos1 = blockpos.below();
                    if (blockstate.canSurvive(p_241855_1_, blockpos1) && !p_241855_1_.getBlockState(blockpos1.below()).is(Blocks.KELP)) {
                        p_241855_1_.setBlock(blockpos1, blockstate.setValue(KelpTopBlock.AGE, Integer.valueOf(p_241855_3_.nextInt(4) + 20)), 2);
                        ++i;
                    }
                    break;
                }

                blockpos = blockpos.above();
            }
        }

        return i > 0;
    }


}
