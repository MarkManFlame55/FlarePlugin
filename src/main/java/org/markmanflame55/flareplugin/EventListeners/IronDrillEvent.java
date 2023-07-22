package org.markmanflame55.flareplugin.EventListeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.EnchantingInventory;
import org.bukkit.inventory.GrindstoneInventory;
import org.bukkit.inventory.ItemStack;
import org.markmanflame55.flareplugin.Utils.HealerWandUtil;
import org.markmanflame55.flareplugin.Utils.IronDrillUtil;

import java.util.ArrayList;
import java.util.List;

public class IronDrillEvent implements Listener {
    BlockFace blckface = null;
    @EventHandler
    public void onClick(PlayerInteractEvent e) {
        if (e.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
            blckface = e.getBlockFace();
        }
        else {
            return;
        }
    }
    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        Block block = e.getBlock();
        ItemStack item = e.getPlayer().getInventory().getItemInMainHand();
        if (item.getItemMeta() != null) {
            if (item.getItemMeta().getLocalizedName().equalsIgnoreCase("iron_drill")) {
                List<Block> minedArea = new ArrayList<>();
                if (blckface.equals(BlockFace.UP) || blckface.equals(BlockFace.DOWN)) {
                    Block bl1 = block.getRelative(BlockFace.EAST);
                    minedArea.add(bl1);
                    Block bl2 = block.getRelative(BlockFace.WEST);
                    minedArea.add(bl2);
                    Block bl3 = block.getRelative(BlockFace.NORTH);
                    minedArea.add(bl3);
                    Block bl4 = block.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl4);
                    Block bl5 = block.getRelative(BlockFace.SOUTH_WEST);
                    minedArea.add(bl5);
                    Block bl6 = block.getRelative(BlockFace.SOUTH_EAST);
                    minedArea.add(bl6);
                    Block bl7 = block.getRelative(BlockFace.NORTH_EAST);
                    minedArea.add(bl7);
                    Block bl8 = block.getRelative(BlockFace.NORTH_WEST);
                    minedArea.add(bl8);

                    for (Block i : minedArea) {
                        if (!i.getType().equals(Material.BEDROCK)) {
                            i.breakNaturally();
                        }
                    }
                }
                if (blckface.equals(BlockFace.NORTH) || (blckface.equals(BlockFace.SOUTH))) {
                    Block bl1 = block.getRelative(BlockFace.EAST);
                    minedArea.add(bl1);
                    Block bl2 = block.getRelative(BlockFace.WEST);
                    minedArea.add(bl2);
                    Block bl3 = block.getRelative(BlockFace.UP);
                    minedArea.add(bl3);
                    Block bl4 = block.getRelative(BlockFace.DOWN);
                    minedArea.add(bl4);
                    Block bl5 = bl1.getRelative(BlockFace.UP);
                    minedArea.add(bl5);
                    Block bl6 = bl1.getRelative(BlockFace.DOWN);
                    minedArea.add(bl6);
                    Block bl7 = bl2.getRelative(BlockFace.UP);
                    minedArea.add(bl7);
                    Block bl8 = bl2.getRelative(BlockFace.DOWN);
                    minedArea.add(bl8);

                    for (Block i : minedArea) {
                        if (!i.getType().equals(Material.BEDROCK)) {
                            i.breakNaturally();
                        }
                    }
                }
                if (blckface.equals(BlockFace.EAST) || (blckface.equals(BlockFace.WEST))) {
                    Block bl1 = block.getRelative(BlockFace.NORTH);
                    minedArea.add(bl1);
                    Block bl2 = block.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl2);
                    Block bl3 = block.getRelative(BlockFace.UP);
                    minedArea.add(bl3);
                    Block bl4 = block.getRelative(BlockFace.DOWN);
                    minedArea.add(bl4);
                    Block bl5 = bl1.getRelative(BlockFace.UP);
                    minedArea.add(bl5);
                    Block bl6 = bl1.getRelative(BlockFace.DOWN);
                    minedArea.add(bl6);
                    Block bl7 = bl2.getRelative(BlockFace.UP);
                    minedArea.add(bl7);
                    Block bl8 = bl2.getRelative(BlockFace.DOWN);
                    minedArea.add(bl8);

                    for (Block i : minedArea) {
                        if (!i.getType().equals(Material.BEDROCK)) {
                            i.breakNaturally();
                        }
                    }
                }
            }
        }
    }
    @EventHandler
    public void onTablesClick(InventoryClickEvent e) {
        ItemStack item = e.getCurrentItem();
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory() instanceof AnvilInventory) {
            if (item != null) {
                if (item.getItemMeta() != null) {
                    if (item.getItemMeta().getLocalizedName().equalsIgnoreCase("iron_drill")) {
                        p.sendMessage(ChatColor.RED + "You can not use this item here");
                        e.setCancelled(true);
                    }
                }
            }
        }
        if (e.getInventory() instanceof EnchantingInventory) {
            if (item != null) {
                if (item.getItemMeta() != null) {
                    if (item.getItemMeta().getLocalizedName().equalsIgnoreCase("iron_drill")) {
                        p.sendMessage(ChatColor.RED + "You can not use this item here");
                        e.setCancelled(true);
                    }
                }
            }
        }
        if (e.getInventory() instanceof GrindstoneInventory) {
            if (item != null) {
                if (item.getItemMeta() != null) {
                    if (item.getItemMeta().getLocalizedName().equalsIgnoreCase("iron_drill")) {
                        p.sendMessage(ChatColor.RED + "You can not use this item here");
                        e.setCancelled(true);
                    }
                }
            }
        }
    }
}
