package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemchocoSmoothSandStoneSlabs extends ItemSlab
{
	public ItemchocoSmoothSandStoneSlabs(Block block) 
	{
		super(block, BlockRegistry.chocoSmoothSandStoneSlabsingle, BlockRegistry.chocoSmoothSandStoneSlabdouble, block == BlockRegistry.chocoSmoothSandStoneSlabdouble);
		this.setUnlocalizedName("killerjdog51.block_chocolatesmoothsandstoneslab");
	}
}