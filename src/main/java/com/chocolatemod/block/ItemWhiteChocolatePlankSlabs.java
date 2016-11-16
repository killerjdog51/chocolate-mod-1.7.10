package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemWhiteChocolatePlankSlabs extends ItemSlab
{
	public ItemWhiteChocolatePlankSlabs(Block block) 
	{
		super(block, BlockRegistry.whiteChocolatePlankSlabsingle, BlockRegistry.whiteChocolatePlankSlabdouble, block == BlockRegistry.whiteChocolatePlankSlabdouble);
		this.setUnlocalizedName("killerjdog51.block_whitechocolateplankslab");
	}
}