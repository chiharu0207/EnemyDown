package plugin.enemydown;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import plugin.enemydown.command.EnemyDownCommand;

import java.util.Arrays;
import java.util.Objects;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        EnemyDownCommand enemyDownCommand = new EnemyDownCommand(this);
        Bukkit.getPluginManager().registerEvents(enemyDownCommand, this);
        getCommand("enemyDown").setExecutor(enemyDownCommand);
    }
}
