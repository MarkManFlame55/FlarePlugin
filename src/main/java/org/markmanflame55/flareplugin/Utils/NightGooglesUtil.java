package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class NightGooglesUtil {
    public static ItemStack giveGoggles() {
        ItemStack goggles = new ItemStack(Material.BLUE_STAINED_GLASS);
        ItemMeta itemMeta = goggles.getItemMeta();
        itemMeta.setDisplayName(ChatColor.BLUE + "Night Goggles");
        itemMeta.setLocalizedName("night_goggles");
        itemMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        List<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.GOLD + "Item Ability: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "DARK KNIGHT");
        itemLore.add(ChatColor.WHITE + "Grants permanent Night Vision Effect while");
        itemLore.add(ChatColor.WHITE + "wearing Night Goggles");
        itemLore.add("");
        itemMeta.setLore(itemLore);

        goggles.setItemMeta(itemMeta);
        return goggles;
    }
    public static ItemStack giveGogglesMenu(){
        ItemStack goggles = new ItemStack(Material.BLUE_STAINED_GLASS);
        ItemMeta itemMeta = goggles.getItemMeta();
        itemMeta.setDisplayName(ChatColor.BLUE + "Night Goggles");
        itemMeta.setLocalizedName("night_goggles");
        itemMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");
        itemMeta.setLore(itemLore);

        goggles.setItemMeta(itemMeta);

        return goggles;
    }
}
