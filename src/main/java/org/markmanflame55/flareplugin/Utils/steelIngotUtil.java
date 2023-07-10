package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class steelIngotUtil {
    public static ItemStack giveSteelIngot() {
        ItemStack steelIngot = new ItemStack(Material.IRON_INGOT);
        ItemMeta ingotMeta = steelIngot.getItemMeta();
        ingotMeta.addEnchant(Enchantment.DURABILITY, 1 ,false);
        ingotMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ingotMeta.setDisplayName(ChatColor.GREEN + "Steel Ingot");
        steelIngot.setItemMeta(ingotMeta);
        return steelIngot;
    }
    public static  ItemStack giveSteelBlock() {
        ItemStack steelBlock = new ItemStack(Material.SMOOTH_STONE);
        ItemMeta blockMeta = steelBlock.getItemMeta();
        blockMeta.addEnchant(Enchantment.ARROW_INFINITE, 1, false);
        blockMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        blockMeta.setDisplayName(ChatColor.BLUE + "Steel Block");
        steelBlock.setItemMeta(blockMeta);
        return steelBlock;
    }
}
