package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Creative.HxCToolsTab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class AventurineSpade extends ItemSpade
{
	public AventurineSpade(Item.ToolMaterial material)
	{
		super(material);
        setCreativeTab(HxCToolsTab.HxCToolsTab);
        setUnlocalizedName("AventurineSpade");
	}
}