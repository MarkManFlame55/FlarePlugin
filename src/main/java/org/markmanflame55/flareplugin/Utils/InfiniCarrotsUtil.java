package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class InfiniCarrotsUtil {
    public static ItemStack giveInfiniCarrot() {
        ItemStack infiniCarrot = new ItemStack(Material.CARROT);
        ItemMeta carrotMeta = infiniCarrot.getItemMeta();
        carrotMeta.setDisplayName(ChatColor.GREEN + "Infini-Carrot");
        carrotMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        carrotMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ArrayList<String> carrotLore = new ArrayList<>();
        carrotLore.add("");
        carrotLore.add(ChatColor.GOLD + "Item Ability: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "HUNGER NO MORE!");
        carrotLore.add(ChatColor.WHITE + "This carrot will never be entirely cosumed!");
        carrotMeta.setLore(carrotLore);
        infiniCarrot.setItemMeta(carrotMeta);
        return infiniCarrot;
    }
    public static ItemStack giveInfiniGCarrot() {
        ItemStack infiniGCarrot = new ItemStack(Material.GOLDEN_CARROT);
        ItemMeta carrotMeta = infiniGCarrot.getItemMeta();
        carrotMeta.setDisplayName(ChatColor.DARK_PURPLE + "Infini-Golden Carrot");
        carrotMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        carrotMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ArrayList<String> carrotLore = new ArrayList<>();
        carrotLore.add("");
        carrotLore.add(ChatColor.GOLD + "Item Ability: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "SATURATION BUFF!");
        carrotLore.add(ChatColor.WHITE + "This carrot will never be entirely cosumed!");
        carrotMeta.setLore(carrotLore);
        infiniGCarrot.setItemMeta(carrotMeta);
        return infiniGCarrot;
    }
}
