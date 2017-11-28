package com.lab5Iterator;

import com.lab5Iterator.iterators.MyIterator;

import java.util.List;

public interface MyListWrapper {

    List<Integer> getList();

    void setList(List<Integer> list);

    MyIterator iterator();

    MyIterator orderedIterator();

    boolean add(Integer element);
}
