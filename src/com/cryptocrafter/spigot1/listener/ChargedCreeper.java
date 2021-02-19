package com.cryptocrafter.spigot1.listener;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;

public class ChargedCreeper {
	int max = 5;
	int min = 0;
	int random1 = (int)(Math.random() * (max - min + 1) + min);
	if(random1 >= 5){
	double min = 0.0;
	double max = 10000;
	World world = Bukkit.getWorld("world");
	double x =ThreadLocalRandom.current().nextDouble(min, max);
	double y = ThreadLocalRandom.current().nextDouble(min, max);
	double z = ThreadLocalRandom.current().nextDouble(min, max);
	Location location = new Location(world, x, y, z);
	Location blockbellowcreeper = new Location(world, x,
            y - 1, z);
   
    if(blockbellowcreeper != null){
        int lightlevel = blockbellowcreeper.getBlock().getLightLevel();
        if(lightlevel <= 6) {
        	Creeper creeper = (Creeper)world.spawnEntity(location, EntityType.CREEPER);
        	creeper.setPowered(true);
        	return;
	}
	        }
			return;

}}}
