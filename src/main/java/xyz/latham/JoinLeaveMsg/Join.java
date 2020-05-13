package xyz.latham.JoinLeaveMsg;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import xyz.latham.Lat01;
import xyz.latham.Utils.Utils;

public class Join implements Listener {


    public Join(Lat01 plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        if (!player.hasPlayedBefore()){
            e.setJoinMessage(Utils.chat(Lat01.getPlugin(Lat01.class).getConfig().getString("firstJoinMessage").replace("<player>", player.getName())));
        } else {
            e.setJoinMessage(Utils.chat(Lat01.getPlugin(Lat01.class).getConfig().getString("joinMessage").replace("<player>", player.getName())));
        }
    }


}
