package com.lab111.labwork8.iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

public interface MyListIterator<T> extends Iterator<T> {

    /**
     * Returns {@code true} if the backwards iteration has more elements.
     * (In other words, returns {@code true} if {@link #previous()} would
     * return an element rather than throwing an exception.)
     *
     * @return {@code true} if the backwards iteration has more elements
     */
    boolean hasPrevious();

    /**
     * Returns the previous element in the backwards iteration.
     *
     * @return the previous element in the backwards iteration
     * @throws NoSuchElementException if the backwards iteration has no more elements
     */
    T previous();
}
