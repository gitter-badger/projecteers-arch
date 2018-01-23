package edu.woodson.structure;

import edu.woodson.structure.node.Node;
import edu.woodson.structure.node.binding.NodeBinding;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.TriangleMesh;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class NodeDisplay extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);

        primaryStage.setTitle("NodeDisplayer");
        primaryStage.setScene(scene);
        primaryStage.show();

        //TODO: node position
        List<Node> nodes = new ArrayList<>();
        List<Long[]> links = new ArrayList<>();

        NodeBinding binding = new NodeBinding(nodes, links);
        Structure structure = Structures.load(binding);
        buildNodes(root, structure);
    }

    private void buildNodes(Group root, Structure structure) {
        TriangleMesh mesh = new TriangleMesh();
        MeshView view = new MeshView(mesh);
        root.getChildren().add(view);

        //TODO: load structure onto mesh
    }
}
