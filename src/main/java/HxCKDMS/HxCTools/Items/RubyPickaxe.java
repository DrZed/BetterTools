package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Creative.HxCToolsTab;
import HxCKDMS.HxCTools.Handling.TextureHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class RubyPickaxe extends ItemPickaxe
{
    public RubyPickaxe(Item.ToolMaterial material)
    {
        super(material);
        setCreativeTab(HxCToolsTab.HxCToolsTab);
        setUnlocalizedName("RubyPickaxe");
        setTextureName(TextureHandler.RubyPickaxe);
    }
}