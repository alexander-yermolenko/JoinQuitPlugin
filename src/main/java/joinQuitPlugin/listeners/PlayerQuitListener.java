package joinQuitPlugin.listeners;

import joinQuitPlugin.JoinQuitPlugin;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuitListener implements Listener {

    private final JoinQuitPlugin plugin;

    public PlayerQuitListener(JoinQuitPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        // Get the player's name and display name
        String playerName = event.getPlayer().getDisplayName();

        // Player quits
        // Get the message from the config file
        String quitMessage = plugin.getConfig().getString("messages.quit-message");

        // Replace the placeholder {player} with the player's display name
        quitMessage = quitMessage.replace("{player}", playerName);

        // Send the formatted message to the player
        event.setQuitMessage(ChatColor.translateAlternateColorCodes('&', quitMessage));

    }
}
