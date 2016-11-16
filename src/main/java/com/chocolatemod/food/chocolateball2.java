package com.chocolatemod.food;

import com.chocolatemod.main.MainRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import java.util.List;

public class chocolateball2 extends ItemFood {

	/**
	 * List of item names
	 */
	public static final String[] itemMetaNames = new String[]{"default.fruity", "dark.fruity", MainRegistry.EnableMilkChocolate ? "milk.fruity" : "light.fruity", "white.fruity", "extradark.fruity", "defautl.nuts", "dark.nuts", MainRegistry.EnableMilkChocolate ? "milk.nuts" : "light.nuts", "white.nuts", "extradark.nuts", "default.minty", "dark.minty", MainRegistry.EnableMilkChocolate ? "milk.minty" : "light.minty", "white.minty", "extradark.minty"};
	public static final String[] field_94595_b = new String[]{"default_fruit", "dark_fruit", "light_fruit", "white_fruit", "extradark_fruit", "default_nuts", "dark_nuts", "light_nuts", "white_nuts", "extradark_nuts", "default_minty", "dark_minty", "light_minty", "white_minty", "extradark_minty"};

	@SideOnly(Side.CLIENT)
	private IIcon[] field_94594_d;

	public chocolateball2(int i, float f, boolean b) {
		super(i, f, b);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setCreativeTab(MainRegistry.tabChocolateFood);
	}

	@SideOnly(Side.CLIENT)

/**
 * Gets an icon index based on an item's damage value
 */
	public IIcon getIconFromDamage(int par1) {
		int j = MathHelper.clamp_int(par1, 0, 14);
		return this.field_94594_d[j];
	}

	/**
	 * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
	 * different names based on their damage or NBT.
	 */
	public String getUnlocalizedName(ItemStack par1ItemStack) {
		int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 14);
		return super.getUnlocalizedName() + "." + itemMetaNames[i];
	}

	@SideOnly(Side.CLIENT)

/**
 * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
 */
	public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
		for (int j = 0; j < 15; ++j) {
			par3List.add(new ItemStack(par1, 1, j));
		}
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister) {
		this.field_94594_d = new IIcon[field_94595_b.length];

		for (int i = 0; i < field_94595_b.length; ++i) {
			this.field_94594_d[i] = par1IconRegister.registerIcon(this.getIconString() + "_" + field_94595_b[i]);
		}
	}
}
