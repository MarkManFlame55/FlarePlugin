package org.markmanflame55.flareplugin.EventListeners;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.markmanflame55.flareplugin.FlarePlugin;
import org.markmanflame55.flareplugin.Utils.NightGooglesUtil;

public class NightGogglesEvent implements Listener {
    @EventHandler
    public void onPlayerRightClick (PlayerInteractEvent e) {
        if (e.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null && e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLocalizedName().equalsIgnoreCase("night_goggles")) {
            if (e.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                if (e.getPlayer().getInventory().getHelmet() == null) {
                    ItemStack helmet = e.getPlayer().getInventory().getItemInMainHand();
                    e.getPlayer().getInventory().setHelmet(helmet);
                    e.getPlayer().getInventory().remove(helmet);
                    e.getPlayer().playSound(e.getPlayer(), Sound.ITEM_ARMOR_EQUIP_CHAIN, 1.0f, 1.0f);
                    helmetEffect(e.getPlayer());
                } else {
                    e.getPlayer().sendMessage(ChatColor.GRAY + "" + ChatColor.ITALIC + "Remove your helmet to equip Night Goggles");
                }
            } else {
                e.getPlayer().sendMessage(ChatColor.GRAY + "" + ChatColor.ITALIC + "Right click air to equip Night Goggles");
            }
        }
    }
    public void helmetEffect(Player player) {
        new BukkitRunnable() {
            @Override
            public void run() {
                if (player.getInventory().getHelmet() != null) {
                    if (player.getInventory().getHelmet().getItemMeta() != null) {
                        if (player.getInventory().getHelmet().getItemMeta().getLocalizedName().equalsIgnoreCase("night_goggles")) {
                            player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 20 * 20, 0, false, false));
                        } else {
                            player.removePotionEffect(PotionEffectType.NIGHT_VISION);
                        }
                    } else {
                        player.removePotionEffect(PotionEffectType.NIGHT_VISION);
                    }
                } else {
                    player.removePotionEffect(PotionEffectType.NIGHT_VISION);
                }
            }
        }.runTaskTimer(FlarePlugin.getPlugin(FlarePlugin.class), 0, 1);
    }
}
