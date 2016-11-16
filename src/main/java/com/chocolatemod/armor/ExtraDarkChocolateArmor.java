package com.chocolatemod.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;


public class ExtraDarkChocolateArmor extends ItemArmor {
	public ExtraDarkChocolateArmor(ArmorMaterial par2EnumArmorMaterial,
							  int par3, int par4) {
		super(par2EnumArmorMaterial, par3, par4);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
								  String type) {
		if (
				stack.getItem() == ArmorRegistry.ExtraDarkChocolateHelmet
						|| stack.getItem() == ArmorRegistry.ExtraDarkChocolateChestplate
						|| stack.getItem() == ArmorRegistry.ExtraDarkChocolateBoots) {
			return "killerjdog51:textures/armor/extradarkchocolate_1.png";
		}
		if (stack.getItem() == ArmorRegistry.ExtraDarkChocolateLeggings) {
			return "killerjdog51:textures/armor/extradarkchocolate_2.png";
		} else {
			return null;
		}

	}
}


