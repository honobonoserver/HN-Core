package co.honobono.hncore;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.command.ServerCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class test implements CommandExecutor, Listener {
	// private static Plugin instance = HNCore.getInstance();

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof ServerCommandSender) {
			return true;
		}
		Player player = (Player) sender;
		if (player == Bukkit.getPlayer("syu_chan_1005")) {
			player.getInventory().addItem(new ItemStack(Material.APPLE, 1, (short) 1));
			player.sendMessage("実行終了");
			return true;
		} else {
			player.sendMessage("このコマンドは開発者専用です。");
			return true;
		}
	}
}
