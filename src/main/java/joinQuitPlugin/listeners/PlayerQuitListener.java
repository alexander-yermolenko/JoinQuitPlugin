package joinQuitPlugin.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuitListener implements Listener {

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        // Player quits
        event.setQuitMessage(ChatColor.YELLOW + "" + ChatColor.ITALIC + event.getPlayer().getDisplayName()
                + ChatColor.GREEN + " has left, we hope you will return to us soon!");
    }
}
