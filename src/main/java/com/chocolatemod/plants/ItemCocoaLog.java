package com.chocolatemod.plants;

import com.chocolatemod.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemCocoaLog extends ItemBlockWithMetadata {

	public static final String[] field_94407_b = new String[]{"chocolate", "dark", MainRegistry.EnableMilkChocolate ? "milk" : "light", "white"};


	public ItemCocoaLog(Block block) {
		super(block, block);
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
