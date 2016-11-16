package com.chocolatemod.liquids;

import com.chocolatemod.block.BlockChocolatePortal;
import com.chocolatemod.block.BlockRegistry;
import com.chocolatemod.main.MainRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockDarkChocolateMilk extends BlockFluidClassic {

	@SideOnly(Side.CLIENT)
	protected IIcon stillIcon;
	@SideOnly(Side.CLIENT)
	protected IIcon flowingIcon;

	public BlockDarkChocolateMilk(Fluid fluid, Material material) {
		super(fluid, material);
		setCreativeTab(MainRegistry.tabChocolateBlocks);
	}

	 public void onBlockAdded(World world, int x, int y, int z){
	        if (world.provider.dimensionId > 0 || !((BlockChocolatePortal) BlockRegistry.BlockChocolatePortal).getPortalSize(world, x, y, z)){
	           }
            world.scheduleBlockUpdate(x, y, z, this, this.tickRate(world) + world.rand.nextInt(10));

	        }
	    

	@Override
	public IIcon getIcon(int side, int meta) {
		return (side == 0 || side == 1) ? stillIcon : flowingIcon;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister register) {
		stillIcon = register.registerIcon("killerjdog51:darkchocolatemilk_still");
		flowingIcon = register.registerIcon("killerjdog51:darkchocolatemilk_flow");
		
		LiquidRegistry.darkChocolateMilkFluid.setIcons(stillIcon, flowingIcon);

	}

	@Override
	public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
		if (world.getBlock(x, y, z).getMaterial().isLiquid()) return false;
		return super.canDisplace(world, x, y, z);
	}

	@Override
	public boolean displaceIfPossible(World world, int x, int y, int z) {
		if (world.getBlock(x, y, z).getMaterial().isLiquid()) return false;
		return super.displaceIfPossible(world, x, y, z);
	}

}