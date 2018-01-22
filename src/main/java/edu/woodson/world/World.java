package edu.woodson.world;

import edu.woodson.structure.Structure;

import java.io.File;
import java.util.List;

public class World {
    private final List<Structure> structure;
    private final File file;

    public World(List<Structure> structure, File file) {
        this.structure = structure;
        this.file = file;
    }

    public List<Structure> getStructure() {
        return structure;
    }

    public File getFile() {
        return file;
    }
}
