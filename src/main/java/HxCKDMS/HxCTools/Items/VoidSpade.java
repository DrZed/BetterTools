package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Creative.HxCToolsTab;
import HxCKDMS.HxCTools.Handling.TextureHandler;
import net.minecraft.item.ItemSpade;

public class VoidSpade extends ItemSpade
{
    public VoidSpade(ToolMaterial material)
    {
        super(material);
        setCreativeTab(HxCToolsTab.HxCToolsTab);
        setUnlocalizedName("VoidSpade");
        setTextureName(TextureHandler.VoidSpade);
    }
}