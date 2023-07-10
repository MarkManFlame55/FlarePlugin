package org.markmanflame55.flareplugin.EventListeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.markmanflame55.flareplugin.FlarePlugin;
import org.markmanflame55.flareplugin.Utils.LavaExplorerSetUtil;

import java.util.Random;


public class LavaArmorEvent implements Listener {
    @EventHandler
    public void onInventoryClose(InventoryCloseEvent e) {
        Player p = (Player) e.getPlayer();
        giveEffect(p);
    }
    public void giveEffect(Player p) {
        new BukkitRunnable(){
            @Override
            public void run() {
                ItemStack helmet = p.getInventory().getHelmet();
                ItemStack chest = p.getInventory().getChestplate();
                ItemStack legs = p.getInventory().getLeggings();
                ItemStack boots = p.getInventory().getBoots();
                if (helmet != null) {
                    if (helmet.getItemMeta().getLocalizedName().equals("lava_helmet")) {
                        if (chest != null) {
                            if (chest.getItemMeta().getLocalizedName().equals("lava_chestplate")) {
                                if (legs != null) {
                                    if (legs.getItemMeta().getLocalizedName().equals("lava_leggings")) {
                                        if (boots != null) {
                                            if (boots.getItemMeta().getLocalizedName().equals("lava_boots")) {
                                                p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 200, 0));
                                            }
                                            else {
                                                p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
                                            }
                                        } else {
                                            p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
                                        }
                                    } else {
                                        p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
                                    }
                                } else {
                                    p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
                                }
                            } else {
                                p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
                            }
                        } else {
                            p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
                        }
                    } else {
                        p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
                    }
                } else {
                    p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
                }
            }
        }.runTaskTimer(FlarePlugin.getPlugin(FlarePlugin.class), 0, 20);
    }
    @EventHandler
    public void onEntityDeath(EntityDeathEvent e){
        if (e.getEntity() instanceof Strider) {
            Random r = new Random();
            float chance = r.nextFloat();
            if (chance <= 0.25f) {
                e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), LavaExplorerSetUtil.giveFilament());
            }
        }
        if (e.getEntity() instanceof Piglin) {
            Random r = new Random();
            float chance = r.nextFloat();
            if (chance <= 0.05f) {
                e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), LavaExplorerSetUtil.givePiglinBuckle());
            }
        }
        if (e.getEntity() instanceof PigZombie) {
            Random r = new Random();
            float chance = r.nextFloat();
            if (chance <= 0.30f) {
                e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), LavaExplorerSetUtil.givePiglinBuckle());
            }
        }
        if (e.getEntity() instanceof PiglinBrute) {
            Random r = new Random();
            float chance = r.nextFloat();
            if (chance <= 0.5f) {
                e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), LavaExplorerSetUtil.givePiglinBuckle());
            }
        }
    }
}
