package com.cryptocrafter.spigot1.listener;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
public class ChargedCreeper implements Listener{
@EventHandler
public void onEnable() {
	Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Creeoer Spawn Enabled.!");
}

   public void onMobSpawn(CreatureSpawnEvent e) {
	   if(e.getEntityType() == EntityType.CREEPER) {
		   e.setCancelled(true);
		   Creeper creeper = (Creeper) e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), EntityType.CREEPER);
		   creeper.setPowered(true);
	   }
   }
}


