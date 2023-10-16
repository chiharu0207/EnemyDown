package plugin.enemydown;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import plugin.enemydown.command.EnemyDownCommand;
import plugin.enemydown.command.EnemySpawnCommand;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        EnemyDownCommand enemyDownCommand = new EnemyDownCommand(this);
        Bukkit.getPluginManager().registerEvents(enemyDownCommand, this);
        getCommand("enemyDown").setExecutor(enemyDownCommand);
        getCommand("enemySpawn").setExecutor(new EnemySpawnCommand());
    }
}
