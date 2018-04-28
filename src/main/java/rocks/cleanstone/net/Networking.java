package rocks.cleanstone.net;

import java.net.InetAddress;
import java.security.KeyPair;

import rocks.cleanstone.net.packet.Packet;
import rocks.cleanstone.net.packet.PacketType;
import rocks.cleanstone.net.packet.protocol.Protocol;

public interface Networking {

    int getPort();

    InetAddress getAddress();

    Protocol getProtocol();

    KeyPair getKeyPair();

    void start();

    void sendPacket(Connection connection, Packet packet);

    void registerPacketListener(PacketListener packetListener, PacketType... packetTypes);
}
