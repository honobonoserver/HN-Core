package so.wktk.honobonoserver.hncore;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class HNCore extends JavaPlugin {
static Plugin instance;
	@Override
	public void onEnable() {
		instance = this;
		getLogger().info("HN-Coreを起動しました");
		//config読み込み
		this.saveDefaultConfig();
		//コマンドの設定
		getCommand("hnconfig").setExecutor(new hnconfig());
		getCommand("hnreload").setExecutor(new hnreload());
		getCommand("hnget").setExecutor(new hnget());
		getCommand("f").setExecutor(new kennzou());
		getCommand("l").setExecutor(new kennzou());
		getCommand("hntp").setExecutor(new hntp());
		getCommand("show").setExecutor(new show_hide());
		getCommand("hide").setExecutor(new show_hide());
		getCommand("mute").setExecutor(new mute());
		getCommand("unmute").setExecutor(new mute());
		getCommand("mutelist").setExecutor(new mute());
		getCommand("a").setExecutor(new adminchat());
		getCommand("ir").setExecutor(new itemremove());
		getCommand("al").setExecutor(new itemremove());
		getCommand("freeze").setExecutor(new freeze());
		getCommand("unfreeze").setExecutor(new freeze());
		getCommand("swp").setExecutor(new wp());
		getCommand("twp").setExecutor(new wp());
		getCommand("lwp").setExecutor(new wp());
		getCommand("home").setExecutor(new home());
		//Listener
		getServer().getPluginManager().registerEvents(new blockreplace(), this);
		getServer().getPluginManager().registerEvents(new elevator(), this);
		getServer().getPluginManager().registerEvents(new LoginMessage(), this);
		getServer().getPluginManager().registerEvents(new ChangeMotd(), this);
		getServer().getPluginManager().registerEvents(new mute(), this);
		getServer().getPluginManager().registerEvents(new adminchat(), this);
		getServer().getPluginManager().registerEvents(new sign(), this);
		getServer().getPluginManager().registerEvents(new freeze(), this);
	}

	@Override
	public void onDisable() {
		getLogger().info("HN-Coreを終了しました");
	}

	public static Plugin getInstance() {
		return instance;
	}
}