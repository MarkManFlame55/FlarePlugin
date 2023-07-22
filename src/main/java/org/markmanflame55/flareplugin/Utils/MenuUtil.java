package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class MenuUtil {
    public static ItemStack giveMenuItem() {
        ItemStack menuItem = new ItemStack(Material.LODESTONE, 1);
        ItemMeta menuMeta = menuItem.getItemMeta();
        menuMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Operator Block");
        menuMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        menuMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ArrayList<String> menuLore = new ArrayList<>();
        menuLore.add("");
        menuLore.add(ChatColor.GOLD + "Item Ability: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "Open Operator Menu");
        menuLore.add(ChatColor.WHITE + "Open a window to see all the Flare Items");
        menuMeta.setLore(menuLore);
        menuItem.setItemMeta(menuMeta);
        return menuItem;
    }
}
