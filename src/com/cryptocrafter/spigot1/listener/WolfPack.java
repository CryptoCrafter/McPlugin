package com.cryptocrafter.spigot1.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class WolfPack implements Listener {

	@EventHandler
	   public void onMobSpawn(CreatureSpawnEvent W) {
		Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Method Called.!");
		   if(W.getEntityType() == EntityType.WOLF) {
			   Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "IFSTATEMENTPASSED.!");
			   //Wolf wolf = (Wolf) W.getEntity();
			   //Wolf wolf = (Wolf) e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), EntityType.WOLF);
			   World world = ((Entity) W).getWorld();
			   Location loc = W.getLocation();
			   Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "Wolf Spawn cancel.!");
			   int randomInt = (int)(3.0 * Math.random());
			   System.out.println("Random int: " + randomInt);
			   if(randomInt == 1) {
				   W.setCancelled(true);
				   for(int i = 0; i<5; i++) {;
				   		Wolf madwolf = (Wolf) world.spawnEntity(loc, EntityType.WOLF);
				   		madwolf.setAngry(true);
				   		madwolf.setCustomName("Tester" + i);
				   		Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Wolf Spawn Tester.!");
			   }}
			   }
	   }
	}
