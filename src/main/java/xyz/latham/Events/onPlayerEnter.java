package xyz.latham.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class onPlayerEnter implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        // What is the trigger event to send a broadcast? or do you need to do that yourself?????
        event.getEntity().sendMessage("A player has died.");
    }
}
