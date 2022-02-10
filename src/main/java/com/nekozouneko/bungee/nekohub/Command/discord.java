package com.nekozouneko.bungee.nekohub.Command;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

import java.util.Arrays;

public class discord extends Command {
    public discord(String name, String permission,String... aliases) {
        super(name,permission,aliases);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        BaseComponent text = new TextComponent(new TextComponent("§5§lDiscord:§r §nhttps://discord.gg/ErDmtEpaqe").toLegacyText());
        BaseComponent[] description = {new TextComponent("Discordに参加する")};
        text.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, description));
        sender.sendMessage(text);

    }
}
