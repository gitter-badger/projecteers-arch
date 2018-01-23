package edu.woodson.world;

import edu.woodson.structure.Structure;

import java.io.File;
import java.util.HashMap;

public class World {
    private final HashMap<Integer, Structure> structure;
    private final File file;

    public World(HashMap<Integer, Structure> structure, File file) {
        this.structure = structure;
        this.file = file;
    }

    public HashMap<Integer, Structure> getStructure() {
        return structure;
    }

    public File getFile() {
        return file;
    }
}
