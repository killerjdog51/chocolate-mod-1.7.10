package com.chocolatemod.block;

import java.util.List;
import java.util.Random;

import com.chocolatemod.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCocoaSlab extends BlockSlab 
{
	public BlockCocoaSlab(boolean par2)
	{
		super(par2, Material.wood);
		this.useNeighborBrightness = true;
		this.setStepSound(soundTypeWood);
		this.setResistance(5.0F);
		this.setHardness(2.0F);
		this.setCreativeTab(MainRegistry.tabChocolateBlocks);
		this.setBlockName("killerjdog51.block_cocoaplankslab");
	}

	/************
	 * STUFF
	 ************/	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs tab, List list)
	{
		if (item != Item.getItemFromBlock(BlockRegistry.CocoaSlabdouble))
		{
			list.add(new ItemStack(item, 1, 0));
		}
	}

	@Override
	public String func_150002_b(int par1)
	{
		return super.getUnlocalizedName();
	}

	@SideOnly(Side.CLIENT)
	private static boolean isBlockSingleSlab(Block block)
	{
		return block == BlockRegistry.CocoaSlabsingle;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(World par1World, int par2, int par3, int par4)
	{
		return isBlockSingleSlab(this) ? Item.getItemFromBlock(this) : (this == BlockRegistry.CocoaSlabdouble ? Item.getItemFromBlock(BlockRegistry.CocoaSlabsingle) : Item.getItemFromBlock(BlockRegistry.CocoaSlabsingle));
	}

	/************
	 * DROPS
	 ************/	
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3)
	{
		return Item.getItemFromBlock(BlockRegistry.CocoaSlabsingle);
	}

	protected ItemStack createStackedBlock(int par1)
	{
		return new ItemStack(BlockRegistry.CocoaSlabsingle, 2, 0);
	}

	/************
	 * TEXTURES
	 ************/	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		return BlockRegistry.CocoaPlanks.getIcon(side, 0);
	}
}