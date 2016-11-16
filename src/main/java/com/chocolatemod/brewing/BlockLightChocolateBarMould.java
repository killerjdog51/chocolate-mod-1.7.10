package com.chocolatemod.brewing;

import com.chocolatemod.block.BlockRegistry;
import com.chocolatemod.food.FoodRegistry;
import com.chocolatemod.liquids.LiquidRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class BlockLightChocolateBarMould extends Block {
	public static IIcon[] LightChocolateMouldTex;
	public static IIcon[] LightChocolateMouldLiquidTex;

	public BlockLightChocolateBarMould() {
		super(Material.iron);
		this.setCreativeTab(null);
		this.setHardness(2.0F);
		this.setTickRandomly(true);
	}

	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg) {
		LightChocolateMouldTex = new IIcon[3];
		LightChocolateMouldLiquidTex = new IIcon[2];

		LightChocolateMouldTex[0] = reg.registerIcon("killerjdog51:ChocolateBarMould_top");
		LightChocolateMouldTex[1] = reg.registerIcon("minecraft:furnace_top");
		LightChocolateMouldTex[2] = reg.registerIcon("minecraft:furnace_side");

		LightChocolateMouldLiquidTex[0] = reg.registerIcon("killerjdog51:block_mouldlightchocolate");
		LightChocolateMouldLiquidTex[1] = reg.registerIcon("killerjdog51:block_mouldlightchocolateready");

	}

	/**
	 * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
	 */
	@SideOnly(Side.CLIENT)

	public IIcon getIcon(int s, int par2) {
		return s == 1 ? LightChocolateMouldTex[0] : (s == 0 ? LightChocolateMouldTex[1] : LightChocolateMouldTex[2]);
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	public Block idDropped(int par1, Random par2Random, int par3) {
		return BlockRegistry.ChocolateMould;
	}

	/**
	 * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
	 * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
	 */
	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	 */
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	/**
	 * The type of render function that is called for this block
	 */
	@Override
	public int getRenderType() {
		return brewing.lightChocolateBarMouldRenderID;
	}

	/**
	 * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
	 */
	@SideOnly(Side.CLIENT)
	public Block idPicked(World par1World, int par2, int par3, int par4) {
		return BlockRegistry.ChocolateMould;
	}

	/**
	 * Updates the blocks bounds based on its current state. Args: world, x, y, z
	 */
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
		int l = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
		float f = 0.0625F;
		float f1 = (float) (1 + 0 * 2) / 16.0F;
		float f2 = 0.5F;
		this.setBlockBounds(f1, 0.0F, f, 1.0F - f, f2, 1.0F - f);
		//                  X    Y    Z    X       Y    Z
	}


	/**
	 * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
	 * cleared to be reused)
	 */
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		int l = par1World.getBlockMetadata(par2, par3, par4);
		float f = 0.0625F;
		float f1 = (float) (1 + 0 * 2) / 16.0F;
		float f2 = 0.5F;
		return AxisAlignedBB.getBoundingBox((double) ((float) par2 + f1), (double) par3, (double) ((float) par4 + f), (double) ((float) (par2 + 1) - f), (double) ((float) par3 + f2 - f), (double) ((float) (par4 + 1) - f));
	}


	@SideOnly(Side.CLIENT)

	/**
	 * Returns the bounding box of the wired rectangular prism to render.
	 */
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		int l = par1World.getBlockMetadata(par2, par3, par4);
		float f = 0.0625F;
		float f1 = (float) (1 + 0 * 2) / 16.0F;
		float f2 = 0.5F;
		return AxisAlignedBB.getBoundingBox((double) ((float) par2 + f1), (double) par3, (double) ((float) par4 + f), (double) ((float) (par2 + 1) - f), (double) ((float) par3 + f2), (double) ((float) (par4 + 1) - f));
	}

	/**
	 * Adds all intersecting collision boxes to a list. (Be sure to only add boxes to the list if they intersect the
	 * mask.) Parameters: World, X, Y, Z, mask, list, colliding entity
	 */
	@Override
	public void addCollisionBoxesToList(World world, int i, int j, int k, AxisAlignedBB axis, List list, Entity entity) {
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.3125F, 1.0F);
		super.addCollisionBoxesToList(world, i, j, k, axis, list, entity);
		float f = 0.125F;
		this.setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
		super.addCollisionBoxesToList(world, i, j, k, axis, list, entity);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
		super.addCollisionBoxesToList(world, i, j, k, axis, list, entity);
		this.setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		super.addCollisionBoxesToList(world, i, j, k, axis, list, entity);
		this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
		super.addCollisionBoxesToList(world, i, j, k, axis, list, entity);
		this.setBlockBoundsForItemRender();
	}

	/**
	 * Sets the block's bounds for rendering it as an item
	 */
	public void setBlockBoundsForItemRender() {
		float f = 0.0625F;
		float f1 = 0.5F;
		this.setBlockBounds(f, 0.0F, f, 1.0F - f, f1, 1.0F - f);
	}

	/**
	 * How many world ticks before ticking
	 */
	@Override
    public int tickRate(World world)
    {
		 
		
            return 1;
    }


	/**
	 * Ticks the block if it's been scheduled
	 */
	@Override
	public void updateTick(World world, int i, int j, int k, Random rand) {
		world.scheduleBlockUpdate(i, j, k, this, 5000);

		int meta = world.getBlockMetadata(i, j, k);
		boolean heat = !(world.getBlock(i, j - 1, k) == Blocks.fire) || !(world.getBlock(i, j - 1, k) == Blocks.flowing_lava) || !(world.getBlock(i, j - 1, k) == Blocks.lava) || !(world.getBlock(i, j - 1, k) == LiquidRegistry.moltenCaramelBlock);
		//boolean cold = world.getBlock(i, j - 1, k) == Blocks.ice || world.getBlock(i, j - 1, k) == Blocks.packed_ice;

		if (heat) {
			if (meta < 5) {
				++meta;
				world.setBlockMetadataWithNotify(i, j, k, meta, 2);
			}


		}
	}


	/**
	 * Called upon block activation (right click on the block.)
	 */

	//0 = chocolate milk
	//1 = cool
	//2 = cool
	//3 = cool
	//4 = cool
	//5 = ready
	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer player, int par6, float par7, float par8, float par9) {
		if (world.isRemote) {
			return true;
		} else {
			ItemStack itemstack = player.inventory.getCurrentItem();

			if (itemstack == null) {
				
				int meta = world.getBlockMetadata(i, j, k);

				if (meta == 5) {
					ItemStack itemstack1 = new ItemStack(FoodRegistry.chocolatebar1, 2, 2);
					if (!player.inventory.addItemStackToInventory(itemstack1)) {
						world.spawnEntityInWorld(new EntityItem(world, (double) i + 0.5D, (double) j + 1.5D, (double) k + 0.5D, itemstack1));
					} else if (player instanceof EntityPlayerMP) {
						((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);
					}

					world.setBlock(i, j, k, BlockRegistry.ChocolateMould);
				}

				return true;
			}
				
				return true;
			} 
			
	}
	}

