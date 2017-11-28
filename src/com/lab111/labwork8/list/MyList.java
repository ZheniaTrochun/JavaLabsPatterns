package com.lab111.labwork8.list;

import com.lab111.labwork8.iterators.MyListIterator;

/**
 * Custom list interface
 */
public interface MyList<T> {

    /**
     * Insert element to the end of the list
     *
     * @param element element for addition
     * @return is addition successful
     */
    boolean add(T element);

    /**
     * Remove item by index
     *
     * @param index index for removing
     * @return removed item
     */
    T remove(int index);

    /**
     * @return size of list
     */
    int size();


    boolean isEmpty();

    /**
     * Check is element in list
     *
     * @param element element for checking
     * @return is element in list
     */
    boolean contains(T element);

    /**
     * removes all nodes of list
     */
    void clear();


    /**
     * Get element on index
     *
     * @param index
     * @return node value
     */
    T get(int index);

    /**
     * @param element element for getting index of it
     * @return index
     */
    int indexOf(T element);

    /**
     * Factory method for getting iterator of my list
     *
     * @return iterator
     */
    MyListIterator<T> iterator();
}
