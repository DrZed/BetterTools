package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Creative.HxCToolsTab;
import HxCKDMS.HxCTools.Handling.TextureHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class AventurineHoe extends ItemHoe
{
	public AventurineHoe(Item.ToolMaterial material)
	{
		super(material);
        setCreativeTab(HxCToolsTab.HxCToolsTab);
		setUnlocalizedName("AventurineHoe");
        setTextureName(TextureHandler.AventurineHoe);
	}
}