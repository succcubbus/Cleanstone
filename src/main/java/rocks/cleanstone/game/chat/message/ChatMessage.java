package rocks.cleanstone.game.chat.message;

import rocks.cleanstone.player.Player;

public class ChatMessage extends Text {
    public ChatMessage(Player sender, String message) {
        super(sender.getId().getName() + ": " + message);
    }
}
