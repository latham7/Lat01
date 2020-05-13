package xyz.latham.JoinLeaveMsg;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import xyz.latham.Lat01;

public class Join implements Listener {



    @EventHandler
    void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        e.setJoinMessage(Lat01.getPlugin(Lat01.class).getConfig().getString("message"));
    }

}
