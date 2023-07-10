package org.markmanflame55.flareplugin.EventListeners;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.EnchantingInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.markmanflame55.flareplugin.Utils.AspectOfTheVoidUtil;
import org.markmanflame55.flareplugin.Utils.HealerWandUtil;

import java.util.AbstractList;
import java.util.HashMap;
import java.util.Set;
import java.util.UUID;

public class HealerWandEvent implements Listener {

    private final HashMap<UUID, Long> cooldown;

    //key = uuid player
    //long = epoch time when the command runs
    public HealerWandEvent(){
        this.cooldown = new HashMap<>();
    }

    @EventHandler
    public void onRightClick(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        ItemStack item = e.getItem();
        if (item != null) {
            if (item.equals(HealerWandUtil.giveHealerWand())) {
                if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                    if (!this.cooldown.containsKey(p.getUniqueId())) {
                        this.cooldown.put(p.getUniqueId(), System.currentTimeMillis());
                        p.removePotionEffect(PotionEffectType.ABSORPTION);
                        p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 80, 3));
                        p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 60,1));
                        p.sendMessage(ChatColor.GREEN + "You healed yourself!");
                    } else {
                        //difference in millisecs
                        long timeElapsed = System.currentTimeMillis() - cooldown.get(p.getUniqueId());
                        if (timeElapsed >= 6000) {
                            this.cooldown.put(p.getUniqueId(), System.currentTimeMillis());
                            p.removePotionEffect(PotionEffectType.ABSORPTION);
                            p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 80, 3));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 60,1));
                            p.sendMessage(ChatColor.GREEN + "You healed yourself!");
                        } else {
                            p.sendMessage(ChatColor.RED + "Healer Wand is on cooldown!");
                        }
                    }

                }
            }
        }
    }
    @EventHandler
    public void onHitEntity(EntityDamageByEntityEvent e) {
        if (e.getDamager() instanceof Player p) {
            ItemStack item = p.getInventory().getItemInMainHand();
            //Player hit Player
            if (item.equals(HealerWandUtil.giveHealerWand())) {
                if (e.getEntity() instanceof Player pWasHit) {
                    if (!this.cooldown.containsKey(p.getUniqueId())) {
                        this.cooldown.put(p.getUniqueId(), System.currentTimeMillis());

                        pWasHit.removePotionEffect(PotionEffectType.ABSORPTION);
                        pWasHit.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 80, 3));
                        pWasHit.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 60,1));
                        pWasHit.sendMessage(ChatColor.GREEN + ((Player) e.getDamager()).getDisplayName() + "healed you!");
                        p.sendMessage(ChatColor.GREEN + "You healed " + pWasHit.getDisplayName());

                    } else {
                        long timeElapsed = System.currentTimeMillis() - cooldown.get(p.getUniqueId());
                        if (timeElapsed >= 6000) {
                            this.cooldown.put(p.getUniqueId(), System.currentTimeMillis());

                            pWasHit.removePotionEffect(PotionEffectType.ABSORPTION);
                            pWasHit.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 80, 3));
                            pWasHit.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 60,1));
                            pWasHit.sendMessage(ChatColor.GREEN + ((Player) e.getDamager()).getDisplayName() + " healed you!");
                            p.sendMessage(ChatColor.GREEN + "You healed " + pWasHit.getDisplayName());
                        } else {
                            p.sendMessage(ChatColor.RED + "Healer Wand is on cooldown");
                        }
                    }

                }
                //Player hit LivingEntity
                if (e.getEntity() instanceof LivingEntity eWasHit) {
                    if (!this.cooldown.containsKey(p.getUniqueId())) {
                        this.cooldown.put(p.getUniqueId(), System.currentTimeMillis());

                        eWasHit.removePotionEffect(PotionEffectType.ABSORPTION);
                        eWasHit.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 80, 3));
                        eWasHit.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 60,1));
                        p.sendMessage(ChatColor.GREEN + "You healed " + eWasHit.getName());
                    } else {
                        long timeElapsed = System.currentTimeMillis() - cooldown.get(p.getUniqueId());
                        if (timeElapsed >= 10000) {
                            this.cooldown.put(p.getUniqueId(), System.currentTimeMillis());

                            eWasHit.removePotionEffect(PotionEffectType.ABSORPTION);
                            eWasHit.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 80, 3));
                            eWasHit.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200,4));
                            p.sendMessage(ChatColor.GREEN + "You healed " + eWasHit.getName());
                        } else {
                            p.sendMessage(ChatColor.RED + "Healer Wand is on cooldown!");
                        }
                    }
                }
                e.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void onTablesClick(InventoryClickEvent e) {
        ItemStack item = e.getCurrentItem();
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory() instanceof AnvilInventory) {
            if (item != null) {
                if (item.equals(HealerWandUtil.giveHealerWand())) {
                    p.sendMessage(ChatColor.RED + "You can not use this item here");
                    e.setCancelled(true);
                }
            }
        }
        if (e.getInventory() instanceof EnchantingInventory) {
            if (item != null) {
                if (item.equals(HealerWandUtil.giveHealerWand())) {
                    p.sendMessage(ChatColor.RED + "You can not use this item here");
                    e.setCancelled(true);
                }
            }
        }
    }
}
