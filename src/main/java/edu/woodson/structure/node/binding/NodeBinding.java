package edu.woodson.structure.node.binding;

import edu.woodson.structure.node.Node;

import java.util.List;

public class NodeBinding {
    private final List<Node> nodes;
    private final List<Long[]> links;

    public NodeBinding(List<Node> nodes, List<Long[]> links) {
        this.nodes = nodes;
        this.links = links;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public List<Long[]> getLinks() {
        return links;
    }
}
