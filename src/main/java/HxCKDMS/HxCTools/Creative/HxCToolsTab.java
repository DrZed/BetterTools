package HxCKDMS.HxCTools.Creative;

import HxCKDMS.HxCTools.Handling.ContentRegistry;
import HxCKDMS.HxCTools.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class HxCToolsTab{
    public static CreativeTabs HxCToolsTab = new CreativeTabs(Reference.MOD_ID){
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return new ItemStack(ContentRegistry.Hammer).getItem();
        }
    };
}
