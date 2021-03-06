package com.chocolatemod.item;

import com.chocolatemod.block.BlockRegistry;
import com.chocolatemod.brewing.brewing;
import com.chocolatemod.main.MainRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class WarmBowlExtraDarkChocolateMilk extends ItemFood {

	public WarmBowlExtraDarkChocolateMilk(int par1, float f, boolean par3) {
		super(par1, par3);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(MainRegistry.tabChocolateMisc);
		this.setMaxStackSize(1);
	}

	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		super.onEaten(par1ItemStack, par2World, par3EntityPlayer);
		return new ItemStack(net.minecraft.init.Items.bowl);
	}

	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.drink;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("killerjdog51:hotextradarkchocolatemilkbowl");
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
		return par1ItemStack;
	}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int i, int j, int k, int side, float par8, float par9, float par10) {
		if (!player.canPlayerEdit(i, j, k, side, stack)) {
			return false;
		} else {
			// the id of the cauldron
			Block targetID = BlockRegistry.ChocolateMould;
			
			Block targetID2 = BlockRegistry.ChocolateBallMould;
			// the metadata of the cauldron; 0 = empty, 3 = full
			int targetMeta = 0;
			// the ID of your new Cauldron
			Block newID = brewing.BlockExtraDarkChocolateBarMould;
			
			Block newID2 = brewing.BlockExtraDarkChocolateBallMould;

			// set to false if you don't want the item to return anything (like Water Bucket -> Empty Bucket);
			boolean doesReturn = true;
			// the returning item
			Item retItem = net.minecraft.init.Items.bowl;

			if (world.getBlock(i, j, k) == targetID && world.getBlockMetadata(i, j, k) == targetMeta) {
				if (!player.capabilities.isCreativeMode && doesReturn) {
					player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(retItem));
				}

				world.setBlock(i, j, k, newID);
			}
			else 			if (world.getBlock(i, j, k) == targetID2 && world.getBlockMetadata(i, j, k) == targetMeta) {
				if (!player.capabilities.isCreativeMode && doesReturn) {
					player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(retItem));
				}

				world.setBlock(i, j, k, newID2);
			}
		} 

			return true;
		} 
	} 


