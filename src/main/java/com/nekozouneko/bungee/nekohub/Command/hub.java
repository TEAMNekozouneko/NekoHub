package com.nekozouneko.bungee.nekohub.Command;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class hub extends Command {

    public hub() {
        super("hub");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        ProxiedPlayer player = (ProxiedPlayer) sender;
        BaseComponent text = new TextComponent("ロビーに接続します。");
        text.setColor(ChatColor.BLUE);
        player.sendMessage(text);
        player.connect(ProxyServer.getInstance().getServerInfo("lobby"));
    }
}
