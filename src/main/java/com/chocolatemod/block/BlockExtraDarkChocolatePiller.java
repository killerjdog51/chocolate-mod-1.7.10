package com.chocolatemod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockExtraDarkChocolatePiller extends BlockRotatedPillar {
	@SideOnly(Side.CLIENT)
    protected IIcon[] field_150167_a;
    @SideOnly(Side.CLIENT)
    protected IIcon[] field_150166_b;
	public static final String[] field_150168_M = new String[]{"extradark_lines", "extradark_chiseled"};
	private static final String __OBFID = "CL_00000281";

	public BlockExtraDarkChocolatePiller() {
		// TODO Auto-generated constructor stub
		super(Material.rock);
	}

	/**
	 * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
	 */
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_) {
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 1));


	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister p_149651_1_) {
		this.field_150167_a = new IIcon[field_150168_M.length];
		this.field_150166_b = new IIcon[field_150168_M.length];

		for (int i = 0; i < this.field_150167_a.length; ++i) {
			this.field_150167_a[i] = p_149651_1_.registerIcon(this.getTextureName() + "_" + field_150168_M[i]);
			this.field_150166_b[i] = p_149651_1_.registerIcon(this.getTextureName() + "_" + field_150168_M[i] + "_top");
		}
	}

	 @SideOnly(Side.CLIENT)
	    protected IIcon getSideIcon(int p_150163_1_)
	    {
	        return this.field_150167_a[p_150163_1_ % this.field_150167_a.length];
	    }

	    @SideOnly(Side.CLIENT)
	    protected IIcon getTopIcon(int p_150161_1_)
	    {
	        return this.field_150166_b[p_150161_1_ % this.field_150166_b.length];
	    }

}