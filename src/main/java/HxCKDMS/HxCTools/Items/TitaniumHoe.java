package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Creative.HxCToolsTab;
import HxCKDMS.HxCTools.Handling.TextureHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class TitaniumHoe extends ItemHoe
{
    public TitaniumHoe(Item.ToolMaterial material)
    {
        super(material);
        setCreativeTab(HxCToolsTab.HxCToolsTab);
        setUnlocalizedName("TitaniumHoe");
        setTextureName(TextureHandler.TitaniumHoe);
    }
}