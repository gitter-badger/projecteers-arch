package edu.woodson.structure.node;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 1/8/2018
 */
public class Node {
    private static final Random random = new Random();

    private final Set<Node> connectedNodes = new HashSet<>();
    private final long id = random.nextLong();
    private long weight;

    public Node(Node... connectedNodes) {
        this.connectedNodes.addAll(Arrays.asList(connectedNodes));
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
