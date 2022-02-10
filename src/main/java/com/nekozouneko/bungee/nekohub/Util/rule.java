package com.nekozouneko.bungee.nekohub.Util;

import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;

public class rule {
    public void send(ProxiedPlayer player) {

        BaseComponent window = new TextComponent("§e+§a§m------------------------------§r§e+");
        BaseComponent rule1 = new TextComponent("§l§4>§r ルール:\n§a§lネットの基本マナー§r\n・他のユーザーに成りすます行為を禁止します。\n" +
                "・過度に暴力的な表現，人種，性別，差別につながる表現，卑猥な表現,その他反社会的な内容を含み他人に不快感を与える表現は絶対に使わないでください\n" +
                "・下ネタを禁止します\n" +
                "・他人に罪を擦り付けないでください\n" +
                "・過度なメンションはしないでください(運営はok)\n" +
                "§4§l・他のユーザーに関する個人情報などはチャットやVCでも言わないでください§r\n" +
                "・スパムは禁止でです\n" +
                "・ディスコードの規約は守ってください\n" +
                "§4§l・ルールに書いてないことでもBANする場合があります§r\n" +
                "§4§l・その他、運営が不適切だと判断した行為は禁止します§r");
        BaseComponent rule2 = new TextComponent("§a§lマイクラ鯖共通ルール§r:\n・道のど真ん中に建築はしないでください。\n" +
                "・荒らし・チート・ハッキングなどは禁止します。\n" +
                "・ハッククライアントは使用しないでください。\n" +
                "・人を 'わざと' 倒し、アイテムを略奪をすることを禁止します。\n" +
                "§4§l・OPの指示に従ってください。 ");
        player.sendMessage(window);
        player.sendMessage(rule1);
        player.sendMessage(rule2);
        player.sendMessage(window);
    }

}
