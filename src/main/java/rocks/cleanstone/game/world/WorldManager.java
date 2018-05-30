package rocks.cleanstone.game.world;

import org.springframework.util.concurrent.ListenableFuture;
import rocks.cleanstone.game.world.generation.WorldGenerator;

import javax.annotation.Nullable;
import java.util.Collection;

public interface WorldManager {

    Collection<World> getLoadedWorlds();

    @Nullable
    World getLoadedWorld(String id);

    ListenableFuture<World> loadWorld(String id);

    boolean isWorldLoaded(String id);

    void unloadWorld(String id);

    void createWorld(String id, WorldGenerator generator);

    void deleteWorld(String id);

}
