package com.nekozouneko.bungee.nekohub;

import com.nekozouneko.bungee.nekohub.Command.discord;
import com.nekozouneko.bungee.nekohub.Command.hub;
import com.nekozouneko.bungee.nekohub.Command.rules;
import com.nekozouneko.bungee.nekohub.Util.rule;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.event.ServerConnectedEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.event.EventHandler;

public final class NekoHub extends Plugin implements Listener {

    @Override
    public void onEnable() {
        getProxy().getPluginManager().registerCommand(this,new hub());
        getProxy().getPluginManager().registerCommand(this,new rules());
        getProxy().getPluginManager().registerCommand(this,new discord("discord","","voicechat"));
        getProxy().getPluginManager().registerListener(this,this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    
    @EventHandler
    public void onJoin(PostLoginEvent e) {
        rule neko = new rule();
        neko.send(e.getPlayer());
        for (ProxiedPlayer p:getProxy().getPlayers()) {
            BaseComponent text = new TextComponent(ChatColor.GRAY+e.getPlayer().getDisplayName()+"が参加しました。");
            p.sendMessage(text);
        }
    }

    @EventHandler
    public void onMove(ServerConnectedEvent e) {
        for (ProxiedPlayer p:getProxy().getPlayers()) {
            BaseComponent text = new TextComponent(ChatColor.GRAY+e.getPlayer().getDisplayName()+"が"+e.getServer().getInfo().getName()+"へ移動しました。");
            p.sendMessage(text);
        }
    }

    @EventHandler
    public void onChat(ChatEvent e) {
        ProxiedPlayer by = (ProxiedPlayer) e.getSender();
        if (e.getMessage().startsWith("!")) {
            for (ProxiedPlayer p:getProxy().getPlayers()) {
                p.sendMessage(by.getName()+" §9(§f"+by.getServer().getInfo().getName()+"§9)§r §a:§r "+e.getMessage());
            }
            e.setCancelled(true);
        }
    }
}
