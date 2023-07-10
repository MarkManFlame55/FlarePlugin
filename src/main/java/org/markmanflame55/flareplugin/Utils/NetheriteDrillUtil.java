package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class NetheriteDrillUtil {
    public static ItemStack giveNetheriteDrill() {
        ItemStack netherDrill = new ItemStack(Material.NETHERITE_PICKAXE, 1);
        ItemMeta netherDrillMeta = netherDrill.getItemMeta();
        netherDrillMeta.setDisplayName(ChatColor.GOLD + "Netherite Drill");
        netherDrillMeta.addEnchant(Enchantment.DIG_SPEED, 1 ,false);
        netherDrillMeta.setLocalizedName("netherite_drill");
        ArrayList<String> drillLore = new ArrayList<>();
        drillLore.add("");
        drillLore.add(ChatColor.GOLD + "Item Ability: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "HUMONGOUS HOLE");
        drillLore.add(ChatColor.WHITE + "Mine a 7x7 are from where you destroy a block");
        netherDrillMeta.setLore(drillLore);
        netherDrill.setItemMeta(netherDrillMeta);
        return netherDrill;
    }
}
