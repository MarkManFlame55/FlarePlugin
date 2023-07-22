package org.markmanflame55.flareplugin.EventListeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class RecipeInventoriesClickPrevent implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getView().getTitle().equalsIgnoreCase("Recipes")) {
            e.setCancelled(true);
        }
    }
}
