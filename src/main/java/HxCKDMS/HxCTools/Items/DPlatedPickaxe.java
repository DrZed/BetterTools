package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Creative.HxCToolsTab;
import HxCKDMS.HxCTools.Handling.TextureHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class DPlatedPickaxe extends ItemPickaxe
{
	public DPlatedPickaxe(Item.ToolMaterial material)
	{
		super(material);
        setCreativeTab(HxCToolsTab.HxCToolsTab);
		setUnlocalizedName("DPlatedPickaxe");
        setTextureName(TextureHandler.DPlatedPickaxe);
	}
}