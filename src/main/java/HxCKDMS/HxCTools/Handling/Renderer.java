package HxCKDMS.HxCTools.Handling;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.*;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import static net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED;
import static net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON;

@SideOnly(Side.CLIENT)
public class Renderer {
    /**
     * A reference to the Minecraft object.
     */

    /*
     * THIS IS DEFINITELY NOT READY YET
     * DO NOT TRY TO USE THIS!!!!
     */

    private Minecraft mc;
    private ItemStack itemToRender;
    /**
     * How far the current item has been equipped (0 un-equipped and 1 fully up)
     */
    private float equippedProgress;
    private float prevEquippedProgress;
    private RenderBlocks renderBlocksIr = new RenderBlocks();
    /**
     * The index of the currently held item (0-8, or -1 if not yet updated)
     */
    private int equippedItemSlot = -1;
    private static final String __OBFID = "CL_00000953";

    public void ItemRenderer(Minecraft mcraft) {
        this.mc = mcraft;
    }

    /**
     * Renders the item stack for being in an entity's hand Args: itemStack
     */
    public void render(EntityLivingBase Eliving, ItemStack IStack, int IntA) {
        this.renderItem(Eliving, IStack, IntA, EQUIPPED);
    }

    public void renderItem(EntityLivingBase Eliving, ItemStack IStack, int IntA, IItemRenderer.ItemRenderType type) {
        GL11.glPushMatrix();
        TextureManager texturemanager = this.mc.getTextureManager();
        Item item = IStack.getItem();
        Block block = Block.getBlockFromItem(item);

        if (IStack != null && block != null && block.getRenderBlockPass() != 0) {
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glEnable(GL11.GL_CULL_FACE);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        }
        IItemRenderer customRenderer = MinecraftForgeClient.getItemRenderer(IStack, type);
        if (customRenderer != null) {
            texturemanager.bindTexture(texturemanager.getResourceLocation(IStack.getItemSpriteNumber()));
            ForgeHooksClient.renderEquippedItem(type, customRenderer, renderBlocksIr, Eliving, IStack);
        }/*
         //rendering for block not needed yet
         else if (IStack.getItemSpriteNumber() == 0 && item instanceof ItemBlock && RenderBlocks.renderItemIn3d(block.getRenderType())) {
            texturemanager.bindTexture(texturemanager.getResourceLocation(0));

            if (IStack != null && block != null && block.getRenderBlockPass() != 0) {
                GL11.glDepthMask(false);
                this.renderBlocksIr.renderBlockAsItem(block, IStack.getItemDamage(), 1.0F);
                GL11.glDepthMask(true);
            } else {
                this.renderBlocksIr.renderBlockAsItem(block, IStack.getItemDamage(), 1.0F);
            }
        }*/ else {
            IIcon iicon = Eliving.getItemIcon(IStack, IntA);

            if (iicon == null) {
                GL11.glPopMatrix();
                return;
            }

            texturemanager.bindTexture(texturemanager.getResourceLocation(IStack.getItemSpriteNumber()));
            TextureUtil.func_152777_a(false, false, 1.0F);
            Tessellator tessellator = Tessellator.instance;
            float f = iicon.getMinU();
            float f1 = iicon.getMaxU();
            float f2 = iicon.getMinV();
            float f3 = iicon.getMaxV();
            float f4 = 0.0F;
            float f5 = 0.3F;
            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
            GL11.glTranslatef(-f4, -f5, 0.0F);
            float f6 = 1.5F;
            GL11.glScalef(f6, f6, f6);
            GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
            renderItemIn2D(tessellator, f1, f2, f, f3, iicon.getIconWidth(), iicon.getIconHeight(), 0.0625F);
/*
            //renders item with glint if enchanted
            //not needed at this moment
            if (IStack.hasEffect(IntA)) {
                GL11.glDepthFunc(GL11.GL_EQUAL);
                GL11.glDisable(GL11.GL_LIGHTING);
                texturemanager.bindTexture(RES_ITEM_GLINT);
                GL11.glEnable(GL11.GL_BLEND);
                OpenGlHelper.glBlendFunc(768, 1, 1, 0);
                float f7 = 0.76F;
                GL11.glColor4f(0.5F * f7, 0.25F * f7, 0.8F * f7, 1.0F);
                GL11.glMatrixMode(GL11.GL_TEXTURE);
                GL11.glPushMatrix();
                float f8 = 0.125F;
                GL11.glScalef(f8, f8, f8);
                float f9 = (float) (Minecraft.getSystemTime() % 3000L) / 3000.0F * 8.0F;
                GL11.glTranslatef(f9, 0.0F, 0.0F);
                GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
                renderItemIn2D(tessellator, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glScalef(f8, f8, f8);
                f9 = (float) (Minecraft.getSystemTime() % 4873L) / 4873.0F * 8.0F;
                GL11.glTranslatef(-f9, 0.0F, 0.0F);
                GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
                renderItemIn2D(tessellator, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
                GL11.glPopMatrix();
                GL11.glMatrixMode(GL11.GL_MODELVIEW);
                GL11.glDisable(GL11.GL_BLEND);
                GL11.glEnable(GL11.GL_LIGHTING);
                GL11.glDepthFunc(GL11.GL_LEQUAL);
            }
*/

            GL11.glDisable(GL12.GL_RESCALE_NORMAL);
            texturemanager.bindTexture(texturemanager.getResourceLocation(IStack.getItemSpriteNumber()));
            TextureUtil.func_147945_b();
        }

        if (IStack != null && block != null && block.getRenderBlockPass() != 0) {
            GL11.glDisable(GL11.GL_BLEND);
        }

        GL11.glPopMatrix();
    }

