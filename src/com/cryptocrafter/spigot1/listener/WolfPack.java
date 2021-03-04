package com.cryptocrafter.spigot1.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class WolfPack implements Listener {

	@EventHandler
	   public void onMobSpawn(CreatureSpawnEvent W) {
		   if(W.getEntityType() == EntityType.WOLF) {
			   //Wolf wolf = (Wolf) e.getEntity();
			   //Wolf wolf = (Wolf) e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), EntityType.WOLF);
			   Location loc = W.getLocation();
			   Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "Wolf Spawn cancel.!");
			   int randomInt = (int)(3.0 * Math.random());
			   if(randomInt == 2) {
			   for(int i = 0; i<6; i++) {;
			   if(((Ageable) W).isAdult() == false) {
               Wolf wolf = (Wolf) W.getEntity().getWorld().spawnEntity(loc, EntityType.WOLF);
               wolf.setAngry(true);
               //W.setCancelled(true);
			   Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Wolf Spawn Tester.!");
			   }}}
			   }
	   }
	}
