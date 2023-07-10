package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.checkerframework.checker.units.qual.A;
import org.w3c.dom.Attr;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SculkWandUtil {
    public static ItemStack giveWand() {
        ItemStack wand = new ItemStack(Material.ECHO_SHARD);
        ItemMeta wandMeta = wand.getItemMeta();
        wandMeta.setDisplayName(ChatColor.GOLD + "Sculk Wand");
        wandMeta.setLocalizedName("sculk_wand");
        wandMeta.addEnchant(Enchantment.DURABILITY, 1 ,false);
        wandMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        AttributeModifier antiStack = new AttributeModifier(UUID.randomUUID(), "generic.Luck", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        wandMeta.addAttributeModifier(Attribute.GENERIC_LUCK, antiStack);

        List<String> wandLore = new ArrayList<>();
        wandLore.add("");
        wandLore.add(ChatColor.GOLD + "Item Ability: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "Sonic Boom");
        wandLore.add(ChatColor.WHITE + "Cast a powerfull Sonic Boom dealing " + ChatColor.RED + "7.5❤" + ChatColor.WHITE + " to the enemy!");
        wandLore.add(ChatColor.DARK_GRAY + "10s cooldown");

        wandMeta.setLore(wandLore);
        wand.setItemMeta(wandMeta);
        return wand;
    }
    public static ItemStack giveOnMenu() {

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");

        ItemStack item20 = new ItemStack(Material.ECHO_SHARD);
        ItemMeta item20Meta = item20.getItemMeta();
        item20Meta.setDisplayName(ChatColor.GOLD + "Sculk Wand");
        item20Meta.addEnchant(Enchantment.LUCK, 10 , true);
        item20Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item20Meta.setLore(itemLore);
        item20.setItemMeta(item20Meta);
        return item20;
    }
}
