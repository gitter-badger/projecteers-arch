package edu.woodson;

import java.io.File;
import java.util.List;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 1/8/2018
 */
public class Structures {
    private Structures() {
    }

    public static Structure load(NodeBinding binding) {
        List<Node> nodes = binding.getNodes();
        List<Long[]> ids = binding.getLinks();
        Structure structure = new Structure();

        for (int i = 0; i < nodes.size(); i++) {
            Node node = nodes.get(i);
            if (node.hasConnectedNodes()) {
                throw new IllegalArgumentException("A node in binding cannot contain any connected nodes!");
            }

            for (int j = 0; j < ids.get(j)[i]; j++) {
                node.addConnectedNode(nodes.get(j));
            }
            structure.putNode(node);
        }

        return structure;
    }

    //methods
    public static Structure load(File file) {
        //TODO: provide implementation
        return null;
    }
}
