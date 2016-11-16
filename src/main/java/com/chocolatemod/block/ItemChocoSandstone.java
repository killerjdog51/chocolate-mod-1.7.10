package com.chocolatemod.block;

import com.chocolatemod.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemChocoSandstone extends ItemBlock {

	public static final String[] field_94407_b = new String[]{"white_normal", "white_carved", "white_chiseled", "white_smooth", "dark_normal", "dark_carved", "dark_chiseled", "dark_smooth", MainRegistry.EnableMilkChocolate ? "milk_normal" : "light_normal", MainRegistry.EnableMilkChocolate ? "milk_carved" : "light_carved", MainRegistry.EnableMilkChocolate ? "milk_chiseled" : "light_chiseled", MainRegistry.EnableMilkChocolate ? "milk_smooth" : "light_smooth", "normal", "carved", "chiseled", "smooth"};
	;


	public ItemChocoSandstone(Block block) {
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
