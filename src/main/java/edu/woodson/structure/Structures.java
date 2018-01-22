package edu.woodson.structure;

import edu.woodson.structure.node.Node;
import edu.woodson.structure.node.binding.NodeBinding;

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
        return load(binding, null);
    }

    public static Structure load(NodeBinding binding, String name) {
        List<Node> nodes = binding.getNodes();
        List<Long[]> ids = binding.getLinks();
        Structure structure = new Structure(name);

        for (int i = 0; i < nodes.size(); i++) {
            Node node = nodes.get(i);
            if (node.hasConnectedNodes()) {
                throw new IllegalArgumentException("A node in binding cannot contain any connected nodes!");
            }

            for (int j = 0; j < ids.size(); j++) {
                Long[] idArray = ids.get(j);
                for (int k = 0; k < idArray.length; k++) {
                    node.addConnectedNode(nodes.get(k));
                }
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
