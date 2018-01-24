package edu.woodson.structure.node;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static edu.woodson.Utility.random;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 1/8/2018
 */
public class Node {
    private final Set<Node> connectedNodes = new HashSet<>();
    private final Position position;
    private final long id = random.nextLong();
    private long weight;

    public Node(int size, Node... connectedNodes) {
        this.connectedNodes.addAll(Arrays.asList(connectedNodes));
        this.position = new Position(size);
    }

    public Position getPosition() {
        return position;
    }

    public long getId() {
        return id;
    }

    public void addConnectedNode(Node node) {
        connectedNodes.add(node);
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public boolean hasConnectedNodes() {
        return !connectedNodes.isEmpty();
    }

    public Set<Node> getConnectedNodes() {
        return connectedNodes;
    }
}
