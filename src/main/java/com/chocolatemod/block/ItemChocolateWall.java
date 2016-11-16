package com.chocolatemod.block;

import com.chocolatemod.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemChocolateWall extends ItemBlock {

	public static final String[] field_94407_b = new String[]{"cobble", "dark.cobble", MainRegistry.EnableMilkChocolate ? "milk.cobble" : "light.cobble", "white.cobble", "minty", "dark.minty", MainRegistry.EnableMilkChocolate ? "milk.minty" : "light.minty", "white.minty", "caramel", "dark.caramel", MainRegistry.EnableMilkChocolate ? "milk.caramel" : "light.caramel", "white.caramel", "extradark.cobble", "extradark.minty", "extradark.caramel"};


	public ItemChocolateWall(Block block) {
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
