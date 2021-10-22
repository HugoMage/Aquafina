package com.hugomage.aquafina.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.extensions.IForgeBlock;

public class SeaWeedBlock extends Block implements IForgeBlock
{
    public SeaWeedBlock() {
        super(Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5F).sound(SoundType.SAND));
    }



    @Override
    public int getHarvestLevel(BlockState state) {
        return 0;
    }

    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.SHOVEL;
    }
}
