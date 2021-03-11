package com.cryptocrafter.spigot1.commands;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wolf;

public class spawnwolves implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("spawnwolves")) {
if (sender instanceof Player) {
                Player player = (Player) sender;
                //Wolf wolf = (Wolf) W.getEntity();
 			   //Wolf wolf = (Wolf) e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), EntityType.WOLF);
 			   World world = player.getWorld();
 			   Location loc = player.getLocation();
 				   for(int i = 0; i<6; i++) {
                Wolf madwolf = (Wolf) world.spawnEntity(loc, EntityType.WOLF);
                madwolf.setAngry(true);
                //madwolf.setTarget(player);
                madwolf.setCustomName("TesterFromCommand");
 				   } 
 return;
}
            if(!(sender instanceof Player)) {
            	sender.sendMessage("You must be a player to run this command");
            }
            }
        return false;
        }
	}
