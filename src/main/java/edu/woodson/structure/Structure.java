package edu.woodson.structure;

import edu.woodson.structure.node.Node;

import java.util.HashSet;
import java.util.Set;

import static edu.woodson.Utility.random;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 1/8/2018
 */
public class Structure {
    private final Set<Node> nodes = new HashSet<>();
    private final String name;
    private final long id = random.nextLong();

    //declared by factory method
    public Structure(String name) {
        this.name = name;
    }

    public void putNode(Node node) {
        nodes.add(node);
    }
}