package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemchocoSandStoneSlabs extends ItemSlab
{
	public ItemchocoSandStoneSlabs(Block block) 
	{
		super(block, BlockRegistry.chocoSandStoneSlabsingle, BlockRegistry.chocoSandStoneSlabdouble, block == BlockRegistry.chocoSandStoneSlabdouble);
		this.setUnlocalizedName("killerjdog51.block_chocolatesandstoneslab");
	}
}