package edu.woodson.structure;

import edu.woodson.structure.node.Node;

import java.util.Set;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 1/8/2018
 */
public abstract class Structure {
    private final String name;

    //declared by factory method
    public Structure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Set<Node> getNodes();
}