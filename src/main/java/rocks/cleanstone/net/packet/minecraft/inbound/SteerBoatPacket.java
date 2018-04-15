package rocks.cleanstone.net.packet.minecraft.inbound;

import rocks.cleanstone.net.packet.PacketType;
import rocks.cleanstone.net.packet.InboundPacket;
import rocks.cleanstone.net.packet.minecraft.MinecraftInboundPacketType;

public class SteerBoatPacket extends InboundPacket {

    private final boolean rightPaddleTurning;
    private final boolean leftPaddleTurning;

    public SteerBoatPacket(boolean rightPaddleTurning, boolean leftPaddleTurning) {
        this.rightPaddleTurning = rightPaddleTurning;
        this.leftPaddleTurning = leftPaddleTurning;
    }

    public boolean isRightPaddleTurning() {
        return rightPaddleTurning;
    }

    public boolean isLeftPaddleTurning() {
        return leftPaddleTurning;
    }

    @Override
    public PacketType getType() {
        return MinecraftInboundPacketType.STEER_BOAT;
    }
}