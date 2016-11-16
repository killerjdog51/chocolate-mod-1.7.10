package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemDarkChocolatePlankSlabs extends ItemSlab
{
	public ItemDarkChocolatePlankSlabs(Block block) 
	{
		super(block, BlockRegistry.darkChocolatePlankSlabsingle, BlockRegistry.darkChocolatePlankSlabdouble, block == BlockRegistry.darkChocolatePlankSlabdouble);
		this.setUnlocalizedName("killerjdog51.block_darkchocolateplankslab");
	}
}