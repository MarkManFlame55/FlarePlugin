package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class DiamondDrillUtil {
    public static ItemStack giveDiamondDrill() {
        ItemStack diamondDrill = new ItemStack(Material.DIAMOND_PICKAXE, 1);
        ItemMeta diamondDrillMeta = diamondDrill.getItemMeta();
        diamondDrillMeta.setDisplayName(ChatColor.DARK_PURPLE + "Diamond Drill");
        diamondDrillMeta.addEnchant(Enchantment.DIG_SPEED, 1 ,false);
        diamondDrillMeta.setLocalizedName("diamond_drill");
        ArrayList<String> drillLore = new ArrayList<>();
        drillLore.add("");
        drillLore.add(ChatColor.GOLD + "Item Ability: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "GIANT HOLE");
        drillLore.add(ChatColor.WHITE + "Mine a 5x5 are from where you destroy a block");
        diamondDrillMeta.setLore(drillLore);
        diamondDrill.setItemMeta(diamondDrillMeta);
        return diamondDrill;
    }
}
