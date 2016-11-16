package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemLightChocolatePlankSlabs extends ItemSlab
{
	public ItemLightChocolatePlankSlabs(Block block) 
	{
		super(block, BlockRegistry.lightChocolatePlankSlabsingle, BlockRegistry.lightChocolatePlankSlabdouble, block == BlockRegistry.lightChocolatePlankSlabdouble);
		this.setUnlocalizedName("killerjdog51.block_lightchocolateplankslab");
	}
}