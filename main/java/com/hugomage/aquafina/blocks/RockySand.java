package com.hugomage.aquafina.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.extensions.IForgeBlock;

public class RockySand extends Block implements IForgeBlock
{
    public RockySand() {
        super(Properties.of(Material.STONE, MaterialColor.SAND).strength(0.6F).sound(SoundType.SAND));
    }



    @Override
    public int getHarvestLevel(BlockState state) {
        return 1;
    }

    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.PICKAXE;
    }
}
