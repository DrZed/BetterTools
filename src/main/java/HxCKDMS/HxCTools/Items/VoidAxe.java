package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Creative.HxCToolsTab;
import HxCKDMS.HxCTools.Handling.TextureHandler;
import net.minecraft.item.ItemAxe;

public class VoidAxe extends ItemAxe
{
    public VoidAxe(ToolMaterial material)
    {
        super(material);
        setCreativeTab(HxCToolsTab.HxCToolsTab);
        setUnlocalizedName("VoidAxe");
        setTextureName(TextureHandler.VoidAxe);
    }
}