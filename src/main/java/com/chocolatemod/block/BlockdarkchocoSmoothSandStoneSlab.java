package com.chocolatemod.block;

import java.util.List;
import java.util.Random;

import com.chocolatemod.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockdarkchocoSmoothSandStoneSlab extends BlockSlab 
{
	
	private IIcon field_150007_M;

	public BlockdarkchocoSmoothSandStoneSlab(boolean par2)
	{
		super(par2, Material.rock);
		this.useNeighborBrightness = true;
		this.setStepSound(soundTypeStone);
		this.setResistance(5.0F);
		this.setHardness(2.0F);
		this.setCreativeTab(MainRegistry.tabChocolateBlocks);
		this.setBlockName("killerjdog51.block_darkchocolatesmoothsandstoneslab");
		
	}

	/************
	 * STUFF
	 ************/	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs tab, List list)
	{
		if (item != Item.getItemFromBlock(BlockRegistry.darkchocoSmoothSandStoneSlabdouble))
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
		return block == BlockRegistry.darkchocoSmoothSandStoneSlabsingle;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(World par1World, int par2, int par3, int par4)
	{
		return isBlockSingleSlab(this) ? Item.getItemFromBlock(this) : (this == BlockRegistry.darkchocoSmoothSandStoneSlabdouble ? Item.getItemFromBlock(BlockRegistry.darkchocoSmoothSandStoneSlabsingle) : Item.getItemFromBlock(BlockRegistry.darkchocoSmoothSandStoneSlabsingle));
	}

	/************
	 * DROPS
	 ************/	
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3)
	{
		return Item.getItemFromBlock(BlockRegistry.darkchocoSmoothSandStoneSlabsingle);
	}

	protected ItemStack createStackedBlock(int par1)
	{
		return new ItemStack(BlockRegistry.darkchocoSmoothSandStoneSlabsingle, 2, 0);
	}

	/************
	 * TEXTURES
	 ************/	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister p_149651_1_) {
		this.blockIcon = p_149651_1_.registerIcon("killerjdog51:chocolatesandstone_dark_smooth");
		this.field_150007_M = p_149651_1_.registerIcon("killerjdog51:chocolatesandstone_dark_top");
	}

	public IIcon getIcon(int par1, int par2) {
		int k = par2 & 7;

		if (this.field_150004_a && (par2 & 2) != 0) {
			par1 = 1;
		}

		return par1 == 1 ? this.field_150007_M : (par1 == 0 ? this.field_150007_M : this.blockIcon);
	}


}