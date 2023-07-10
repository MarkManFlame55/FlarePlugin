package org.markmanflame55.flareplugin.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.checkerframework.checker.units.qual.A;
import org.markmanflame55.flareplugin.Utils.MenuUtil;

import java.util.ArrayList;

public class menuCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player p) {
            if (p.hasPermission("operator")) {
                if (strings.length == 0) {
                    ItemStack menuItem = MenuUtil.giveMenuItem();
                    p.getInventory().addItem(menuItem);
                    p.sendMessage(ChatColor.GREEN + "You have received Operator Block");
                } else if (strings.length == 1) {
                    Player target = Bukkit.getPlayerExact(strings[0]);
                    if (target != null) {
                        target.getInventory().addItem(MenuUtil.giveMenuItem());
                        target.sendMessage(ChatColor.GREEN + "You have received Operator Block");
                        p.sendMessage(ChatColor.GREEN + "Operator Block successfully given to " + target.getDisplayName());
                    } else {
                        p.sendMessage(ChatColor.RED + "That player is offline or doesn´t exist");
                    }
                } else {
                    p.sendMessage(ChatColor.RED +  "You can only give this item to one player at a time");
                }
            }
            else {
                p.sendMessage(ChatColor.RED + "You need higher permissions to use this command");
            }
        }
        return true;
    }
}
