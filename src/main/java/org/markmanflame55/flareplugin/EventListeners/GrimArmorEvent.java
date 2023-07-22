package org.markmanflame55.flareplugin.EventListeners;

import org.bukkit.entity.EntityCategory;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;


public class GrimArmorEvent implements Listener {
    @EventHandler
    public void onMobHit(EntityDamageByEntityEvent e){
        if (e.getDamager() instanceof Player player) {
            if (player.getInventory().getHelmet() != null && player.getInventory().getHelmet().getItemMeta().getLocalizedName().equalsIgnoreCase("grim_helmet")) {
                if (player.getInventory().getChestplate() != null && player.getInventory().getChestplate().getItemMeta().getLocalizedName().equalsIgnoreCase("grim_chestplate")) {
                    if (player.getInventory().getLeggings() != null && player.getInventory().getLeggings().getItemMeta().getLocalizedName().equalsIgnoreCase("grim_leggings")) {
                        if (player.getInventory().getBoots() != null && player.getInventory().getBoots().getItemMeta().getLocalizedName().equalsIgnoreCase("grim_boots")) {
                            if (e.getEntity() instanceof LivingEntity) {
                                if (((LivingEntity) e.getEntity()).getCategory().equals(EntityCategory.UNDEAD)) {
                                    e.setDamage(e.getDamage() + ((e.getDamage()*50)/100));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
