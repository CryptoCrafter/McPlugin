package com.cryptocrafter.spigot1.listener;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
public class ChargedCreeper implements Listener{
@EventHandler
   public void onMobSpawn(CreatureSpawnEvent e) {
	   if(e.getEntityType() == EntityType.CREEPER) {
		   Creeper creeper = (Creeper) e.getEntity();
		   //e.setCancelled(true);
		   //Creeper creeper = (Creeper) e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), EntityType.CREEPER);
		   creeper.setPowered(true);
		   }
   }
}


