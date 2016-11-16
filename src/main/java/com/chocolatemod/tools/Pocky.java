package com.chocolatemod.tools;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Pocky extends ItemSword{

	public Pocky(ToolMaterial par2EnumToolMaterial) {
		super(par2EnumToolMaterial);
		// TODO Auto-generated constructor stub
	}
	public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer p_77654_3_) {
		if (!p_77654_3_.capabilities.isCreativeMode) {
			--p_77654_1_.stackSize;
		}

		if (!p_77654_2_.isRemote) {
			p_77654_3_.getFoodStats().addStats(6, .8F);
			p_77654_3_.addPotionEffect(new PotionEffect(Potion.resistance.id, 6000, 1));
			p_77654_3_.setHealth(4);
		}

		return null;
	}

	public int getMaxItemUseDuration(ItemStack p_77626_1_) {
		return 32;
	}

	public EnumAction getItemUseAction(ItemStack p_77661_1_) {
		return EnumAction.eat;
	}

	public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_) {
		p_77659_3_.setItemInUse(p_77659_1_, this.getMaxItemUseDuration(p_77659_1_));
		return p_77659_1_;
	}

}
