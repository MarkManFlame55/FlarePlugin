package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class IronDrillUtil {
    public static ItemStack giveIronDrill() {
        ItemStack ironDrill = new ItemStack(Material.IRON_PICKAXE, 1);
        ItemMeta ironDrillMeta = ironDrill.getItemMeta();
        ironDrillMeta.setDisplayName(ChatColor.BLUE + "Iron Drill");
        ironDrillMeta.addEnchant(Enchantment.DIG_SPEED, 2 ,false);
        ironDrillMeta.setLocalizedName("iron_drill");

        ArrayList<String> drillLore = new ArrayList<>();
        drillLore.add("");
        drillLore.add(ChatColor.GOLD + "Item Ability: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "BIG HOLE");
        drillLore.add(ChatColor.WHITE + "Mine a 3x3 are from where you destroy a block");
        ironDrillMeta.setLore(drillLore);
        ironDrill.setItemMeta(ironDrillMeta);
        return ironDrill;
    }
    public static ItemStack giveOnMenu() {
        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");

        ItemStack ironDrill = new ItemStack(Material.IRON_PICKAXE, 1);
        ItemMeta ironDrillMeta = ironDrill.getItemMeta();
        ironDrillMeta.setDisplayName(ChatColor.BLUE + "Iron Drill");
        ironDrillMeta.addEnchant(Enchantment.DIG_SPEED, 2 ,false);
        ironDrillMeta.setLore(itemLore);
        ironDrill.setItemMeta(ironDrillMeta);
        return ironDrill;
    }
}
