package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class InfinityStoneUtil {
    public static ItemStack giveInfinityStone(){
        ItemStack infinityStone = new ItemStack(Material.MAGENTA_DYE);
        ItemMeta isMeta = infinityStone.getItemMeta();
        isMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Infinity Stone");
        isMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        isMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ArrayList<String> isLore = new ArrayList<>();
        isLore.add("");
        isLore.add(ChatColor.DARK_GRAY + "A powerfull ancient stone able");
        isLore.add(ChatColor.DARK_GRAY + "to make an infinite source of");
        isLore.add(ChatColor.DARK_GRAY + "valuable things");
        isMeta.setLore(isLore);
        infinityStone.setItemMeta(isMeta);
        return infinityStone;
    }
}
