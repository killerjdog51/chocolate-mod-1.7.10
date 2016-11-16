package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class BlockChocoOre extends Block {
	private static final String __OBFID = "CL_00000282";

	public BlockChocoOre() {
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return this == BlockRegistry.chocoCoal ? Items.coal : (this == BlockRegistry.chocoDiamond ? Items.diamond : (this == BlockRegistry.chocoLapis ? Items.dye : Item.getItemFromBlock(this)));
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	public int quantityDropped(Random p_149745_1_) {
		return this == BlockRegistry.chocoLapis ? 4 + p_149745_1_.nextInt(5) : 1;
	}

	/**
	 * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
	 */
	public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_) {
		if (p_149679_1_ > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, p_149679_2_, p_149679_1_)) {
			int j = p_149679_2_.nextInt(p_149679_1_ + 2) - 1;

			if (j < 0) {
				j = 0;
			}

			return this.quantityDropped(p_149679_2_) * (j + 1);
		} else {
			return this.quantityDropped(p_149679_2_);
		}
	}

	/**
	 * Drops the block items with a specified chance of dropping the specified items
	 */
	public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_) {
		super.dropBlockAsItemWithChance(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, p_149690_6_, p_149690_7_);
	}

	private Random rand = new Random();

	@Override
	public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_) {
		if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this)) {
			int j1 = 0;

			if (this == BlockRegistry.chocoCoal) {
				j1 = MathHelper.getRandomIntegerInRange(rand, 0, 2);
			} else if (this == BlockRegistry.chocoDiamond) {
				j1 = MathHelper.getRandomIntegerInRange(rand, 3, 7);
			} else if (this == BlockRegistry.chocoLapis) {
				j1 = MathHelper.getRandomIntegerInRange(rand, 2, 5);
			}


			return j1;
		}
		return 0;
	}

	/**
	 * Determines the damage on the item the block drops. Used in cloth and wood.
	 */
	public int damageDropped(int p_149692_1_) {
		return this == BlockRegistry.chocoLapis ? 4 : 0;
	}
}