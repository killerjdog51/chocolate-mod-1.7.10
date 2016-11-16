package com.chocolatemod.block;

import com.chocolatemod.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemSmallBrickBlocks extends ItemBlock {

	public static final String[] field_94407_b = new String[]{"small", "dark_small", MainRegistry.EnableMilkChocolate ? "milk_small" : "light_small", "white_small", "extradark.small", "fancy", "dark_fancy", MainRegistry.EnableMilkChocolate ? "milk_fancy" : "light_fancy", "white_fancy", "extradark.fancy"};


	public ItemSmallBrickBlocks(Block block) {
		super(block);
		this.setHasSubtypes(true);

	}

	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		if (i < 0 || i >= field_94407_b.length) {
			i = 0;
		}
		return super.getUnlocalizedName() + "." + field_94407_b[i];
	}

	public int getMetadata(int meta) {
		return meta;
	}

}
