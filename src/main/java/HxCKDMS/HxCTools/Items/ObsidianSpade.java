package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Creative.HxCToolsTab;
import HxCKDMS.HxCTools.Handling.TextureHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ObsidianSpade extends ItemSpade
{
    public ObsidianSpade(Item.ToolMaterial material)
    {
        super(material);
        setCreativeTab(HxCToolsTab.HxCToolsTab);
        setUnlocalizedName("ObsidianSpade");
        setTextureName(TextureHandler.ObsidianSpade);
    }
}