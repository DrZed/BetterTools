package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Creative.HxCToolsTab;
import HxCKDMS.HxCTools.Handling.TextureHandler;
import net.minecraft.item.ItemSword;

public class VoidSword extends ItemSword
{
    public VoidSword(ToolMaterial material)
    {
        super(material);
        setCreativeTab(HxCToolsTab.HxCToolsTab);
        setUnlocalizedName("VoidSword");
        setTextureName(TextureHandler.VoidSword);
    }
}