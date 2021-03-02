package com.cryptocrafter.spigot1.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class consoletest implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("consoletest")) {
        	Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Test command has been executed!");
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage(ChatColor.AQUA + "Test Successful!" + player.getName() + "!");
                return true;
}
            if(!(sender instanceof Player)) {
            	sender.sendMessage("You must be a player to run this command");
            }
            }
        return false;}
	}
