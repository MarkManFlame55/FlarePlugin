package org.markmanflame55.flareplugin.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.markmanflame55.flareplugin.Utils.FunnySwordUtil;

public class funnyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player p) {
            if (p.hasPermission("operator")) {
                ItemStack funnySword = FunnySwordUtil.giveFunnySword();
                p.getInventory().addItem(funnySword);
            }
            else {
                p.sendMessage(ChatColor.RED + "You are not funny enough");
            }
        }
        return true;
    }
}
