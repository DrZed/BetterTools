package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Creative.HxCToolsTab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class BronzeAxe extends ItemAxe
{
	public BronzeAxe(Item.ToolMaterial material)
	{
		super(material);
        setCreativeTab(HxCToolsTab.HxCToolsTab);
		setUnlocalizedName("BronzeAxe");
	}
}