package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemCaramelSmallBrickSlabs extends ItemSlab
{
	public ItemCaramelSmallBrickSlabs(Block block) 
	{
		super(block, BlockRegistry.caramelSmallBrickSlabsingle, BlockRegistry.caramelSmallBrickSlabdouble, block == BlockRegistry.caramelSmallBrickSlabdouble);
		this.setUnlocalizedName("killerjdog51.block_caramelsmallbrickslab");
	}
}