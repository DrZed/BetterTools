package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Creative.HxCToolsTab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class SapphireHoe extends ItemHoe
{
    public SapphireHoe(Item.ToolMaterial material)
    {
        super(material);
        setCreativeTab(HxCToolsTab.HxCToolsTab);
        setUnlocalizedName("SapphireHoe");
    }
}