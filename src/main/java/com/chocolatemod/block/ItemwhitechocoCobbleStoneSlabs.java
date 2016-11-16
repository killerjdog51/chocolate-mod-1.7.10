package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemwhitechocoCobbleStoneSlabs extends ItemSlab
{
	public ItemwhitechocoCobbleStoneSlabs(Block block) 
	{
		super(block, BlockRegistry.whitechocoCobbleStoneSlabsingle, BlockRegistry.whitechocoCobbleStoneSlabdouble, block == BlockRegistry.whitechocoCobbleStoneSlabdouble);
		this.setUnlocalizedName("killerjdog51.block_whitechocolatecobblestoneslab");
	}
}