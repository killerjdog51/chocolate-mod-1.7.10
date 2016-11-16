package com.chocolatemod.block;

import com.chocolatemod.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBrickBlocks extends ItemBlock {

	public static final String[] field_94407_b = new String[]{"default", "dark", MainRegistry.EnableMilkChocolate ? "milk" : "light", "white", "extradark", "carved", "dark_carved", MainRegistry.EnableMilkChocolate ? "milk_carved" : "light_carved", "white_carved", "extradark.carved"};


	public ItemBrickBlocks(Block block) {
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
