package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import javax.swing.plaf.metal.MetalBorders;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class RabbitBootsUtil {
    public static ItemStack giveRabbitBoots() {
        ItemStack rabbitBoots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta rabbitMeta = (LeatherArmorMeta) rabbitBoots.getItemMeta();
        rabbitMeta.setDisplayName(ChatColor.BLUE + "Rabbit Boots");
        rabbitMeta.setLocalizedName("rabbit_boots");
        rabbitMeta.setColor(Color.fromRGB(204, 237, 111));
        rabbitMeta.addItemFlags(ItemFlag.HIDE_DYE);

        List<String> rabbitLore = new ArrayList<>();
        rabbitLore.add("");
        rabbitLore.add(ChatColor.GOLD + "Item Ability: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "JUMP BOOST");
        rabbitLore.add(ChatColor.WHITE + "Grant permanent Jump Boost III while wearing");
        rabbitMeta.setLore(rabbitLore);

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        rabbitMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);

        rabbitBoots.setItemMeta(rabbitMeta);
        return rabbitBoots;
    }
    public static ItemStack giveOnMenu() {
        ItemStack rabbitBoots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta rabbitMeta = (LeatherArmorMeta) rabbitBoots.getItemMeta();
        rabbitMeta.setDisplayName(ChatColor.BLUE + "Rabbit Boots");
        rabbitMeta.setLocalizedName("rabbit_boots");
        rabbitMeta.setColor(Color.fromRGB(204, 237, 111));
        rabbitMeta.addItemFlags(ItemFlag.HIDE_DYE);

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");
        rabbitMeta.setLore(itemLore);

        rabbitBoots.setItemMeta(rabbitMeta);
        return rabbitBoots;
    }
}
