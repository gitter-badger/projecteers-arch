package edu.woodson.structure;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 1/8/2018
 */
public class Structure {
    private final String name;

    //declared by factory method
    public Structure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}