package com.cryptocrafter.spigot1;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;

public class SamplePlugin extends JavaPlugin implements Listener{
	
    // Fired when plugin is first enabled
    @Override
    public void onEnable() {
    	System.out.println("Garrett's test plugin is now running!");
        getServer().getPluginManager().registerEvents(new MyListener(), this);}
    public class MyListener implements Listener {
    @EventHandler
    public void onShearEntity(PlayerShearEntityEvent event) {
    	Player player = event.getPlayer();
    	player.sendMessage("You sheared a sheep, prepare to explode");
    }
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage("Welcome to the test server, " + event.getPlayer().getName() + "!");
    }
    }
    
    // Fired when plugin is disabled
    @Override
    public void onDisable() {
    	System.out.println("Garrett's test plugin is now shutting down!");
    }

}