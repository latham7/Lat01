package xyz.latham;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.latham.JoinLeaveMsg.Join;
import xyz.latham.JoinLeaveMsg.Leave;

public final class Lat01 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("This plugin has started up!!");
        // Loads the config upon start
        saveDefaultConfig();
        new Join(this);
        new Leave(this);
    }
}

