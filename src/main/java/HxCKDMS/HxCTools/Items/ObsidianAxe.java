package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Creative.HxCToolsTab;
import HxCKDMS.HxCTools.Handling.TextureHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ObsidianAxe extends ItemAxe
{
    public ObsidianAxe(Item.ToolMaterial material)
    {
        super(material);
        setCreativeTab(HxCToolsTab.HxCToolsTab);
        setUnlocalizedName("ObsidianAxe");
        setTextureName(TextureHandler.ObsidianAxe);
    }
}