package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemCaramelSlabs extends ItemSlab
{
	public ItemCaramelSlabs(Block block) 
	{
		super(block, BlockRegistry.caramelSlabsingle, BlockRegistry.caramelSlabdouble, block == BlockRegistry.caramelSlabdouble);
		this.setUnlocalizedName("killerjdog51.block_caramelslab");
	}
}