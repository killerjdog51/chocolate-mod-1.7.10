package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemdarkchocoSmoothSandStoneSlabs extends ItemSlab
{
	public ItemdarkchocoSmoothSandStoneSlabs(Block block) 
	{
		super(block, BlockRegistry.darkchocoSmoothSandStoneSlabsingle, BlockRegistry.darkchocoSmoothSandStoneSlabdouble, block == BlockRegistry.darkchocoSmoothSandStoneSlabdouble);
		this.setUnlocalizedName("killerjdog51.block_darkchocolatesmoothsandstoneslab");
	}
}