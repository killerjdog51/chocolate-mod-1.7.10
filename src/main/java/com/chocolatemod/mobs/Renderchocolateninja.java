package com.chocolatemod.mobs;

import com.mojang.authlib.GameProfile;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StringUtils;
import org.lwjgl.opengl.GL11;

import java.util.UUID;

public class Renderchocolateninja extends RenderBiped {
	private static final ResourceLocation ninjaTextures = new ResourceLocation("killerjdog51:textures/entities/New.png");

	public Renderchocolateninja(ModelBiped Model, float f) {
		super(Model, f);
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(Entitychocolateninja par1EntityPig) {
		return ninjaTextures;
	}

	/**
	 * Queries whether should render the specified pass or not.
	 */


	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return this.getEntityTexture((Entitychocolateninja) par1Entity);
	}

	protected void renderEquippedItems(EntityLiving p_77029_1_, float p_77029_2_) {
		GL11.glColor3f(1.0F, 1.0F, 1.0F);
		super.renderEquippedItems(p_77029_1_, p_77029_2_);
		ItemStack itemstack = p_77029_1_.getHeldItem();
		ItemStack itemstack1 = p_77029_1_.func_130225_q(3);
		Item item;
		float f1;

		if (itemstack1 != null) {
			GL11.glPushMatrix();
			this.modelBipedMain.bipedHead.postRender(0.0625F);
			item = itemstack1.getItem();

			net.minecraftforge.client.IItemRenderer customRenderer = net.minecraftforge.client.MinecraftForgeClient.getItemRenderer(itemstack1, net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED);
			boolean is3D = (customRenderer != null && customRenderer.shouldUseRenderHelper(net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED, itemstack1, net.minecraftforge.client.IItemRenderer.ItemRendererHelper.BLOCK_3D));

			if (item instanceof ItemBlock) {
				if (is3D || RenderBlocks.renderItemIn3d(Block.getBlockFromItem(item).getRenderType())) {
					f1 = 0.625F;
					GL11.glTranslatef(0.0F, -0.25F, 0.0F);
					GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
					GL11.glScalef(f1, -f1, -f1);
				}

				this.renderManager.itemRenderer.renderItem(p_77029_1_, itemstack1, 0);
			} else if (item == Items.skull) {
				f1 = 1.0625F;
				GL11.glScalef(f1, -f1, -f1);
				GameProfile gameprofile = null;

				if (itemstack1.hasTagCompound()) {
					NBTTagCompound nbttagcompound = itemstack1.getTagCompound();

					if (nbttagcompound.hasKey("SkullOwner", 10)) {
						gameprofile = NBTUtil.func_152459_a(nbttagcompound.getCompoundTag("SkullOwner"));
					} else if (nbttagcompound.hasKey("SkullOwner", 8) && !StringUtils.isNullOrEmpty(nbttagcompound.getString("SkullOwner"))) {
						gameprofile = new GameProfile((UUID) null, nbttagcompound.getString("SkullOwner"));
					}
				}

				TileEntitySkullRenderer.field_147536_b.func_152674_a(-0.5F, 0.0F, -0.5F, 1, 180.0F, itemstack1.getItemDamage(), gameprofile);
			}

			GL11.glPopMatrix();
		}

		if (itemstack != null && itemstack.getItem() != null) {
			item = itemstack.getItem();
			GL11.glPushMatrix();

			if (this.mainModel.isChild) {
				f1 = 0.5F;
				GL11.glTranslatef(0.0F, 0.625F, 0.0F);
				GL11.glRotatef(-20.0F, -1.0F, 0.0F, 0.0F);
				GL11.glScalef(f1, f1, f1);
			}

			this.modelBipedMain.bipedRightArm.postRender(0.0625F);
			GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);

			net.minecraftforge.client.IItemRenderer customRenderer = net.minecraftforge.client.MinecraftForgeClient.getItemRenderer(itemstack, net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED);
			boolean is3D = (customRenderer != null && customRenderer.shouldUseRenderHelper(net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED, itemstack, net.minecraftforge.client.IItemRenderer.ItemRendererHelper.BLOCK_3D));

			if (item instanceof ItemBlock && (is3D || RenderBlocks.renderItemIn3d(Block.getBlockFromItem(item).getRenderType()))) {
				f1 = 0.5F;
				GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
				f1 *= 0.75F;
				GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
				GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
				GL11.glScalef(-f1, -f1, f1);
			} else if (item == Items.bow) {
				f1 = 0.625F;
				GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
				GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
				GL11.glScalef(f1, -f1, f1);
				GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
				GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
			} else if (item.isFull3D()) {
				f1 = 0.625F;

				if (item.shouldRotateAroundWhenRendering()) {
					GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
					GL11.glTranslatef(0.0F, -0.125F, 0.0F);
				}

				this.func_82422_c();
				GL11.glScalef(f1, -f1, f1);
				GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
				GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
			} else {
				f1 = 0.375F;
				GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
				GL11.glScalef(f1, f1, f1);
				GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
				GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
				GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
			}

			float f2;
			int i;
			float f5;

			if (itemstack.getItem().requiresMultipleRenderPasses()) {
				for (i = 0; i < itemstack.getItem().getRenderPasses(itemstack.getItemDamage()); ++i) {
					int j = itemstack.getItem().getColorFromItemStack(itemstack, i);
					f5 = (float) (j >> 16 & 255) / 255.0F;
					f2 = (float) (j >> 8 & 255) / 255.0F;
					float f3 = (float) (j & 255) / 255.0F;
					GL11.glColor4f(f5, f2, f3, 1.0F);
					this.renderManager.itemRenderer.renderItem(p_77029_1_, itemstack, i);
				}
			} else {
				i = itemstack.getItem().getColorFromItemStack(itemstack, 0);
				float f4 = (float) (i >> 16 & 255) / 255.0F;
				f5 = (float) (i >> 8 & 255) / 255.0F;
				f2 = (float) (i & 255) / 255.0F;
				GL11.glColor4f(f4, f5, f2, 1.0F);
				this.renderManager.itemRenderer.renderItem(p_77029_1_, itemstack, 0);
			}

			GL11.glPopMatrix();
		}
	}

	public void doRender(EntityLivingBase p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
		this.doRender((EntityLiving) p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
	}

	public void doRender(Entity p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
		this.doRender((EntityLiving) p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
	}

	public void doRender(EntityLiving p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
		GL11.glColor3f(1.0F, 1.0F, 1.0F);
		ItemStack itemstack = p_76986_1_.getHeldItem();
		this.func_82420_a(p_76986_1_, itemstack);
		double d3 = p_76986_4_ - (double) p_76986_1_.yOffset;

		if (p_76986_1_.isSneaking()) {
			d3 -= 0.125D;
		}

		super.doRender(p_76986_1_, p_76986_2_, d3, p_76986_6_, p_76986_8_, p_76986_9_);
		this.field_82423_g.aimedBow = this.field_82425_h.aimedBow = this.modelBipedMain.aimedBow = false;
		this.field_82423_g.isSneak = this.field_82425_h.isSneak = this.modelBipedMain.isSneak = false;
		this.field_82423_g.heldItemRight = this.field_82425_h.heldItemRight = this.modelBipedMain.heldItemRight = 0;
	}

}