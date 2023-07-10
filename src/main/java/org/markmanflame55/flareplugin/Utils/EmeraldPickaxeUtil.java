package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class EmeraldPickaxeUtil {
    public static ItemStack givePickaxe() {
        ItemStack emeraldPickaxe = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta pickMeta = emeraldPickaxe.getItemMeta();
        pickMeta.setDisplayName(ChatColor.DARK_PURPLE + "Emerald Pickaxe");
        pickMeta.setLocalizedName("emerald_pickaxe");

        List<String> pickLore = new ArrayList<>();
        pickLore.add("");
        pickLore.add(ChatColor.GOLD + "Item Ability: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "Fortune");
        pickLore.add(ChatColor.WHITE + "Mining ores with this pickaxe has a 20% chance to get extra drops");
        pickMeta.setLore(pickLore);

        emeraldPickaxe.setItemMeta(pickMeta);
        return emeraldPickaxe;
    }
    public static ItemStack giveOnMenu() {
        ItemStack emeraldPickaxe = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta pickMeta = emeraldPickaxe.getItemMeta();
        pickMeta.setDisplayName(ChatColor.DARK_PURPLE + "Emerald Pickaxe");

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");
        pickMeta.setLore(itemLore);

        emeraldPickaxe.setItemMeta(pickMeta);
        return emeraldPickaxe;
    }
}
