package edu.woodson.structure;

import edu.woodson.Connectable;
import edu.woodson.structure.node.Node;

import java.util.HashSet;
import java.util.Set;

public abstract class Room extends Structure implements Connectable<Room> {
    private final Set<Room> rooms = new HashSet<>();

    public Room(String name) {
        super(name);
    }

    @Override
    public Set<Node> getNodes() {
        return null;
    }

    @Override
    public Set<Room> getConnectables() {
        return rooms;
    }

    public abstract float getVolume();

    public abstract float getSquareArea();
}
