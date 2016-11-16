package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemSmallWhiteChocolateBrickSlabs extends ItemSlab
{
	public ItemSmallWhiteChocolateBrickSlabs(Block block) 
	{
		super(block, BlockRegistry.smallwhitechocolatebricksingle, BlockRegistry.smallwhitechocolatebrickdouble, block == BlockRegistry.smallwhitechocolatebrickdouble);
		this.setUnlocalizedName("killerjdog51.block_whitechocolatesmallbrickslab");
	}
}