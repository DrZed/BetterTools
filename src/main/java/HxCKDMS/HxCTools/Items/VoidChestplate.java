package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Handling.TextureHandler;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.UUID;

public class VoidChestplate extends ItemArmor {
    public UUID HealthUUID = UUID.fromString("d7aa109c-cbba-4587-b684-9b70c396bbb0");
    public VoidChestplate(ArmorMaterial Material, int a, int b) {
        super(Material, a, b);
        setTextureName(TextureHandler.VoidChestplate);
    }
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
        player.heal(5);
        player.inventory.armorItemInSlot(2).setItemDamage(0);
        player.xpCooldown = 0;
        player.extinguish();
        player.addPotionEffect(new PotionEffect(Potion.field_76444_x.getId(), -1, 10, false));
        IAttributeInstance ph = player.getAttributeMap().getAttributeInstance(SharedMonsterAttributes.maxHealth);
        AttributeModifier HealthBuff = new AttributeModifier(HealthUUID, "VoidChestplate", 10, 1);
        ph.removeModifier(HealthBuff);
        ph.applyModifier(HealthBuff);
    }
}
