package org.markmanflame55.flareplugin.EventListeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareSmithingEvent;
import org.markmanflame55.flareplugin.Utils.VampireSword;

public class SmithingRecipesResultEvent implements Listener {
    @EventHandler
    public void vampireResult(PrepareSmithingEvent e){
        if (e.getResult().getType().equals(Material.IRON_SWORD)) {
            e.getResult().setItemMeta(VampireSword.giveVampireSword().getItemMeta());
        }
    }
}
