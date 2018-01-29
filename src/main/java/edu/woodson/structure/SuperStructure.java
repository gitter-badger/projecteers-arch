package edu.woodson.structure;

import edu.woodson.structure.node.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 1/29/2018
 */
public class SuperStructure extends Structure {
    private final Set<Structure> structures = new HashSet<>();

    public SuperStructure(String name) {
        super(name);
    }

    @Override
    public Set<Node> getNodes() {
        Set<Node> nodeSet = new HashSet<>();
        structures.forEach(structure -> nodeSet.addAll(structure.getNodes()));
        return nodeSet;
    }

    public Set<Structure> getStructures() {
        return structures;
    }
}
