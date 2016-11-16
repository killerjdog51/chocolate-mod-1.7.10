package com.chocolatemod.brewing;


import com.chocolatemod.item.ItemRegistry;
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
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class BlockLightChocolateMilkCauldron extends Block {
	public static IIcon[] LightChocolateCauldronTex;
	public static IIcon[] LightChocolateLiquidTex;
	private int TickRate;

	public BlockLightChocolateMilkCauldron() {
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
		LightChocolateCauldronTex = new IIcon[4];
		LightChocolateLiquidTex = new IIcon[10];

		LightChocolateCauldronTex[0] = reg.registerIcon("cauldron_inner");
		LightChocolateCauldronTex[1] = reg.registerIcon("cauldron_top");
		LightChocolateCauldronTex[2] = reg.registerIcon("cauldron_bottom");
		LightChocolateCauldronTex[3] = reg.registerIcon("cauldron_side");

		LightChocolateLiquidTex[0] = reg.registerIcon("killerjdog51:blockWhiteChocolateMilkCauldronLightChocolateMilk");
		LightChocolateLiquidTex[1] = reg.registerIcon("killerjdog51:blockLightChocolateMilkCauldronChocolateLumpA");
		LightChocolateLiquidTex[2] = reg.registerIcon("killerjdog51:blockLightChocolateMilkCauldronChocolateLumpB");
		LightChocolateLiquidTex[3] = reg.registerIcon("killerjdog51:blockLightChocolateMilkCauldronChocolateMilk");
		LightChocolateLiquidTex[4] = reg.registerIcon("killerjdog51:blockChocolateMilkCauldronChocolateLumpA");
		LightChocolateLiquidTex[5] = reg.registerIcon("killerjdog51:blockChocolateMilkCauldronChocolateLumpB");
		LightChocolateLiquidTex[6] = reg.registerIcon("killerjdog51:blockChocolateMilkCauldronDarkChocolateMilk");
		LightChocolateLiquidTex[7] = reg.registerIcon("killerjdog51:blockLightChocolateMilkCauldronMilkA");
		LightChocolateLiquidTex[8] = reg.registerIcon("killerjdog51:blockLightChocolateMilkCauldronMilkB");
		LightChocolateLiquidTex[9] = reg.registerIcon("killerjdog51:blockMilkCauldronWhiteChocolateMilk");

	}

	/**
	 * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int s, int par2) {
		return s == 1 ? LightChocolateCauldronTex[1] : (s == 0 ? LightChocolateCauldronTex[2] : LightChocolateCauldronTex[3]);
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	public Item idDropped(int par1, Random par2Random, int par3) {
		return Items.cauldron;
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
		return brewing.LightChocolatemilkCauldronRenderID;
	}

	/**
	 * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
	 */
	@SideOnly(Side.CLIENT)
	public Item idPicked(World par1World, int par2, int par3, int par4) {
		return Items.cauldron;
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
	@Override
	public void setBlockBoundsForItemRender() {
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
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
		if(world.getBlock(i, j - 1, k) == Blocks.lava){
			TickRate = 6000;
		}else if(world.getBlock(i, j - 1, k) == Blocks.flowing_lava){
			TickRate = 6000;
		}else if(world.getBlock(i, j - 1, k) == Blocks.fire){
			TickRate = 9000;
		}else if(world.getBlock(i, j - 1, k) == LiquidRegistry.moltenCaramelBlock){
			TickRate = 15000;
		}
		world.scheduleBlockUpdate(i, j, k, this, TickRate);
		int meta = world.getBlockMetadata(i, j, k);
		boolean heat = world.getBlock(i, j - 1, k) == Blocks.fire || world.getBlock(i, j - 1, k) == Blocks.flowing_lava || world.getBlock(i, j - 1, k) == Blocks.lava || world.getBlock(i, j - 1, k) == LiquidRegistry.moltenCaramelBlock;

		if (heat) {
			if (meta > 1 && meta < 5) {
				++meta;
				world.setBlockMetadataWithNotify(i, j, k, meta, 2);
			} else if (meta > 6 && meta < 10) {
				++meta;
				world.setBlockMetadataWithNotify(i, j, k, meta, 2);
			} else if (meta > 11 && meta < 15) {
				++meta;
				world.setBlockMetadataWithNotify(i, j, k, meta, 2);
			}
		}
	}

	@SideOnly(Side.CLIENT)

	/**
	 * A randomly called display update to be able to add particles or other items for display
	 */
	@Override
	public void randomDisplayTick(World world, int i, int j, int k, Random par5Random) {
		boolean heat = world.getBlock(i, j - 1, k) == Blocks.fire || world.getBlock(i, j - 1, k) == Blocks.flowing_lava || world.getBlock(i, j - 1, k) == Blocks.lava || world.getBlock(i, j - 1, k) == LiquidRegistry.moltenCaramelBlock;

		if (heat) {
			double d0 = (double) ((float) i + 0.5F);
			double d1a = (double) ((float) j + 1.4F);
			double d1b = (double) ((float) j + 1.0F);
			double d2 = (double) ((float) k + 0.5F);

			world.spawnParticle("smoke", d0, d1a, d2, 0.0D, 0.0D, 0.0D);
		}
	}

	/**
	 * Called upon block activation (right click on the block.)
	 */


	//0 = Light Chocolate Milk
	//1 = 1 Chocolate Lump
	//2 = 1 Chocolate Lump
	//3 = boil
	//4 = boil
	//5 = finished chocolate milk
	//6 = 1 Chocolate Lump
	//7 = 2 Chocolate Lump
	//8 = boil
	//9 = boil
	//10 = finished dark chocolate milk
	//11 = 1 Milk
	//12 = 1 Milk
	//13 = boil
	//14 = Boil
	//15 = Finished white chocolate milk
	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer player, int par6, float par7, float par8, float par9) {
		if (world.isRemote) {
			return true;
		} else {
			ItemStack itemstack = player.inventory.getCurrentItem();

			if (itemstack == null) {
				return true;
			} else {
				int meta = world.getBlockMetadata(i, j, k);

				if (itemstack.getItem() == ItemRegistry.CocoaPowder) {
					// If the cauldron doesn't have 3 sugar yet, then:
					if (meta < 2)

					{
						if (!player.capabilities.isCreativeMode) {
							// I don't know why but you didn't change this line
							// Previously, it will return a bucket when the sugar is used
							// So yeah, fixed it. Currently, it will just decrease the sugar stack
							--itemstack.stackSize;

							if (itemstack.stackSize <= 0) {
								player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack) null);
							}
						}

						world.setBlockMetadataWithNotify(i, j, k, meta + 1, 2);
					} else if (meta > 4 && meta < 7)

					{
						if (!player.capabilities.isCreativeMode) {
							// I don't know why but you didn't change this line
							// Previously, it will return a bucket when the sugar is used
							// So yeah, fixed it. Currently, it will just decrease the sugar stack
							--itemstack.stackSize;

							if (itemstack.stackSize <= 0) {
								player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack) null);
							}
						}

						world.setBlockMetadataWithNotify(i, j, k, meta + 1, 2);
					}

					return true;
				} else if (itemstack.getItem() == Items.bucket) {
					if (meta == 5) {
						ItemStack itemstack1 = new ItemStack(LiquidRegistry.chocolateMilkBucket, 1, 0);
						if (!player.inventory.addItemStackToInventory(itemstack1)) {
							world.spawnEntityInWorld(new EntityItem(world, (double) i + 0.5D, (double) j + 1.5D, (double) k + 0.5D, itemstack1));
						} else if (player instanceof EntityPlayerMP) {
							((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);
						}

						if (!player.capabilities.isCreativeMode) {
							--itemstack.stackSize;

							if (itemstack.stackSize <= 0) {
								player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack) null);
							}
						}

						world.setBlock(i, j, k, Blocks.cauldron);
					}
					if (meta == 10) {
						ItemStack itemstack1 = new ItemStack(LiquidRegistry.darkChocolateMilkBucket, 1, 0);
						if (!player.inventory.addItemStackToInventory(itemstack1)) {
							world.spawnEntityInWorld(new EntityItem(world, (double) i + 0.5D, (double) j + 1.5D, (double) k + 0.5D, itemstack1));
						} else if (player instanceof EntityPlayerMP) {
							((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);
						}

						if (!player.capabilities.isCreativeMode) {
							--itemstack.stackSize;

							if (itemstack.stackSize <= 0) {
								player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack) null);
							}
						}

						world.setBlock(i, j, k, Blocks.cauldron);
					}
					if (meta == 0) {
						ItemStack itemstack1 = new ItemStack(LiquidRegistry.lightChocolateMilkBucket, 1, 0);
						if (!player.inventory.addItemStackToInventory(itemstack1)) {
							world.spawnEntityInWorld(new EntityItem(world, (double) i + 0.5D, (double) j + 1.5D, (double) k + 0.5D, itemstack1));
						} else if (player instanceof EntityPlayerMP) {
							((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);
						}

						if (!player.capabilities.isCreativeMode) {
							--itemstack.stackSize;

							if (itemstack.stackSize <= 0) {
								player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack) null);
							}
						}

						world.setBlock(i, j, k, Blocks.cauldron);
					}
					if (meta == 15) {
						ItemStack itemstack1 = new ItemStack(LiquidRegistry.whiteChocolateMilkBucket, 1, 0);
						if (!player.inventory.addItemStackToInventory(itemstack1)) {
							world.spawnEntityInWorld(new EntityItem(world, (double) i + 0.5D, (double) j + 1.5D, (double) k + 0.5D, itemstack1));
						} else if (player instanceof EntityPlayerMP) {
							((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);
						}

						if (!player.capabilities.isCreativeMode) {
							--itemstack.stackSize;

							if (itemstack.stackSize <= 0) {
								player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack) null);
							}
						}

						world.setBlock(i, j, k, Blocks.cauldron);
					}

					return true;
				} else if (itemstack.getItem() == Items.bowl) {
					if (meta == 5) {
						ItemStack itemstack1 = new ItemStack(ItemRegistry.bowlchocolatemilk, 1, 0);
						if (!player.inventory.addItemStackToInventory(itemstack1)) {
							world.spawnEntityInWorld(new EntityItem(world, (double) i + 0.5D, (double) j + 1.5D, (double) k + 0.5D, itemstack1));
						} else if (player instanceof EntityPlayerMP) {
							((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);
						}

						if (!player.capabilities.isCreativeMode) {
							--itemstack.stackSize;

							if (itemstack.stackSize <= 0) {
								player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack) null);
							}
						}

						world.setBlock(i, j, k, Blocks.cauldron);
					}
					if (meta == 10) {
						ItemStack itemstack1 = new ItemStack(ItemRegistry.bowldarkchocolatemilk, 1, 0);
						if (!player.inventory.addItemStackToInventory(itemstack1)) {
							world.spawnEntityInWorld(new EntityItem(world, (double) i + 0.5D, (double) j + 1.5D, (double) k + 0.5D, itemstack1));
						} else if (player instanceof EntityPlayerMP) {
							((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);
						}

						if (!player.capabilities.isCreativeMode) {
							--itemstack.stackSize;

							if (itemstack.stackSize <= 0) {
								player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack) null);
							}
						}

						world.setBlock(i, j, k, Blocks.cauldron);
					}
					if (meta == 15) {
						ItemStack itemstack1 = new ItemStack(ItemRegistry.bowlwhitechocolatemilk, 1, 0);
						if (!player.inventory.addItemStackToInventory(itemstack1)) {
							world.spawnEntityInWorld(new EntityItem(world, (double) i + 0.5D, (double) j + 1.5D, (double) k + 0.5D, itemstack1));
						} else if (player instanceof EntityPlayerMP) {
							((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);
						}

						if (!player.capabilities.isCreativeMode) {
							--itemstack.stackSize;

							if (itemstack.stackSize <= 0) {
								player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack) null);
							}
						}

						world.setBlock(i, j, k, Blocks.cauldron);
					}
					if (meta == 0) {
						ItemStack itemstack1 = new ItemStack(ItemRegistry.bowllightchocolatemilk, 1, 0);
						if (!player.inventory.addItemStackToInventory(itemstack1)) {
							world.spawnEntityInWorld(new EntityItem(world, (double) i + 0.5D, (double) j + 1.5D, (double) k + 0.5D, itemstack1));
						} else if (player instanceof EntityPlayerMP) {
							((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);
						}

						if (!player.capabilities.isCreativeMode) {
							--itemstack.stackSize;

							if (itemstack.stackSize <= 0) {
								player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack) null);
							}
						}

						world.setBlock(i, j, k, Blocks.cauldron);
					}

					return true;
				} else if (itemstack.getItem() == ItemRegistry.bowlmilk) {
					if (meta < 1) {
						ItemStack itemstack1 = new ItemStack(Items.bowl, 1, 0);
						if (!player.inventory.addItemStackToInventory(itemstack1)) {
							world.spawnEntityInWorld(new EntityItem(world, (double) i + 0.5D, (double) j + 1.5D, (double) k + 0.5D, itemstack1));
						} else if (player instanceof EntityPlayerMP) {
							((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);
						}

						if (!player.capabilities.isCreativeMode) {
							--itemstack.stackSize;

							if (itemstack.stackSize <= 0) {
								player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack) null);
							}
						}

						world.setBlockMetadataWithNotify(i, j, k, meta = 11, 2);
					} else if (meta == 11) {
						ItemStack itemstack1 = new ItemStack(Items.bowl, 1, 0);
						if (!player.inventory.addItemStackToInventory(itemstack1)) {
							world.spawnEntityInWorld(new EntityItem(world, (double) i + 0.5D, (double) j + 1.5D, (double) k + 0.5D, itemstack1));
						} else if (player instanceof EntityPlayerMP) {
							((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);
						}

						if (!player.capabilities.isCreativeMode) {
							--itemstack.stackSize;

							if (itemstack.stackSize <= 0) {
								player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack) null);
							}
						}

						world.setBlockMetadataWithNotify(i, j, k, meta = 12, 2);
					}
					return true;
				}


				return true;
			}
		}
	}
}