    /**
     * Renders an item held in hand as a 2D texture with thickness
     */
    public static void renderItemIn2D(Tessellator Tess1, float FloatA, float FloatB, float FloatC, float FloatD, int IntA, int IntB, float FloatE) {
        Tess1.startDrawingQuads();
        Tess1.setNormal(0.0F, 0.0F, 1.0F);
        Tess1.addVertexWithUV(0.0D, 0.0D, 0.0D, (double) FloatA, (double) FloatD);
        Tess1.addVertexWithUV(1.0D, 0.0D, 0.0D, (double) FloatC, (double) FloatD);
        Tess1.addVertexWithUV(1.0D, 1.0D, 0.0D, (double) FloatC, (double) FloatB);
        Tess1.addVertexWithUV(0.0D, 1.0D, 0.0D, (double) FloatA, (double) FloatB);
        Tess1.draw();
        Tess1.startDrawingQuads();
        Tess1.setNormal(0.0F, 0.0F, -1.0F);
        Tess1.addVertexWithUV(0.0D, 1.0D, (double) (0.0F - FloatE), (double) FloatA, (double) FloatB);
        Tess1.addVertexWithUV(1.0D, 1.0D, (double) (0.0F - FloatE), (double) FloatC, (double) FloatB);
        Tess1.addVertexWithUV(1.0D, 0.0D, (double) (0.0F - FloatE), (double) FloatC, (double) FloatD);
        Tess1.addVertexWithUV(0.0D, 0.0D, (double) (0.0F - FloatE), (double) FloatA, (double) FloatD);
        Tess1.draw();
        float f5 = 0.5F * (FloatA - FloatC) / (float) IntA;
        float f6 = 0.5F * (FloatD - FloatB) / (float) IntB;
        Tess1.startDrawingQuads();
        Tess1.setNormal(-1.0F, 0.0F, 0.0F);
        int k;
        float f7;
        float f8;

        for (k = 0; k < IntA; ++k) {
            f7 = (float) k / (float) IntA;
            f8 = FloatA + (FloatC - FloatA) * f7 - f5;
            Tess1.addVertexWithUV((double) f7, 0.0D, (double) (0.0F - FloatE), (double) f8, (double) FloatD);
            Tess1.addVertexWithUV((double) f7, 0.0D, 0.0D, (double) f8, (double) FloatD);
            Tess1.addVertexWithUV((double) f7, 1.0D, 0.0D, (double) f8, (double) FloatB);
            Tess1.addVertexWithUV((double) f7, 1.0D, (double) (0.0F - FloatE), (double) f8, (double) FloatB);
        }

        Tess1.draw();
        Tess1.startDrawingQuads();
        Tess1.setNormal(1.0F, 0.0F, 0.0F);
        float f9;

        for (k = 0; k < IntA; ++k) {
            f7 = (float) k / (float) IntA;
            f8 = FloatA + (FloatC - FloatA) * f7 - f5;
            f9 = f7 + 1.0F / (float) IntA;
            Tess1.addVertexWithUV((double) f9, 1.0D, (double) (0.0F - FloatE), (double) f8, (double) FloatB);
            Tess1.addVertexWithUV((double) f9, 1.0D, 0.0D, (double) f8, (double) FloatB);
            Tess1.addVertexWithUV((double) f9, 0.0D, 0.0D, (double) f8, (double) FloatD);
            Tess1.addVertexWithUV((double) f9, 0.0D, (double) (0.0F - FloatE), (double) f8, (double) FloatD);
        }

        Tess1.draw();
        Tess1.startDrawingQuads();
        Tess1.setNormal(0.0F, 1.0F, 0.0F);

        for (k = 0; k < IntB; ++k) {
            f7 = (float) k / (float) IntB;
            f8 = FloatD + (FloatB - FloatD) * f7 - f6;
            f9 = f7 + 1.0F / (float) IntB;
            Tess1.addVertexWithUV(0.0D, (double) f9, 0.0D, (double) FloatA, (double) f8);
            Tess1.addVertexWithUV(1.0D, (double) f9, 0.0D, (double) FloatC, (double) f8);
            Tess1.addVertexWithUV(1.0D, (double) f9, (double) (0.0F - FloatE), (double) FloatC, (double) f8);
            Tess1.addVertexWithUV(0.0D, (double) f9, (double) (0.0F - FloatE), (double) FloatA, (double) f8);
        }

        Tess1.draw();
        Tess1.startDrawingQuads();
        Tess1.setNormal(0.0F, -1.0F, 0.0F);

        for (k = 0; k < IntB; ++k) {
            f7 = (float) k / (float) IntB;
            f8 = FloatD + (FloatB - FloatD) * f7 - f6;
            Tess1.addVertexWithUV(1.0D, (double) f7, 0.0D, (double) FloatC, (double) f8);
            Tess1.addVertexWithUV(0.0D, (double) f7, 0.0D, (double) FloatA, (double) f8);
            Tess1.addVertexWithUV(0.0D, (double) f7, (double) (0.0F - FloatE), (double) FloatA, (double) f8);
            Tess1.addVertexWithUV(1.0D, (double) f7, (double) (0.0F - FloatE), (double) FloatC, (double) f8);
        }

        Tess1.draw();
    }

