package com.cryptocrafter.spigot1.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class WolfPack implements Listener {

	@EventHandler
	   public void onMobSpawn(CreatureSpawnEvent e) {
		   if(e.getEntityType() == EntityType.WOLF) {
			   //Wolf wolf = (Wolf) e.getEntity();
			   Location loc = e.getLocation();
			   //Wolf wolf = (Wolf) e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), EntityType.WOLF);
			   //e.setCancelled(true);
			   for(int i = 0; i<6; i++) {
               Wolf wolf = (Wolf) e.getEntity().getWorld().spawnEntity(loc, EntityType.WOLF);
               wolf.setAngry(true);
               e.setCancelled(true);
			   Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Wolf Spawn Tester.!");
			   }
			   }
	   }
	}
