package org.markmanflame55.flareplugin.EventListeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;
import java.util.List;
import java.util.Random;

public class EmeraldArmorEvent implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e){
        Player p = e.getPlayer();
        ItemStack helmet = p.getInventory().getHelmet();
        ItemStack chest = p.getInventory().getChestplate();
        ItemStack legs = p.getInventory().getLeggings();
        ItemStack boots = p.getInventory().getBoots();
        if (helmet != null && helmet.getItemMeta().getLocalizedName().equals("emerald_helmet")) {
            if (chest != null && chest.getItemMeta().getLocalizedName().equals("emerald_chestplate")) {
                if (legs != null && legs.getItemMeta().getLocalizedName().equals("emerald_leggings")) {
                    if (boots != null && boots.getItemMeta().getLocalizedName().equals("emerald_boots")) {
                        if (e.getBlock().getType().equals(Material.DIAMOND_ORE) || e.getBlock().getType().equals(Material.DEEPSLATE_DIAMOND_ORE)) {
                            Random r = new Random();
                            float chance = r.nextFloat();
                            if (chance <= 0.25f) {
                                e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.DIAMOND));
                            }
                        }
                        if (e.getBlock().getType().equals(Material.IRON_ORE) || e.getBlock().getType().equals(Material.DEEPSLATE_IRON_ORE)) {
                            Random r = new Random();
                            float chance = r.nextFloat();
                            if (chance <= 0.25f) {
                                e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.RAW_IRON));
                            }
                        }
                        if (e.getBlock().getType().equals(Material.GOLD_ORE) || e.getBlock().getType().equals(Material.DEEPSLATE_GOLD_ORE)) {
                            Random r = new Random();
                            float chance = r.nextFloat();
                            if (chance <= 0.25f) {
                                e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.RAW_GOLD));
                            }
                        }
                        if (e.getBlock().getType().equals(Material.COAL_ORE) || e.getBlock().getType().equals(Material.DEEPSLATE_COAL_ORE)) {
                            Random r = new Random();
                            float chance = r.nextFloat();
                            if (chance <= 0.25f) {
                                e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.COAL));
                            }
                        }
                        if (e.getBlock().getType().equals(Material.COPPER_ORE) || e.getBlock().getType().equals(Material.DEEPSLATE_COPPER_ORE)) {
                            Random r = new Random();
                            float chance = r.nextFloat();
                            if (chance <= 0.25f) {
                                e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.RAW_COPPER));
                            }
                        }
                        if (e.getBlock().getType().equals(Material.REDSTONE_ORE) ||e.getBlock().getType().equals(Material.DEEPSLATE_REDSTONE_ORE)) {
                            Random r = new Random();
                            float chance = r.nextFloat();
                            if (chance <= 0.25f) {
                                e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.REDSTONE, 4));
                            }
                        }
                        if (e.getBlock().getType().equals(Material.LAPIS_ORE) || e.getBlock().getType().equals(Material.DEEPSLATE_LAPIS_ORE)) {
                            Random r = new Random();
                            float chance = r.nextFloat();
                            if (chance <= 0.25f) {
                                e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.LAPIS_LAZULI, 3));
                            }
                        }
                        if (e.getBlock().getType().equals(Material.EMERALD_ORE) ||e.getBlock().getType().equals(Material.DEEPSLATE_EMERALD_ORE)) {
                            Random r = new Random();
                            float chance = r.nextFloat();
                            if (chance <= 0.25f) {
                                e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.EMERALD));
                            }
                        }
                        if (e.getBlock().getType().equals(Material.NETHER_GOLD_ORE)) {
                            Random r = new Random();
                            float chance = r.nextFloat();
                            if (chance <= 0.25f) {
                                e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.GOLD_INGOT));
                            }
                        }
                        if (e.getBlock().getType().equals(Material.NETHER_QUARTZ_ORE)) {
                            Random r = new Random();
                            float chance = r.nextFloat();
                            if (chance <= 0.25f) {
                                e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.QUARTZ));
                            }
                        }
                        if (e.getBlock().getType().equals(Material.ANCIENT_DEBRIS)) {
                            Random r = new Random();
                            float chance = r.nextFloat();
                            if (chance <= 0.25f) {
                                e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.ANCIENT_DEBRIS));
                            }
                        }
                    }
                }
            }
        }
    }
}
