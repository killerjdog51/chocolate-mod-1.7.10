package com.chocolatemod.block;

import com.chocolatemod.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemChocolateGlass extends ItemBlock {

	public static final String[] field_94407_b = new String[]{"white", "dark", MainRegistry.EnableMilkChocolate ? "milk" : "light", null, "extradark"};


	public ItemChocolateGlass(Block block) {
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
