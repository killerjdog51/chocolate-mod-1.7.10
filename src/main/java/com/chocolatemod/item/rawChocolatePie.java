package com.chocolatemod.item;

import java.util.List;

import javax.swing.Icon;

import com.chocolatemod.main.MainRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class rawChocolatePie extends ItemFood{

	/**List of item names */
	public static final String[] itemMetaNames = new String[] {"chocolate", "dark", MainRegistry.EnableMilkChocolate ? "milk" : "light", "white", "extradark"};
	public static final String[] itemMetaTextures = new String[] {"chocolate", "dark_chocolate", "light_chocolate", "white_chocolate", "extradark_chocolate"};
	
	@SideOnly(Side.CLIENT)
	private IIcon[] itemTextures;
	
	public rawChocolatePie(int par1, float potionEffectProbability, Boolean alwaysedible){
		super(par1, potionEffectProbability, alwaysedible);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setCreativeTab(MainRegistry.tabChocolateMisc);
	}
	
	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer){
		super.onEaten(par1ItemStack, par2World, par3EntityPlayer);
		return new ItemStack(ItemRegistry.piePan);
	}
	@SideOnly(Side.CLIENT)
	
	/** gets an icon index based on an items damage value */
	public IIcon getIconFromDamage(int par1){
		int j = MathHelper.clamp_int(par1, 0, 4);
		return this.itemTextures[j];
	}
	
	/** returns the unlocalized name of this item. This version accepts an Item stack so different stacks can have different names based on their damage or NBT.*/
	public String getUnlocalizedName(ItemStack par1ItemStack){
		int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 4);
		return super.getUnlocalizedName() + "." + itemMetaNames[i];
	}
	
	@SideOnly(Side.CLIENT)
	/** returns a list of items with the same ID, but different meta*/
	public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List){
		for (int j = 0; j < 5; ++j){
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
