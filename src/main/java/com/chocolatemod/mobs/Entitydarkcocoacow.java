package com.chocolatemod.mobs;

import com.chocolatemod.item.ItemRegistry;
import com.chocolatemod.liquids.LiquidRegistry;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class Entitydarkcocoacow extends EntityAnimal {

	private String texture;
	final int MILK_DELAY = 24000;
	final int ID_MILK_TIMER = 16;
	private long MilkTime = MILK_DELAY;
	private boolean CanMilk;
	
	public Entitydarkcocoacow(World par1World) {
		super(par1World);
		this.setSize(0.9F, 1.3F);
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
		this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
		this.tasks.addTask(3, new EntityAITempt(this, 1.25D, Items.wheat, false));
		this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
		this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
	}

	public void setMilkTimer(int toSet)
	{
	    this.getDataWatcher().updateObject(ID_MILK_TIMER, toSet);
	}
	
	/**
	 * Returns true if the newer Entity AI code should be run
	 */
	public boolean isAIEnabled() {
		return true;
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20000000298023224D);
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	protected String getLivingSound() {
		return "mob.cow.say";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	protected String getHurtSound() {
		return "mob.cow.hurt";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	protected String getDeathSound() {
		return "mob.cow.hurt";
	}

	/**
	 * Plays step sound at given x, y, z for the entity
	 */
	protected void playStepSound(int par1, int par2, int par3, int par4) {
		this.playSound("mob.cow.step", 0.15F, 1.0F);
	}

	/**
	 * Returns the volume for the sounds this mob makes.
	 */
	protected float getSoundVolume() {
		return 0.4F;
	}

	/**
	 * Returns the item ID for the item the mob drops on death.
	 */
	protected Item getDropItemId() {
		return Items.leather;
	}


	/**
	 * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
	 * par2 - Level of Looting used to kill this mob.
	 */
	protected void dropFewItems(boolean par1, int par2) {
		int j = this.rand.nextInt(3) + this.rand.nextInt(1 + par2);
		int k;

		for (k = 0; k < j; ++k) {
			this.dropItem(Items.leather, 1);
		}

		j = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + par2);

		for (k = 0; k < j; ++k) {
			if (this.isBurning()) {
				this.dropItem(Items.cooked_beef, 1);
			} else {
				this.dropItem(Items.beef, 1);
			}
		}
	}

	//Milk timer
		@Override
		public void onLivingUpdate(){
			
			if (MilkTime > 0){
				MilkTime = MilkTime - 1;
			}
				System.out.println("Milk Timer is " + MilkTime);

			super.onLivingUpdate();
		}
		
		public int getMilkTimer()
		{
		    return ((Integer)this.getDataWatcher().getWatchableObjectInt(ID_MILK_TIMER)).intValue();
		}
		
	/**
	 * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
	 */
	public boolean interact(EntityPlayer par1EntityPlayer) {
		ItemStack itemstack = par1EntityPlayer.inventory.getCurrentItem();
		if(MilkTime <= 0){

		if (itemstack != null && itemstack.getItem() == Items.bucket && !par1EntityPlayer.capabilities.isCreativeMode) {
			if (itemstack.stackSize-- == 1) {
				par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, new ItemStack(LiquidRegistry.darkChocolateMilkBucket));
				MilkTime = MILK_DELAY;

			} else if (!par1EntityPlayer.inventory.addItemStackToInventory(new ItemStack(LiquidRegistry.darkChocolateMilkBucket))) {
				par1EntityPlayer.dropPlayerItemWithRandomChoice(new ItemStack(LiquidRegistry.darkChocolateMilkBucket, 1, 0), false);
				MilkTime = MILK_DELAY;

			}

			return true;
		}
		if (itemstack != null && itemstack.getItem() == Items.bowl && !par1EntityPlayer.capabilities.isCreativeMode) {
			if (itemstack.stackSize-- == 1) {
				par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, new ItemStack(ItemRegistry.bowldarkchocolatemilk));
				MilkTime = MILK_DELAY;

			} else if (!par1EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ItemRegistry.bowldarkchocolatemilk))) {
				par1EntityPlayer.dropPlayerItemWithRandomChoice(new ItemStack(ItemRegistry.bowldarkchocolatemilk, 1, 0), false);
				MilkTime = MILK_DELAY;

			}
		}
			return true;
		} else {
			return super.interact(par1EntityPlayer);
		}
	}

	/**
	 * This function is used when two same-species animals in 'love mode' breed to generate the new baby animal.
	 */
	public Entitydarkcocoacow spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
		return new Entitydarkcocoacow(this.worldObj);
	}

	public EntityAgeable createChild(EntityAgeable par1EntityAgeable) {
		return this.spawnBabyAnimal(par1EntityAgeable);
	}
	
	@Override
	public void readEntityFromNBT(NBTTagCompound nbt)
	{
		super.readEntityFromNBT(nbt);
		
		MilkTime = nbt.getLong("HasMilkTime");
		
	}
	
	@Override
	public void writeEntityToNBT(NBTTagCompound nbt)
	{
		super.writeEntityToNBT(nbt);

		nbt.setLong("HasMilkTime", MilkTime);

	}
}
