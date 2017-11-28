package com.lab111.labwork9.models.tables;

import com.lab111.labwork9.models.TableElement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * Simple placeholder for Relational Table
 * We need to add generics for more strict representation
 *
 * @param <T> some implementation of TableElement
 */
public abstract class Table<T extends TableElement> {

    /**
     * Container for all elements in table
     */
    protected List<T> rows;


    public Table() {
        rows = new ArrayList<>();
    }

    public Table(Collection<T> collection) {
        rows = new ArrayList<>(collection);
    }


    public boolean add(T element) {
        return rows.add(element);
    }

    public List<T> getAll() {
        return rows;
    }

    public abstract String getFieldNames();

    public int size() {
        return rows.size();
    }
}
