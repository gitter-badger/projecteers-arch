package edu.woodson.structure.node;

public class Position {
    private final float[] values;

    public Position(int size){
        this.values = new float[size];
    }

    public Position(float... values){
        this.values = values;
    }

    public float[] getValues() {
        return values;
    }
}
