package xyz.latham;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.latham.Events.onPlayerEnter;
import xyz.latham.JoinLeaveMsg.Join;

public final class Lat01 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("This plugin has started up!!");
        // Loads the config upon start
        this.saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new onPlayerEnter(), this);
        getServer().getPluginManager().registerEvents(new Join(), this);
    }
}

