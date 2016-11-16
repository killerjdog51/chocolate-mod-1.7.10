package com.chocolatemod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.chocolatemod.food.FoodRegistry;
import com.chocolatemod.item.ItemRegistry;

public class BlockCaramel extends Block {
	public static final String[] field_150191_a = new String[]{"default", "chiseled", "lines", "hard", "etched", "bricks", "smallbricks", "carvedbricks", "fancybricks"};
	private static final String[] field_150189_b = new String[]{"default", "chiseled", "lines", null, null, "hard", "etched", "brick", "small", "carved", "fancy"};
	@SideOnly(Side.CLIENT)
	private IIcon[] field_150192_M;
	@SideOnly(Side.CLIENT)
	private IIcon field_150193_N;
	@SideOnly(Side.CLIENT)
	private IIcon field_150194_O;
	@SideOnly(Side.CLIENT)
	private IIcon field_150190_P;
	@SideOnly(Side.CLIENT)
	private IIcon field_150188_Q;
	private static final String __OBFID = "CL_00000292";

	public BlockCaramel() {
		super(Material.rock);
	}

	/**
	 * Gets the block's texture. Args: side, meta
	 */
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
		if (p_149691_2_ != 2 && p_149691_2_ != 3 && p_149691_2_ != 4 && p_149691_2_ != 5 && p_149691_2_ != 6 && p_149691_2_ != 7 && p_149691_2_ != 8 && p_149691_2_ != 9 && p_149691_2_ != 10) {
			if (p_149691_1_ != 1 && (p_149691_1_ != 0 || p_149691_2_ != 1)) {
				if (p_149691_1_ == 0) {
					return this.field_150188_Q;
				} else {
					if (p_149691_2_ < 0 || p_149691_2_ >= this.field_150192_M.length) {
						p_149691_2_ = 0;
					}

					return this.field_150192_M[p_149691_2_];
				}
			} else {
				return p_149691_2_ == 1 ? this.field_150193_N : this.field_150190_P;
			}
		} else {
			return p_149691_2_ == 2 && (p_149691_1_ == 1 || p_149691_1_ == 0) ? this.field_150194_O : (p_149691_2_ == 3 && (p_149691_1_ == 5 || p_149691_1_ == 4) ? this.field_150194_O : (p_149691_2_ == 4 && (p_149691_1_ == 2 || p_149691_1_ == 3) ? this.field_150194_O : this.field_150192_M[p_149691_2_]));
		}
	}

	/**
	 * Called when a block is placed using its ItemBlock. Args: World, X, Y, Z, side, hitX, hitY, hitZ, block metadata
	 */
	public int onBlockPlaced(World p_149660_1_, int p_149660_2_, int p_149660_3_, int p_149660_4_, int p_149660_5_, float p_149660_6_, float p_149660_7_, float p_149660_8_, int p_149660_9_) {
		if (p_149660_9_ == 2) {
			switch (p_149660_5_) {
				case 0:
				case 1:
					p_149660_9_ = 2;
					break;
				case 2:
				case 3:
					p_149660_9_ = 4;
					break;
				case 4:
				case 5:
					p_149660_9_ = 3;
			}
		}

		return p_149660_9_;
	}

	/**
	 * Determines the damage on the item the block drops. Used in cloth and wood.
	 */
	public int damageDropped(int p_149692_1_) {
		return p_149692_1_ != 3 && p_149692_1_ != 4 ? p_149692_1_ : 2;
	}

	/**
	 * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
	 * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
	 */
	protected ItemStack createStackedBlock(int p_149644_1_) {
		return p_149644_1_ != 3 && p_149644_1_ != 4 ? super.createStackedBlock(p_149644_1_) : new ItemStack(Item.getItemFromBlock(this), 1, 2);
	}

	/**
	 * The type of render function that is called for this block
	 */
	public int getRenderType() {
		return 39;
	}

	/**
	 * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
	 */
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_) {
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 1));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 2));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 5));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 6));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 7));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 8));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 9));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 10));

	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister p_149651_1_) {
		this.field_150192_M = new IIcon[field_150189_b.length];

		for (int i = 0; i < this.field_150192_M.length; ++i) {
			if (field_150189_b[i] == null) {
				this.field_150192_M[i] = this.field_150192_M[i - 1];
			} else {
				this.field_150192_M[i] = p_149651_1_.registerIcon(this.getTextureName() + "_" + field_150189_b[i]);
			}
		}

		this.field_150190_P = p_149651_1_.registerIcon(this.getTextureName() + "_" + "default");
		this.field_150193_N = p_149651_1_.registerIcon(this.getTextureName() + "_" + "chiseled_top");
		this.field_150194_O = p_149651_1_.registerIcon(this.getTextureName() + "_" + "lines_top");
		this.field_150188_Q = p_149651_1_.registerIcon(this.getTextureName() + "_" + "default");
	}

	public MapColor getMapColor(int p_149728_1_) {
		return MapColor.quartzColor;
	}
	
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int meta, int fortune){
    	ArrayList<ItemStack> ret = new ArrayList<ItemStack>();

        int count = quantityDropped(meta, fortune, world.rand);
        for(int i = 0; i < count; i++)
        {
            Item item = getItemDropped(meta, world.rand, fortune);
            if (item != null)
            {
            	Random randomGenerator = new Random();
        	    for (int idx = 1; idx <= 1; ++idx){
        	      int randomInt = randomGenerator.nextInt(100);
        	    
            	switch(meta){
            	case 0:
            		
            	      if (randomInt >= 95){
            	       		ret.add(new ItemStack(FoodRegistry.caramel, (3*fortune)));
            	      }else {
            	           		ret.add(new ItemStack(BlockRegistry.caramelBlock, 1, damageDropped(0)));

            	       		}
            	      
            		break;
            	case 1:
                    ret.add(new ItemStack(BlockRegistry.caramelBlock, 1, damageDropped(1)));
                    break;
            	case 2:
                    ret.add(new ItemStack(BlockRegistry.caramelBlock, 1, damageDropped(2)));
                    break;
            	case 3:
                    ret.add(new ItemStack(BlockRegistry.caramelBlock, 1, damageDropped(2)));
                    break;
            	case 4:
                    ret.add(new ItemStack(BlockRegistry.caramelBlock, 1, damageDropped(2)));
                    break;
            	case 5:
            		if (randomInt >= 95){
            	       		ret.add(new ItemStack(ItemRegistry.caramelChunk, (3*fortune)));
            	      }else {
            	           		ret.add(new ItemStack(BlockRegistry.caramelBlock, 1, damageDropped(5)));

            	       		}
            	      
            		break;
            	case 6:
                    ret.add(new ItemStack(BlockRegistry.caramelBlock, 1, damageDropped(6)));
                    break;
            	case 7:
                    ret.add(new ItemStack(BlockRegistry.caramelBlock, 1, damageDropped(7)));
                    break;
            	case 8:
                    ret.add(new ItemStack(BlockRegistry.caramelBlock, 1, damageDropped(8)));
                    break;
            	case 9:
                    ret.add(new ItemStack(BlockRegistry.caramelBlock, 1, damageDropped(9)));
                    break;
            	case 10:
                    ret.add(new ItemStack(BlockRegistry.caramelBlock, 1, damageDropped(10)));
                    break;
            	}
            	}
            }
        }
    	return ret;
    	
    }

	@SuppressWarnings("unused")
	public Item getItemDropped(World world, int x, int y, int z, int meta, int fortune, Random rand, int p_149650_3_)
    {    	ArrayList<ItemStack> ret = new ArrayList<ItemStack>();

		int count = quantityDropped(meta, fortune, world.rand);
        for(int i = 0; i < count; i++)
        {
            Item item = getItemDropped(meta, world.rand, fortune);
            if (item != null)
            {
            	switch(meta){
            	
            		case 0:
            			if (p_149650_3_ > 3)
            	        {
            	            p_149650_3_ = 3;
            	        }

            		ret.add(new ItemStack(rand.nextInt(10 - p_149650_3_ * 3) == 0 ? Items.flint : Item.getItemFromBlock(this)));
            		break;
            		
            		case 5:
            			if (p_149650_3_ > 3)
            	        {
            	            p_149650_3_ = 3;
            	        }

            		ret.add(new ItemStack(BlockRegistry.caramelBlock, 1, damageDropped(0)));}}
            		break;
            	        }
		return null;
            	}}
