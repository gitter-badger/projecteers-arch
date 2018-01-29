package edu.woodson.structure;

import java.util.HashSet;
import java.util.Set;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 1/29/2018
 */
public class SuperStructure extends Structure {
    private final Set<Structure> structureSet = new HashSet<>();

    public SuperStructure(String name) {
        super(name);
    }
}
