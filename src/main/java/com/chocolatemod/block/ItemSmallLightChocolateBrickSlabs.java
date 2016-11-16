package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemSmallLightChocolateBrickSlabs extends ItemSlab
{
	public ItemSmallLightChocolateBrickSlabs(Block block) 
	{
		super(block, BlockRegistry.smalllightchocolatebricksingle, BlockRegistry.smalllightchocolatebrickdouble, block == BlockRegistry.smalllightchocolatebrickdouble);
		this.setUnlocalizedName("killerjdog51.block_lightchocolatesmallbrickslab");
	}
}