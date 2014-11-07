package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Creative.HxCToolsTab;
import HxCKDMS.HxCTools.Handling.TextureHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;

public class VoidPickaxe extends ItemPickaxe
{
    public static String PickMode;
    public VoidPickaxe(ToolMaterial material)
    {
        super(material);
        setCreativeTab(HxCToolsTab.HxCToolsTab);
        setUnlocalizedName("VoidPickaxe");
        setTextureName(TextureHandler.VoidPickaxe);
    }
    public void Mode(EntityPlayer player){
        PickMode = "DeleteMode";
        if (player.getHeldItem().toString().equalsIgnoreCase("VoidPickaxe") && player.isSneaking() && player.isUsingItem() && PickMode.equalsIgnoreCase("DeleteMode")){
            PickMode = "DropMode";
        }else if (player.getHeldItem().toString().equalsIgnoreCase("VoidPickaxe") && player.isSneaking() && player.isUsingItem() && PickMode.equalsIgnoreCase("DropMode")){
            PickMode = "DeleteMode";
        }
    }
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void ItemTooltip(ItemTooltipEvent event){
        event.toolTip.add(1, PickMode);
    }
}