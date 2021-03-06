package rocks.cleanstone.net.minecraft.protocol.v1_12_2.outbound;

import io.netty.buffer.ByteBuf;
import rocks.cleanstone.net.packet.outbound.BlockChangePacket;
import rocks.cleanstone.net.minecraft.protocol.MinecraftPacketCodec;
import rocks.cleanstone.net.minecraft.protocol.VanillaProtocolState;
import rocks.cleanstone.net.packet.Packet;
import rocks.cleanstone.net.protocol.ProtocolState;
import rocks.cleanstone.net.utils.ByteBufUtils;

import java.io.IOException;

public class BlockChangeCodec implements MinecraftPacketCodec {

    @Override
    public Packet decode(ByteBuf byteBuf) {
        throw new UnsupportedOperationException("BlockChange is outbound and cannot be decoded");
    }

    @Override
    public ByteBuf encode(ByteBuf byteBuf, Packet packet) throws IOException {
        BlockChangePacket blockChangePacket = (BlockChangePacket) packet;

        ByteBufUtils.writeVector(byteBuf, blockChangePacket.getLocation());
        ByteBufUtils.writeVarInt(byteBuf, blockChangePacket.getBlockData());

        return byteBuf;
    }

    @Override
    public ByteBuf upgradeByteBuf(ByteBuf previousLayerByteBuf) {
        return previousLayerByteBuf;
    }

    @Override
    public ByteBuf downgradeByteBuf(ByteBuf nextLayerByteBuf) {
        return nextLayerByteBuf;
    }

    @Override
    public int getProtocolPacketID() {
        return 0x0B;
    }

    @Override
    public ProtocolState getProtocolState() {
        return VanillaProtocolState.PLAY;
    }
}
