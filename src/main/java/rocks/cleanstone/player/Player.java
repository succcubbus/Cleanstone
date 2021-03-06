package rocks.cleanstone.player;

import java.net.InetAddress;
import java.util.Collection;

import rocks.cleanstone.game.chat.message.Text;
import rocks.cleanstone.game.command.CommandSender;
import rocks.cleanstone.game.entity.vanilla.Human;
import rocks.cleanstone.game.gamemode.GameMode;
import rocks.cleanstone.net.packet.enums.PlayerAbilities;
import rocks.cleanstone.net.packet.Packet;

public interface Player extends CommandSender {

    PlayerID getId();

    void sendPacket(Packet packet);

    InetAddress getAddress();

    int getPing();

    void kick(Text reason);

    Human getEntity();

    void setEntity(Human entity);

    GameMode getGameMode();

    void setGameMode(GameMode gameMode);

    boolean isOp();

    void setOp(boolean state);

    void sendMessage(Text message);

    Collection<UserProperty> getUserProperties();

    boolean isFlying();

    void setFlying(boolean flying);

    float getFlyingSpeed();

    void setFlyingSpeed(float flyingSpeed);

    Collection<PlayerAbilities> getAbilities();
}
