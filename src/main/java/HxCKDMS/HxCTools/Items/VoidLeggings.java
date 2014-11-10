package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Handling.TextureHandler;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.UUID;
import java.util.jar.Attributes;

public class VoidLeggings extends ItemArmor {
    public UUID SpeedUUID = UUID.fromString("13a8d246-c5d8-4af4-9b04-5f481fc93254");
    public VoidLeggings(ArmorMaterial Material, int a, int b) {
        super(Material, a, b);
        setTextureName(TextureHandler.VoidLeggings);
        setNoRepair();
    }
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor)
    {
        player.heal(5);
        player.inventory.armorItemInSlot(2).setItemDamage(0);
        IAttributeInstance ps = player.getAttributeMap().getAttributeInstance(SharedMonsterAttributes.movementSpeed);
        AttributeModifier SpeedBuff = new AttributeModifier(SpeedUUID, "SpeedBuffedPants", 0.4F, 1);
        ps.removeModifier(SpeedBuff);
        ps.applyModifier(SpeedBuff);
    }
}
