package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Creative.HxCToolsTab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class SteelPickaxe extends ItemPickaxe
{
    public SteelPickaxe(Item.ToolMaterial material)
    {
        super(material);
        setCreativeTab(HxCToolsTab.HxCToolsTab);
        setUnlocalizedName("SteelPickaxe");
    }
}