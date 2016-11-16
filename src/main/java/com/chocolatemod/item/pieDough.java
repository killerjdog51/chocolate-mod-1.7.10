package com.chocolatemod.item;

import java.util.List;

import javax.swing.Icon;

import com.chocolatemod.main.MainRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

public class pieDough extends Item{

	/**List of item names */
	public static final String[] itemMetaNames = new String[] {"default", "chocolate", "dark", MainRegistry.EnableMilkChocolate ? "milk" : "light", "white", "extradark"};
	public static final String[] itemMetaTextures = new String[] {"default", "chocolate", "dark", "light", "white", "extradark"};
	
	@SideOnly(Side.CLIENT)
	private IIcon[] itemTextures;
	
	public pieDough(){
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setCreativeTab(MainRegistry.tabChocolateMisc);
	}
	
	@SideOnly(Side.CLIENT)
	
	/** gets an icon index based on an items damage value */
	public IIcon getIconFromDamage(int par1){
		int j = MathHelper.clamp_int(par1, 0, 5);
		return this.itemTextures[j];
	}
	
	/** returns the unlocalized name of this item. This version accepts an Item stack so different stacks can have different names based on their damage or NBT.*/
	public String getUnlocalizedName(ItemStack par1ItemStack){
		int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 5);
		return super.getUnlocalizedName() + "." + itemMetaNames[i];
	}
	
	@SideOnly(Side.CLIENT)
	/** returns a list of items with the same ID, but different meta*/
	public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List){
		for (int j = 0; j < 6; ++j){
			par3List.add(new ItemStack(par1, 1, j));
		}
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister p_94581_1_)
    {
        this.itemTextures = new IIcon[itemMetaTextures.length];

        for (int i = 0; i < itemMetaTextures.length; ++i)
        {
            this.itemTextures[i] = p_94581_1_.registerIcon(this.getIconString() + "_" + itemMetaTextures[i]);
        }
    }
}
