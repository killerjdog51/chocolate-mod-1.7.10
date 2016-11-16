package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemlightchocoCobbleStoneSlabs extends ItemSlab
{
	public ItemlightchocoCobbleStoneSlabs(Block block) 
	{
		super(block, BlockRegistry.lightchocoCobbleStoneSlabsingle, BlockRegistry.lightchocoCobbleStoneSlabdouble, block == BlockRegistry.lightchocoCobbleStoneSlabdouble);
		this.setUnlocalizedName("killerjdog51.block_lightchocolatecobblestoneslab");
	}
}