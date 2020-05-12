package xyz.latham;

import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Lat01 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("This plugin has started up!!");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onEnterBed(PlayerBedEnterEvent event){
        //Everything inside of here, will be ran when a player enters a bed.
        Player player = event.getPlayer();
        player.sendMessage("You have entered a bed");

    }
}
