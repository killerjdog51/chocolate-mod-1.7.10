package com.chocolatemod.block;

import com.chocolatemod.main.MainRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class smallDarkChocolateBrickStairs extends BlockStairs {

	protected smallDarkChocolateBrickStairs(Block par2Block, int par3) {
		super(BlockRegistry.smallchocolatebrick, 1);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(MainRegistry.tabChocolateBlocks);
		this.setLightOpacity(0);
	}

}
