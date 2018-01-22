package edu.woodson.world;

import edu.woodson.structure.Structure;

import java.io.File;

public class World {
    private final Structure structure;
    private final File file;

    public World(Structure structure, File file) {
        this.structure = structure;
        this.file = file;
    }

    public Structure getStructure() {
        return structure;
    }

    public File getFile() {
        return file;
    }
}
