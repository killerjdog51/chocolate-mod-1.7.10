package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemChocolatePlankSlabs extends ItemSlab
{
	public ItemChocolatePlankSlabs(Block block) 
	{
		super(block, BlockRegistry.chocolatePlankSlabsingle, BlockRegistry.chocolatePlankSlabdouble, block == BlockRegistry.chocolatePlankSlabdouble);
		this.setUnlocalizedName("killerjdog51.block_chocolateplankslab");
	}
}