    /**
     * Renders the active item in the player's hand when in first person mode. Args: partialTickTime
     */
    public void renderItemInFirstPerson(float FloatZ) {
        float f1 = this.prevEquippedProgress + (this.equippedProgress - this.prevEquippedProgress) * FloatZ;
        EntityClientPlayerMP playerMP = this.mc.thePlayer;
        float f2 = playerMP.prevRotationPitch + (playerMP.rotationPitch - playerMP.prevRotationPitch) * FloatZ;
        GL11.glPushMatrix();
        GL11.glRotatef(f2, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(playerMP.prevRotationYaw + (playerMP.rotationYaw - playerMP.prevRotationYaw) * FloatZ, 0.0F, 1.0F, 0.0F);
        RenderHelper.enableStandardItemLighting();
        GL11.glPopMatrix();
        EntityPlayerSP playerSP = (EntityPlayerSP) playerMP;
        float f3 = playerSP.prevRenderArmPitch + (playerSP.renderArmPitch - playerSP.prevRenderArmPitch) * FloatZ;
        float f4 = playerSP.prevRenderArmYaw + (playerSP.renderArmYaw - playerSP.prevRenderArmYaw) * FloatZ;
        GL11.glRotatef((playerMP.rotationPitch - f3) * 0.1F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef((playerMP.rotationYaw - f4) * 0.1F, 0.0F, 1.0F, 0.0F);
        ItemStack stack = this.itemToRender;
/*
        //Special rendering for wool xD
        if (stack != null && stack.getItem() instanceof ItemCloth) {
            GL11.glEnable(GL11.GL_BLEND);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        }
*/

        int i = this.mc.theWorld.getLightBrightnessForSkyBlocks(MathHelper.floor_double(playerMP.posX), MathHelper.floor_double(playerMP.posY), MathHelper.floor_double(playerMP.posZ), 0);
        int j = i % 65536;
        int k = i / 65536;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j / 1.0F, (float) k / 1.0F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float f5;
        float f6;
        float f7;

        if (stack != null) {
            int l = stack.getItem().getColorFromItemStack(stack, 0);
            f5 = (float) (l >> 16 & 255) / 255.0F;
            f6 = (float) (l >> 8 & 255) / 255.0F;
            f7 = (float) (l & 255) / 255.0F;
            GL11.glColor4f(f5, f6, f7, 1.0F);
        } else {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        }

        float f8;
        float f9;
        float f10;
        float f13;
        Render render;
        RenderPlayer renderplayer;

         if (stack != null) {
            GL11.glPushMatrix();
            f13 = 0.8F;
/*

            if (playerMP.getItemInUseCount() > 0) {
                EnumAction enumaction = stack.getItemUseAction();
                //for when player is eating or drinking this is the animation
                //not going to have food or drink in second hand for now
                if (enumaction == EnumAction.eat || enumaction == EnumAction.drink) {
                    f6 = (float) playerMP.getItemInUseCount() - FloatZ + 1.0F;
                    f7 = 1.0F - f6 / (float) stack.getMaxItemUseDuration();
                    f8 = 1.0F - f7;
                    f8 = f8 * f8 * f8;
                    f8 = f8 * f8 * f8;
                    f8 = f8 * f8 * f8;
                    f9 = 1.0F - f8;
                    GL11.glTranslatef(0.0F, MathHelper.abs(MathHelper.cos(f6 / 4.0F * (float) Math.PI) * 0.1F) * (float) ((double) f7 > 0.2D ? 1 : 0), 0.0F);
                    GL11.glTranslatef(f9 * 0.6F, -f9 * 0.5F, 0.0F);
                    GL11.glRotatef(f9 * 90.0F, 0.0F, 1.0F, 0.0F);
                    GL11.glRotatef(f9 * 10.0F, 1.0F, 0.0F, 0.0F);
                    GL11.glRotatef(f9 * 30.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                f5 = playerMP.getSwingProgress(FloatZ);
                f6 = MathHelper.sin(f5 * (float) Math.PI);
                f7 = MathHelper.sin(MathHelper.sqrt_float(f5) * (float) Math.PI);
                GL11.glTranslatef(-f7 * 0.4F, MathHelper.sin(MathHelper.sqrt_float(f5) * (float) Math.PI * 2.0F) * 0.2F, -f6 * 0.2F);
            }
*/          f5 = playerMP.getSwingProgress(FloatZ);
            f6 = MathHelper.sin(f5 * (float) Math.PI);
            f7 = MathHelper.sin(MathHelper.sqrt_float(f5) * (float) Math.PI);
            GL11.glTranslatef(-f7 * 0.4F, MathHelper.sin(MathHelper.sqrt_float(f5) * (float) Math.PI * 2.0F) * 0.2F, -f6 * 0.2F);

            GL11.glTranslatef(0.7F * f13, -0.65F * f13 - (1.0F - f1) * 0.6F, -0.9F * f13);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
            f5 = playerMP.getSwingProgress(FloatZ);
            f6 = MathHelper.sin(f5 * f5 * (float) Math.PI);
            f7 = MathHelper.sin(MathHelper.sqrt_float(f5) * (float) Math.PI);
            GL11.glRotatef(-f6 * 20.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-f7 * 20.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-f7 * 80.0F, 1.0F, 0.0F, 0.0F);
            f8 = 0.4F;
            GL11.glScalef(f8, f8, f8);
            float f11;
            float f12;
/*
            //Bow use or block placement not going to happen
            // yet first just daggers XD
            if (playerMP.getItemInUseCount() > 0) {
                EnumAction enumaction1 = stack.getItemUseAction();

                if (enumaction1 == EnumAction.block) {
                    GL11.glTranslatef(-0.5F, 0.2F, 0.0F);
                    GL11.glRotatef(30.0F, 0.0F, 1.0F, 0.0F);
                    GL11.glRotatef(-80.0F, 1.0F, 0.0F, 0.0F);
                    GL11.glRotatef(60.0F, 0.0F, 1.0F, 0.0F);
                } else if (enumaction1 == EnumAction.bow) {
                    GL11.glRotatef(-18.0F, 0.0F, 0.0F, 1.0F);
                    GL11.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
                    GL11.glRotatef(-8.0F, 1.0F, 0.0F, 0.0F);
                    GL11.glTranslatef(-0.9F, 0.2F, 0.0F);
                    f10 = (float) stack.getMaxItemUseDuration() - ((float) playerMP.getItemInUseCount() - FloatZ + 1.0F);
                    f11 = f10 / 20.0F;
                    f11 = (f11 * f11 + f11 * 2.0F) / 3.0F;

                    if (f11 > 1.0F) {
                        f11 = 1.0F;
                    }

                    if (f11 > 0.1F) {
                        GL11.glTranslatef(0.0F, MathHelper.sin((f10 - 0.1F) * 1.3F) * 0.01F * (f11 - 0.1F), 0.0F);
                    }

                    GL11.glTranslatef(0.0F, 0.0F, f11 * 0.1F);
                    GL11.glRotatef(-335.0F, 0.0F, 0.0F, 1.0F);
                    GL11.glRotatef(-50.0F, 0.0F, 1.0F, 0.0F);
                    GL11.glTranslatef(0.0F, 0.5F, 0.0F);
                    f12 = 1.0F + f11 * 0.2F;
                    GL11.glScalef(1.0F, 1.0F, f12);
                    GL11.glTranslatef(0.0F, -0.5F, 0.0F);
                    GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
                    GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
                }
            }
*/

            if (stack.getItem().shouldRotateAroundWhenRendering()) {
                GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            }

            if (stack.getItem().requiresMultipleRenderPasses()) {
                this.renderItem(playerMP, stack, 0, EQUIPPED_FIRST_PERSON);
                for (int x = 1; x < stack.getItem().getRenderPasses(stack.getItemDamage()); x++) {
                    int k1 = stack.getItem().getColorFromItemStack(stack, x);
                    f10 = (float) (k1 >> 16 & 255) / 255.0F;
                    f11 = (float) (k1 >> 8 & 255) / 255.0F;
                    f12 = (float) (k1 & 255) / 255.0F;
                    GL11.glColor4f(1.0F * f10, 1.0F * f11, 1.0F * f12, 1.0F);
                    this.renderItem(playerMP, stack, x, EQUIPPED_FIRST_PERSON);
                }
            } else {
                this.renderItem(playerMP, stack, 0, EQUIPPED_FIRST_PERSON);
            }

            GL11.glPopMatrix();
        } else if (!playerMP.isInvisible()) {
            GL11.glPushMatrix();
            f13 = 0.8F;
            f5 = playerMP.getSwingProgress(FloatZ);
            f6 = MathHelper.sin(f5 * (float) Math.PI);
            f7 = MathHelper.sin(MathHelper.sqrt_float(f5) * (float) Math.PI);
            GL11.glTranslatef(-f7 * 0.3F, MathHelper.sin(MathHelper.sqrt_float(f5) * (float) Math.PI * 2.0F) * 0.4F, -f6 * 0.4F);
            GL11.glTranslatef(0.8F * f13, -0.75F * f13 - (1.0F - f1) * 0.6F, -0.9F * f13);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
            f5 = playerMP.getSwingProgress(FloatZ);
            f6 = MathHelper.sin(f5 * f5 * (float) Math.PI);
            f7 = MathHelper.sin(MathHelper.sqrt_float(f5) * (float) Math.PI);
            GL11.glRotatef(f7 * 70.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-f6 * 20.0F, 0.0F, 0.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(playerMP.getLocationSkin());
            GL11.glTranslatef(-1.0F, 3.6F, 3.5F);
            GL11.glRotatef(120.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(200.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(1.0F, 1.0F, 1.0F);
            GL11.glTranslatef(5.6F, 0.0F, 0.0F);
            render = RenderManager.instance.getEntityRenderObject(this.mc.thePlayer);
            renderplayer = (RenderPlayer) render;
            f10 = 1.0F;
            GL11.glScalef(f10, f10, f10);
            renderplayer.renderFirstPersonArm(this.mc.thePlayer);
            GL11.glPopMatrix();
        }
/*
        //special rendering for wool xD
        if (stack != null && stack.getItem() instanceof ItemCloth) {
            GL11.glDisable(GL11.GL_BLEND);
        }
*/

        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        RenderHelper.disableStandardItemLighting();
    }
}