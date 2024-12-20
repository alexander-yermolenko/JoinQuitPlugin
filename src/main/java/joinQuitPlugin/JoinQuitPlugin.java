package joinQuitPlugin;

import joinQuitPlugin.listeners.PlayerJoinListener;
import joinQuitPlugin.listeners.PlayerQuitListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class JoinQuitPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("JoinQuitPlugin is running!");

        // Listeners
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerQuitListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("JoinQuitPlugin is stopping!");
    }
}