package edu.woodson;

import java.util.Set;

public interface Connectable<T extends Connectable<T>> {
    Set<T> getConnectables();
}
