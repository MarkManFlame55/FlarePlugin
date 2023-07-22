package org.markmanflame55.flareplugin.EventListeners;

import org.bukkit.ChatColor;
import org.bukkit.GameEvent;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.world.GenericGameEvent;
import org.markmanflame55.flareplugin.Utils.DragonWingsUtil;

import java.net.http.WebSocket;
import java.util.Random;

public class DragonDeathEvent implements Listener {
    @EventHandler
    public void onDragonDeath(EntityDeathEvent e) {
        Player player = e.getEntity().getKiller();
        if (e.getEntity() instanceof EnderDragon) {
            int xp = player.getLevel();
            if (xp != 0) {
                if (xp <= 10) {
                    player.sendMessage(ChatColor.RED + "Not enought levels to get Dragon Wings");
                    return;
                } else if (xp > 100) {
                    player.getInventory().addItem(DragonWingsUtil.giveCore());
                    player.setLevel(xp/3);
                    player.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "CONGRATS!! " + ChatColor.GREEN + "You dropped Wings Core");
                } else {
                    Random r = new Random();
                    int low = 10;
                    int high = 100;
                    int result = r.nextInt(high - low) + low;
                    player.sendMessage(Integer.toString(result));
                    if (xp >= result) {
                        player.getInventory().addItem(DragonWingsUtil.giveCore());
                        player.setLevel(xp/2);
                        player.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "CONGRATS!! " + ChatColor.GREEN + "You dropped Wings Core");
                    }
                }
            }
        }
    }
}
