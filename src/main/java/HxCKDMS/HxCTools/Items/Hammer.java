package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Creative.HxCToolsTab;
import HxCKDMS.HxCTools.Handling.TextureHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class Hammer extends Item{

    public Hammer()
    {
        super();
        setCreativeTab(HxCToolsTab.HxCToolsTab);
        setMaxDamage(32);
        setTextureName(TextureHandler.Hammer);
    }

    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
    {
        return false;
    }
}
