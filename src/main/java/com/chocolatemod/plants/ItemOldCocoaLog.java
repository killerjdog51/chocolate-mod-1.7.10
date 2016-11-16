package com.chocolatemod.plants;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemOldCocoaLog extends ItemBlockWithMetadata {

	public static final String[] field_94407_b = new String[]{"cocoa", "extradark"};


	public ItemOldCocoaLog(Block block) {
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
