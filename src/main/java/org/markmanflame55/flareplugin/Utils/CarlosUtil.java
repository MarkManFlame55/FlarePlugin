package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.w3c.dom.Attr;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CarlosUtil {
    public static ItemStack giveCarlos() {
        ItemStack carlos = new ItemStack(Material.SKELETON_SKULL);
        ItemMeta carlosMeta = carlos.getItemMeta();
        carlosMeta.setDisplayName(ChatColor.GREEN + "Carlos");
        carlosMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 8, true);

        AttributeModifier carlosArmor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        carlosMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, carlosArmor);

        carlos.setItemMeta(carlosMeta);
        return carlos;
    }
    public static ItemStack giveItem() {
        ItemStack carlos = new ItemStack(Material.SKELETON_SKULL);
        ItemMeta carlosMeta = carlos.getItemMeta();
        carlosMeta.setDisplayName(ChatColor.GREEN + "Carlos");
        carlosMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 8, true);

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");

        carlosMeta.setLore(itemLore);
        carlos.setItemMeta(carlosMeta);
        return carlos;
    }
    public static ItemStack giveSoul() {
        ItemStack soul = new ItemStack(Material.WHITE_DYE);
        ItemMeta soulMeta = soul.getItemMeta();
        soulMeta.setDisplayName(ChatColor.GREEN + "Carlos´ Soul");
        soulMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        soulMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        List<String> soulLore = new ArrayList<>();
        soulLore.add("");
        soulLore.add(ChatColor.DARK_GRAY + "Let me be the matter that enters");
        soulLore.add(ChatColor.DARK_GRAY + "into your black hole");

        soulMeta.setLore(soulLore);
        soul.setItemMeta(soulMeta);
        return soul;
    }
    public static ItemStack giveSoulItem() {
        ItemStack soul = new ItemStack(Material.WHITE_DYE);
        ItemMeta soulMeta = soul.getItemMeta();
        soulMeta.setDisplayName(ChatColor.GREEN + "Carlos´ Soul");
        soulMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        soulMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");
        soulMeta.setLore(itemLore);
        soul.setItemMeta(soulMeta);
        return soul;
    }
}
