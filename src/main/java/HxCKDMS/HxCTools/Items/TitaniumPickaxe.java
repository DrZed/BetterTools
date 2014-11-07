package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Creative.HxCToolsTab;
import HxCKDMS.HxCTools.Handling.TextureHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class TitaniumPickaxe extends ItemPickaxe
{
    public TitaniumPickaxe(Item.ToolMaterial material)
    {
        super(material);
        setCreativeTab(HxCToolsTab.HxCToolsTab);
        setUnlocalizedName("TitaniumPickaxe");
        setTextureName(TextureHandler.TitaniumPickaxe);
    }
}