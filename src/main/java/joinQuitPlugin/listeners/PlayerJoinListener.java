package joinQuitPlugin.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        // Player has never been on the server
        if(!event.getPlayer().hasPlayedBefore()) {
            event.setJoinMessage(ChatColor.BLUE + "Welcome to the server for the first time, "
                    + ChatColor.ITALIC + event.getPlayer().getDisplayName() + ChatColor.BLUE + "!\n"
                    + ChatColor.BLUE + "We hope you will like it!");
        } else {
            // Player returns
            event.setJoinMessage(ChatColor.GREEN + "Welcome back to the server, "
                    + ChatColor.YELLOW + ChatColor.ITALIC + event.getPlayer().getDisplayName()
                    + ChatColor.GREEN + "! We missed you!");
        }
    }
}
