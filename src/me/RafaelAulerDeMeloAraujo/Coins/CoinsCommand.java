package me.RafaelAulerDeMeloAraujo.Coins;



import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



@SuppressWarnings("unused")
public class CoinsCommand implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("coins")) {
			if (args.length == 0) {
					sender.sendMessage("§c[KitPvP] §eYou have §b" + Coins.getCoins(sender.getName()) + " §eCoins");
					return true;
				}
		}
		return false;
	}
	}