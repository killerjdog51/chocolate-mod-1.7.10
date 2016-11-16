package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemdarkchocoSandStoneSlabs extends ItemSlab
{
	public ItemdarkchocoSandStoneSlabs(Block block) 
	{
		super(block, BlockRegistry.darkchocoSandStoneSlabsingle, BlockRegistry.darkchocoSandStoneSlabdouble, block == BlockRegistry.darkchocoSandStoneSlabdouble);
		this.setUnlocalizedName("killerjdog51.block_darkchocolatesandstoneslab");
	}
}