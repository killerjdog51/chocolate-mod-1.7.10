package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemdarkchocoCobbleStoneSlabs extends ItemSlab
{
	public ItemdarkchocoCobbleStoneSlabs(Block block) 
	{
		super(block, BlockRegistry.darkchocoCobbleStoneSlabsingle, BlockRegistry.darkchocoCobbleStoneSlabdouble, block == BlockRegistry.darkchocoCobbleStoneSlabdouble);
		this.setUnlocalizedName("killerjdog51.block_darkchocolatecobblestoneslab");
	}
}