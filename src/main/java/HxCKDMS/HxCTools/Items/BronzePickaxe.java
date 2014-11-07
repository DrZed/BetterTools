package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Creative.HxCToolsTab;
import HxCKDMS.HxCTools.Handling.TextureHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class BronzePickaxe extends ItemPickaxe
{
	public BronzePickaxe(Item.ToolMaterial material)
	{
		super(material);
        setCreativeTab(HxCToolsTab.HxCToolsTab);
		setUnlocalizedName("BronzePickaxe");
        setTextureName(TextureHandler.BronzePickaxe);
	}
}