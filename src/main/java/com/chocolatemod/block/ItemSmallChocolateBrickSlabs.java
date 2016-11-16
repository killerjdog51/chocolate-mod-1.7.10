package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemSmallChocolateBrickSlabs extends ItemSlab
{
	public ItemSmallChocolateBrickSlabs(Block block) 
	{
		super(block, BlockRegistry.smallchocolatebricksingle, BlockRegistry.smallchocolatebrickdouble, block == BlockRegistry.smallchocolatebrickdouble);
		this.setUnlocalizedName("killerjdog51.block_chocolatesmallbrickslab");
	}
}