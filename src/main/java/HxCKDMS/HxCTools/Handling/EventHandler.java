package HxCKDMS.HxCTools.Handling;

import HxCKDMS.HxCTools.Config;
import HxCKDMS.HxCTools.Items.VoidPickaxe;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;
import java.util.Queue;

public class EventHandler{
    public int VoidRepair = Config.VoidRepairRate;

    boolean DevMode = true;
    boolean VE = Config.VoidEnable;
    boolean VAE = false;

    ItemStack VoidArmor = null;
    ItemStack VoidItem = null;
    ItemStack VChest = null;
    ItemStack VHelm = null;
    ItemStack VLeg = null;
    ItemStack VBoot = null;
    ItemStack VP = null;
    ItemStack VA = null;
    ItemStack VH = null;
    ItemStack VS = null;
    ItemStack VB = null;

    String PickMode = VoidPickaxe.PickMode;

    @SubscribeEvent
    public void LivingUpdateEvent(LivingEvent.LivingUpdateEvent event){
        if (VE || DevMode && event.entity instanceof EntityPlayer){
            EntityPlayer player = (EntityPlayer) event.entity;
            for(int k = 0; k < 4; k++){
                ItemStack Armor = player.getCurrentArmor(k);
                if (Armor == VChest || Armor == VBoot || Armor == VLeg || Armor == VHelm){VoidArmor = Armor;}
                if (VoidArmor != null){
                    VoidRepair--;
                    VoidArmor.setItemDamage(0);
                    VoidRepair = Config.VoidRepairRate;
                }
            }
            for(int j = 0; j < 9; j++){
                ItemStack Item = player.inventory.getStackInSlot(j);
                if (Item == VB || Item == VS || Item == VH || Item == VA || Item == VP){VoidItem = Item;}
                if (VoidItem != null){
                    VoidRepair--;
                    if (VoidRepair == 0)
                    {
                        VoidItem.setItemDamage(0);
                        VoidRepair = Config.VoidRepairRate;
                    }
                }
            }
        }
    }
    @SubscribeEvent
    public void LivingAttackEvent(LivingAttackEvent event)
    {
        if(event.entityLiving.getLastAttacker() instanceof EntityPlayer){
            EntityPlayer player = (EntityPlayer) event.entityLiving.getLastAttacker();
            EntityLiving victim = (EntityLiving) event.entityLiving;
            if(player.getHeldItem().toString().equalsIgnoreCase("VoidSword"))
            {
                victim.attackEntityFrom(new DamageSource("YourMother"), 280F);
                victim.onDeath(new DamageSource("YourMother"));
            }
        }
    }
    @SubscribeEvent
    public void LivingJumpEvent(LivingEvent.LivingJumpEvent event)
    {
        if(event.entityLiving instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer) event.entityLiving;
            ItemStack pants = player.inventory.armorItemInSlot(2);
            if (pants.toString().equalsIgnoreCase("voidleggings"))
            {
                double JumpBuff = player.motionY + 0.4;
                player.motionY += JumpBuff;
            }
        }
    }
    @SubscribeEvent
    public void PlayerEvent(PlayerEvent event){

    }
    @SubscribeEvent
    public void UserItemEvent(PlayerUseItemEvent event){
        Item item = event.item.getItem();
        if (item.toString().equalsIgnoreCase("voidaxe")){
            EntityPlayer player = event.entityPlayer;
            int j = (int)player.posX;
            int d = (int)player.posY;
            int k = (int)player.posZ;
            int xs = j-10;
            int ys = d-5;
            int zs = k-10;
            int xm = j+10;
            int ym = d+50;
            int zm = k+10;
            for(int x = xs; x < xm; x++)
            {
                for(int z = zs; z < zm; z++)
                {
                    World world = player.worldObj;
                    for(int y = ys; y < ym; y++)
                    {
                        Block block = world.getBlock(x, y, z);
                        //ForTesting Not Sure if this will work v is a wierd system
                        ArrayList OreDictWood = OreDictionary.getOres("logWood");
                        if (block != Blocks.air && player.worldObj.canMineBlock(player, x, y, z) && OreDictWood.contains(block.toString()))
                        {
                            ItemStack NewB = new ItemStack(player.worldObj.getBlock(x, y, z));
                            world.spawnEntityInWorld(new EntityItem(world, player.posX, player.posY, player.posZ, NewB));
                            world.setBlockToAir(x, y, z);
                        }
                    }
                }
            }
        }if (item.toString().equalsIgnoreCase("voidpickaxe")){
            EntityPlayer player = event.entityPlayer;
            int j = (int)player.posX;
            int d = (int)player.posY;
            int k = (int)player.posZ;
            int xs = j-10;
            int ys = d-10;
            int zs = k-10;
            int xm = j+10;
            int ym = d+10;
            int zm = k+10;
            for(int x = xs; x < xm; x++)
            {
                for(int z = zs; z < zm; z++)
                {
                    World world = player.worldObj;
                    for(int y = ys; y < ym; y++)
                    {
                        Block block = world.getBlock(x, y, z);
                        if (block == Blocks.stone || block == Blocks.dirt || block == Blocks.gravel && PickMode.equalsIgnoreCase("DeleteMode"))
                        {
                            world.setBlockToAir(x, y, z);
                        }else if (block == Blocks.stone || block == Blocks.dirt || block == Blocks.gravel && PickMode.equalsIgnoreCase("DropMode"))
                        {
                            ItemStack NewB = new ItemStack(player.worldObj.getBlock(x, y, z));
                            world.spawnEntityInWorld(new EntityItem(world, player.posX, player.posY, player.posZ, NewB));
                            world.setBlockToAir(x, y, z);
                        }
                        ArrayList test = OreDictionary.getOres(block.toString());
                        boolean isOre = test.toString().startsWith("ore");
                        if (block != Blocks.air && player.worldObj.canMineBlock(player, x, y, z) && isOre)
                        {
                            ItemStack NewB = new ItemStack(player.worldObj.getBlock(x, y, z));
                            world.spawnEntityInWorld(new EntityItem(world, player.posX, player.posY, player.posZ, NewB));
                            world.setBlockToAir(x, y, z);
                        }
                    }
                }
            }
        }if (item.toString().equalsIgnoreCase("voidspade")){
            EntityPlayer player = event.entityPlayer;
            int j = (int)player.posX;
            int d = (int)player.posY;
            int k = (int)player.posZ;
            int xs = j-10;
            int ys = d-10;
            int zs = k-10;
            int xm = j+10;
            int ym = d+10;
            int zm = k+10;
            for(int x = xs; x < xm; x++)
            {
                for(int z = zs; z < zm; z++)
                {
                    World world = player.worldObj;
                    for(int y = ys; y < ym; y++)
                    {
                        Block block = world.getBlock(x, y, z);
                        if (block == Blocks.dirt || block == Blocks.sand || block == Blocks.gravel || block == Blocks.soul_sand && PickMode.equalsIgnoreCase("DeleteMode"))
                        {
                            ItemStack NewB = new ItemStack(player.worldObj.getBlock(x, y, z));
                            world.spawnEntityInWorld(new EntityItem(world, player.posX, player.posY, player.posZ, NewB));
                            world.setBlockToAir(x, y, z);
                        }
                    }
                }
            }
        }if (item.toString().equalsIgnoreCase("voidsword")){
            EntityPlayer player = event.entityPlayer;
            int j = (int)player.posX;
            int d = (int)player.posY;
            int k = (int)player.posZ;
            int xs = j-10;
            int ys = d-10;
            int zs = k-10;
            int xm = j+10;
            int ym = d+10;
            int zm = k+10;
            World world = player.worldObj;
            Queue<EntityLivingBase> ents = (Queue<EntityLivingBase>)world.getEntitiesWithinAABB(EntityLiving.class, AxisAlignedBB.getBoundingBox(xs, ys, zs, xm, ym, zm));
            if (ents != null && ents instanceof EntityLivingBase)
            {
                EntityLivingBase victim = ents.poll();
                victim.setLastAttacker(player);
                victim.attackEntityFrom(new DamageSource("YourMother"), 160F);
                victim.onDeath(new DamageSource("YourMother"));
            }
        }
    }
}
