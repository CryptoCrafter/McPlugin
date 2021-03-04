package com.cryptocrafter.spigot1;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.cryptocrafter.spigot1.commands.consoletest;
import com.cryptocrafter.spigot1.commands.playertest;
import com.cryptocrafter.spigot1.listener.ChargedCreeper;
import com.cryptocrafter.spigot1.listener.JoinMessage;
import com.cryptocrafter.spigot1.listener.WolfPack;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable(){
        //Fired when the server enables the plugin
    	Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.BLUE + "Test plugin enabled!");
    	//Sets up listeners
    	getServer().getPluginManager().registerEvents(new JoinMessage(), this);
    	getServer().getPluginManager().registerEvents(new ChargedCreeper(), this);
    	getServer().getPluginManager().registerEvents(new WolfPack(), this);
    	//Sets up Commands
		getCommand( "playertest").setExecutor(new playertest());
		getCommand( "consoletest").setExecutor(new consoletest());
    }

    @Override
    public void onDisable(){
        //Fired when the server stops and disables all plugins
    	Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "Test plugin disabled!");
    }

}