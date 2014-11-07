package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Creative.HxCToolsTab;
import net.minecraft.item.ItemPickaxe;

public class VoidPickaxe extends ItemPickaxe
{
    public VoidPickaxe(ToolMaterial material)
    {
        super(material);
        setCreativeTab(HxCToolsTab.HxCToolsTab);
        setUnlocalizedName("VoidPickaxe");
    }
}