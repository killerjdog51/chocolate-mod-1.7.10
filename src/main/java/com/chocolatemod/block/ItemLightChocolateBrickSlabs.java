package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemLightChocolateBrickSlabs extends ItemSlab
{
	public ItemLightChocolateBrickSlabs(Block block) 
	{
		super(block, BlockRegistry.lightchocolatebricksingle, BlockRegistry.lightchocolatebrickdouble, block == BlockRegistry.lightchocolatebrickdouble);
		this.setUnlocalizedName("killerjdog51.block_lightchocolatebrickslab");
	}
}