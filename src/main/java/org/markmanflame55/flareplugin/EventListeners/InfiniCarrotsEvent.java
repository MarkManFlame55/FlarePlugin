package org.markmanflame55.flareplugin.EventListeners;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.EnchantingInventory;
import org.bukkit.inventory.GrindstoneInventory;
import org.bukkit.inventory.ItemStack;
import org.markmanflame55.flareplugin.Utils.InfiniCarrotsUtil;
import org.markmanflame55.flareplugin.Utils.NetheriteDrillUtil;

public class InfiniCarrotsEvent implements Listener {
    @EventHandler
    public void onPlayerEats(PlayerItemConsumeEvent e){
        Player p = e.getPlayer();
        ItemStack item = p.getItemInUse();
        if( item != null) {
            if (item.equals(InfiniCarrotsUtil.giveInfiniCarrot())) {
                ItemStack carrot = InfiniCarrotsUtil.giveInfiniCarrot();
                p.getInventory().addItem(carrot);
                p.playSound(p, Sound.BLOCK_ENCHANTMENT_TABLE_USE, 0.7f, 1.1f);
                p.getInventory().removeItem(carrot);
            }
            if (item.equals(InfiniCarrotsUtil.giveInfiniGCarrot())) {
                ItemStack carrot = InfiniCarrotsUtil.giveInfiniGCarrot();
                p.getInventory().addItem(carrot);
                p.playSound(p, Sound.BLOCK_ENCHANTMENT_TABLE_USE, 0.7f, 1.1f);
                p.getInventory().removeItem(carrot);
            }
        }
    }
    @EventHandler
    public void onTablesClick(InventoryClickEvent e) {
        ItemStack item = e.getCurrentItem();
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory() instanceof AnvilInventory) {
            if (item != null) {
                if (item.equals(InfiniCarrotsUtil.giveInfiniCarrot()) || item.equals(InfiniCarrotsUtil.giveInfiniGCarrot())) {
                    p.sendMessage(ChatColor.RED + "You can not use this item here");
                    e.setCancelled(true);
                }
            }
        }
        if (e.getInventory() instanceof GrindstoneInventory) {
            if (item != null) {
                if (item.equals(InfiniCarrotsUtil.giveInfiniCarrot()) || item.equals(InfiniCarrotsUtil.giveInfiniGCarrot())) {
                    p.sendMessage(ChatColor.RED + "You can not use this item here");
                    e.setCancelled(true);
                }
            }
        }
    }
}
