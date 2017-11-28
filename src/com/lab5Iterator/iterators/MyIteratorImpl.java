package com.lab5Iterator.iterators;

import java.util.List;
import java.util.NoSuchElementException;

public class MyIteratorImpl implements MyIterator {

    private List<Integer> list;
    private int cursor;

    public MyIteratorImpl(List<Integer> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor < list.size();
    }

    @Override
    public Integer next() {
        if (!hasNext())
            throw new NoSuchElementException("List ended :(");

        return list.get(cursor++);
    }
}
