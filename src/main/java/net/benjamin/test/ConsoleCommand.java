package net.benjamin.test;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ConsoleCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            ((Player) sender).sendMessage("No This Is Console Only");

        } else {
            System.out.println("Hello Console");

        }

        return false;
    }
}
