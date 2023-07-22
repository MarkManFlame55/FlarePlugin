package org.markmanflame55.flareplugin.EventListeners;

import org.bukkit.Particle;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Spider;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class VampireSwordEvent implements Listener {
    @EventHandler
    public void onPlayerHit(EntityDamageByEntityEvent e) {
        if (e.getDamager() instanceof Player player) {
            if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
                if (player.getInventory().getItemInMainHand().getItemMeta().hasLocalizedName() && player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().equalsIgnoreCase("vampire_sword")) {
                    if (player.getHealth() != 20) {
                        if (player.getHealth()+1 > 20) {
                            player.setHealth(20);
                            player.spawnParticle(Particle.HEART, player.getLocation(), 1);
                        } else {
                            player.setHealth(player.getHealth()+1);
                            player.spawnParticle(Particle.HEART, player.getLocation(), 1);
                        }
                    }
                }
            }
        }
        if (e.getEntity() instanceof WitherSkeleton vampire && vampire.getScoreboardTags().contains("vampire") || e.getEntity() instanceof Spider) {
            if (e.getDamager() instanceof LivingEntity) {
                if (((LivingEntity) e.getDamager()).getEquipment().getItemInMainHand().getItemMeta() != null) {
                    if (((LivingEntity) e.getDamager()).getEquipment().getItemInMainHand().getItemMeta().hasLocalizedName()) {
                        if (((LivingEntity) e.getDamager()).getEquipment().getItemInMainHand().getItemMeta().getLocalizedName().equalsIgnoreCase("vampire_sword")) {
                            e.setDamage(e.getDamage() + (e.getDamage()*50)/100);
                        }
                    }
                }
            }
        }
    }
}
