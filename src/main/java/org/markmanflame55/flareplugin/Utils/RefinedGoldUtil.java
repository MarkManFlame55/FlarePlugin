package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class RefinedGoldUtil {
    public static ItemStack giveRefinedGold() {
        ItemStack refinedGold = new ItemStack(Material.GOLD_INGOT);
        ItemMeta goldMeta = refinedGold.getItemMeta();
        goldMeta.setDisplayName(ChatColor.BLUE + "Refined Gold");
        goldMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        goldMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        refinedGold.setItemMeta(goldMeta);
        return refinedGold;
    }
    public static ItemStack giveRefinedGoldBlock() {
        ItemStack refinedGoldBlock = new ItemStack(Material.YELLOW_GLAZED_TERRACOTTA);
        ItemMeta goldMeta= refinedGoldBlock.getItemMeta();
        goldMeta.setDisplayName(ChatColor.DARK_PURPLE + "Refined Gold Block");
        goldMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        goldMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        refinedGoldBlock.setItemMeta(goldMeta);
        return refinedGoldBlock;
    }
}
