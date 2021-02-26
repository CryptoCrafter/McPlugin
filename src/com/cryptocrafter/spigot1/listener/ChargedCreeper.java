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

public class ChargedCreeper {
	//Sets up variables
	int min;
	int max;
	int ymin;
	int ymax;
	World world;
	double x;
	double y;
	double z;
	Location location;
	Location blockbellowcreeper;
	//Constructor
	public ChargedCreeper() {
		 min = 0;
		 max = 100;
		 ymin = 0;
		 ymax = 64;
		 world = Bukkit.getWorld("world");
		 x =ThreadLocalRandom.current().nextDouble(min, max);
		 y = ThreadLocalRandom.current().nextDouble(ymin, ymax);
		 z = ThreadLocalRandom.current().nextDouble(min, max);
		 location = new Location(world, x, y, z);
		 blockbellowcreeper = new Location(world, x, y - 1, z);
		
		//Checks if lighting spawn conditions are met
	    if(blockbellowcreeper != null){
	        int lightlevel = blockbellowcreeper.getBlock().getLightLevel();
	        if(lightlevel <= 9) {
	        	//Does a random check for chance of spawn
	        	int randmin = 0;
	        	int randmax = 5;
	        	Random rand = new Random(); 
	            int rand1 = rand.nextInt((randmax - randmin) + 1) + randmin;
	            if(rand1 == 4){
	            	//Spawns mob
	            	Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Creeper!");
	        	Entity entity = Bukkit.getWorld("world").spawnEntity(new Location(Bukkit.getWorld("world"),x, y, z), EntityType.CREEPER);
	        	((Creeper) entity).setPowered(true);
	        	return;
	            }
	        }
		}
		return;
	}
   

}
