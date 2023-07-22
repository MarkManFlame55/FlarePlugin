package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class RefinedCopperUtil {
    public static ItemStack giveIngot() {
        ItemStack ingot = new ItemStack(Material.COPPER_INGOT);
        ItemMeta itemMeta = ingot.getItemMeta();
        itemMeta.setDisplayName(ChatColor.GREEN + "Refined Copper");
        itemMeta.setLocalizedName("refined_copper");
        itemMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ingot.setItemMeta(itemMeta);
        return ingot;
    }
    public static ItemStack giveBlock() {
        ItemStack block = new ItemStack(Material.ORANGE_GLAZED_TERRACOTTA);
        ItemMeta itemMeta = block.getItemMeta();
        itemMeta.setDisplayName(ChatColor.BLUE + "Refined Copper Block");
        itemMeta.setLocalizedName("refined_copper_block");
        itemMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        block.setItemMeta(itemMeta);
        return block;
    }
    public static ItemStack giveIngotMenu() {
        ItemStack ingot = new ItemStack(Material.COPPER_INGOT);
        ItemMeta itemMeta = ingot.getItemMeta();
        itemMeta.setDisplayName(ChatColor.GREEN + "Refined Copper");
        itemMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");
        itemMeta.setLore(itemLore);

        ingot.setItemMeta(itemMeta);
        return ingot;
    }
    public static ItemStack giveBlockMenu() {
        ItemStack block = new ItemStack(Material.ORANGE_GLAZED_TERRACOTTA);
        ItemMeta itemMeta = block.getItemMeta();
        itemMeta.setDisplayName(ChatColor.BLUE + "Refined Copper Block");
        itemMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");
        itemMeta.setLore(itemLore);

        block.setItemMeta(itemMeta);
        return block;
    }
}
