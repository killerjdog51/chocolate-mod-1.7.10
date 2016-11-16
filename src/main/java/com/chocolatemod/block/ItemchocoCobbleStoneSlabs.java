package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemchocoCobbleStoneSlabs extends ItemSlab
{
	public ItemchocoCobbleStoneSlabs(Block block) 
	{
		super(block, BlockRegistry.chocoCobbleStoneSlabsingle, BlockRegistry.chocoCobbleStoneSlabdouble, block == BlockRegistry.chocoCobbleStoneSlabdouble);
		this.setUnlocalizedName("killerjdog51.block_chocolatecobblestoneslab");
	}
}