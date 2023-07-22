package org.markmanflame55.flareplugin.EventListeners;

import org.bukkit.GameEvent;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.world.GenericGameEvent;
import org.bukkit.inventory.ItemStack;
import org.markmanflame55.flareplugin.Utils.CarlosUtil;

public class CarlosListener implements Listener {
    @EventHandler
    public void onCarlosEquip(GenericGameEvent e){
        if (e.getEvent().equals(GameEvent.EQUIP)) {
            if (e.getEntity() instanceof Player p) {
                ItemStack helmet = p.getInventory().getHelmet();
                if (helmet != null) {
                    if (helmet.equals(CarlosUtil.giveCarlos())){
                        p.playSound(p, Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 0.5f);
                    }
                }
            }
        }
    }
}
