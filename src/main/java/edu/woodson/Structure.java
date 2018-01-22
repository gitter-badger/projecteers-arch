package edu.woodson;

import java.util.HashSet;
import java.util.Set;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 1/8/2018
 */
public class Structure {
    private final Set<Node> nodes = new HashSet<>();

    public void putNode(Node node) {
        //TODO: implementation for putting nodes
        nodes.add(node);
    }
}
