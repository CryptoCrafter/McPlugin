package com.cryptocrafter.spigot1;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.cryptocrafter.spigot1.commands.playertest;
import com.cryptocrafter.spigot1.listener.ChargedCreeper;
import com.cryptocrafter.spigot1.listener.JoinMessage;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable(){
        //Fired when the server enables the plugin
    	Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.BLUE + "Test plugin enabled!");
    	//Sets up listeners
    	getServer().getPluginManager().registerEvents(new JoinMessage(), this);
    	getServer().getPluginManager().registerEvents(new ChargedCreeper(), this);
    	//Sets up Commands
		getCommand( "playertest").setExecutor(new playertest());
		getCommand( "consoletest").setExecutor(new playertest());
    }

    @Override
    public void onDisable(){
        //Fired when the server stops and disables all plugins
    	Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "Test plugin disabled!");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("test")) {
        	Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Test command has been executed!");
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage("Test Successful!");
                return true;
            }
            if (label.equalsIgnoreCase("consoletest")) {
            	Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Console Log test,!");
                    return true;
            }
   
        }
        return false;
    }

}