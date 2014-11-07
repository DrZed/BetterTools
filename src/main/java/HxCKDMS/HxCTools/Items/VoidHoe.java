package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Creative.HxCToolsTab;
import HxCKDMS.HxCTools.Handling.TextureHandler;
import net.minecraft.item.ItemHoe;

public class VoidHoe extends ItemHoe
{
    public VoidHoe(ToolMaterial material)
    {
        super(material);
        setCreativeTab(HxCToolsTab.HxCToolsTab);
        setUnlocalizedName("VoidHoe");
        setTextureName(TextureHandler.VoidHoe);
    }
}