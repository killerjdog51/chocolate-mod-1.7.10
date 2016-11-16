package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemCaramelBrickSlabs extends ItemSlab
{
	public ItemCaramelBrickSlabs(Block block) 
	{
		super(block, BlockRegistry.caramelBrickSlabsingle, BlockRegistry.caramelBrickSlabdouble, block == BlockRegistry.caramelBrickSlabdouble);
		this.setUnlocalizedName("killerjdog51.block_caramelbrickslab");
	}
}