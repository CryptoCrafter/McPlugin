package com.cryptocrafter.spigot1;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){
        //Fired when the server enables the plugin
    	System.out.println("The plugin is printing this if it works");
    }

    @Override
    public void onDisable(){
        //Fired when the server stops and disables all plugins
    	System.out.println("The plugin has been disabled!");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("test")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage("Test Successful!");
                return true;
            }
        }
        return false;
    }

}