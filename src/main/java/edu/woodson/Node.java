package edu.woodson;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 1/8/2018
 */
public class Node {
    private final Set<Node> connectedNodes = new HashSet<>();
    private long weight;

    public Node(Node... connectedNodes) {
        this.connectedNodes.addAll(Arrays.asList(connectedNodes));
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
}
