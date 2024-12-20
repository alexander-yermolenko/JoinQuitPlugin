package joinQuitPlugin;

import joinQuitPlugin.listeners.PlayerJoinListener;
import joinQuitPlugin.listeners.PlayerQuitListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class JoinQuitPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("JoinQuitPlugin is running!");

        // Config setup
        saveDefaultConfig();

        // Listeners
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(this), this);
        getServer().getPluginManager().registerEvents(new PlayerQuitListener(this), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("JoinQuitPlugin is stopping!");
    }
}
