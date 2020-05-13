package xyz.latham.JoinLeaveMsg;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import xyz.latham.Lat01;

public class Leave implements Listener {

    public Leave(Lat01 plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    void onPlayerQuit(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        e.setQuitMessage(Lat01.getPlugin(Lat01.class).getConfig().getString("quitMessage").replace("<player>", player.getName()));
    }

}
