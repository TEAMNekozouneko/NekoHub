package com.nekozouneko.bungee.nekohub.Command;

import com.nekozouneko.bungee.nekohub.Util.rule;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class rules extends Command {
    public rules() {
        super("rule");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        ProxiedPlayer player = (ProxiedPlayer) sender;
        new rule().send(player);
    }
}
