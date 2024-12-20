package joinQuitPlugin.listeners;

import joinQuitPlugin.JoinQuitPlugin;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    private final JoinQuitPlugin plugin;

    public PlayerJoinListener(JoinQuitPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Get the player's name and display name
        String playerName = event.getPlayer().getDisplayName();

        // Player has never been on the server
        if(!event.getPlayer().hasPlayedBefore()) {
            // Get the message from the config file
            String firstWelcomeMessage = plugin.getConfig().getString("messages.first-welcome-message");

            // Replace the placeholder {player} with the player's display name
            firstWelcomeMessage = firstWelcomeMessage.replace("{player}", playerName);

            // Send the formatted message to the player
            event.setJoinMessage(ChatColor.translateAlternateColorCodes('&', firstWelcomeMessage));
        }

        // Player returns
        else {
            // Get the message from the config file
            String secondWelcomeMessage = plugin.getConfig().getString("messages.second-welcome-message");

            // Replace the placeholder {player} with the player's display name
            secondWelcomeMessage = secondWelcomeMessage.replace("{player}", playerName);

            // Send the formatted message to the player
            event.setJoinMessage(ChatColor.translateAlternateColorCodes('&', secondWelcomeMessage));
        }
    }
}
