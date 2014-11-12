package HxCKDMS.HxCTools.Handling;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class DualWieldRenderHandler {
    public ItemStack[] DWI = new ItemStack[32];
    public void DWIs(ItemStack stack, Item item){
        DWI[0] = null;
        DWI[1] = null;
        DWI[2] = null;
        DWI[3] = null;
        DWI[4] = null;
        DWI[5] = null;
        DWI[6] = null;
        DWI[7] = null;
        DWI[8] = null;
    }
    @SideOnly(Side.CLIENT)
    public void DualWield(ItemStack I2, EntityPlayer player, World world){
        ItemStack asd = player.getHeldItem();
        for (ItemStack item : DWI){
            if (asd == item){
                //TODO Implement Renderer for Second Hand rendering
                //Not ready Yet
            }
        }
    }
}
