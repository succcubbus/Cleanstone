package rocks.cleanstone.net.packet.data;

import rocks.cleanstone.data.vanilla.nbt.NamedBinaryTag;

public class Slot {
    private final short blockID;
    private final byte itemCount;
    private final short itemDamage;
    private final NamedBinaryTag nbt;

    public Slot(short blockID, byte itemCount, short itemDamage, NamedBinaryTag nbt) {
        this.blockID = blockID;
        this.itemCount = itemCount;
        this.itemDamage = itemDamage;
        this.nbt = nbt;
    }

    public short getBlockID() {
        return blockID;
    }

    public byte getItemCount() {
        return itemCount;
    }

    public short getItemDamage() {
        return itemDamage;
    }

    public NamedBinaryTag getNbt() {
        return nbt;
    }
}
