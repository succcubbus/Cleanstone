package rocks.cleanstone.game.world.region.chunk;

import java.util.Collection;

import rocks.cleanstone.game.block.Block;
import rocks.cleanstone.game.entity.Entity;
import rocks.cleanstone.game.world.region.chunk.data.block.BlockDataStorage;

public class SimpleChunk implements Chunk {

    private final BlockDataTable blockDataTable;
    private final BlockDataStorage blockDataStorage;
    private final Collection<Entity> entityCollection;
    private final int x, y;
    // TODO biome state

    public SimpleChunk(BlockDataTable blockDataTable, BlockDataStorage blockDataStorage,
                       Collection<Entity> entityCollection, int x, int y) {
        this.blockDataTable = blockDataTable;
        this.blockDataStorage = blockDataStorage;
        this.entityCollection = entityCollection;
        this.x = x;
        this.y = y;
    }

    @Override
    public Collection<Block> getBlocks() {
        return blockDataTable.getBlocks();
    }

    @Override
    public Collection<Entity> getEntities() {
        return entityCollection;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public Block getBlock(int x, int y, int z) {
        return blockDataTable.getBlock(x, y, z);
    }

    @Override
    public void setBlock(int x, int y, int z, Block block) {
        blockDataTable.setBlock(x, y, z, block);
        // TODO run the following expensive operation async
        blockDataStorage.setBlockState(x, y, z, block.getState());
    }

    @Override
    public byte getBlockLight(int x, int y, int z) {
        return blockDataTable.getBlockLight(x, y, z);
    }

    @Override
    public void setBlockLight(int x, int y, int z, byte blockLight) {
        blockDataTable.setBlockLight(x, y, z, blockLight);
        blockDataStorage.setBlockLight(x, y, z, blockLight);
    }

    @Override
    public byte getSkyLight(int x, int y, int z) {
        return blockDataTable.getSkyLight(x, y, z);
    }

    @Override
    public void setSkyLight(int x, int y, int z, byte skyLight) {
        if (!hasSkylight()) return;
        blockDataTable.setSkyLight(x, y, z, skyLight);
        blockDataStorage.setSkyLight(x, y, z, skyLight);
    }

    @Override
    public boolean hasSkylight() {
        return blockDataTable.hasSkylight();
    }

    @Override
    public BlockDataTable getBlockDataTable() {
        return blockDataTable;
    }

    @Override
    public BlockDataStorage getBlockDataStorage() {
        return blockDataStorage;
    }
}
