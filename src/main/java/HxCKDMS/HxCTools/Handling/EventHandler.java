package HxCKDMS.HxCTools.Handling;

import HxCKDMS.HxCTools.Config;
import HxCKDMS.HxCTools.Items.VoidBoots;
import HxCKDMS.HxCTools.Items.VoidChestplate;
import HxCKDMS.HxCTools.Items.VoidHelm;
import HxCKDMS.HxCTools.Items.VoidLeggings;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent;

public class EventHandler {
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

    @SubscribeEvent
    public void LivingUpdate(LivingEvent.LivingUpdateEvent event){
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
}
