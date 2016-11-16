package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemExtraDarkChocolateBlocks extends ItemBlock {

	public static final String[] field_94407_b = new String[]{"extradark", "extradark.hard", "extradark.etched", "extradark.fruit", "extradark.nuts", "extradark.mint", "extradark.fruit.nuts", "extradark.fruit.mint", "extradark.nuts.mint", "extradark.fruit.nuts.mint"};


	public ItemExtraDarkChocolateBlocks(Block block) {
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
