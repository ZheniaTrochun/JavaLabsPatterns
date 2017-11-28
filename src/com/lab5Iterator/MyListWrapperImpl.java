package com.lab5Iterator;

import com.lab5Iterator.iterators.MyIterator;
import com.lab5Iterator.iterators.MyIteratorImpl;
import com.lab5Iterator.iterators.MyOrderedIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class MyListWrapperImpl implements MyListWrapper {
    private List<Integer> list;
    private List<Integer> orderedList;

    public MyListWrapperImpl() {
        list = new ArrayList<>();
        orderedList = new ArrayList<>();
    }

    public MyListWrapperImpl(List<Integer> list) {
        this.list = list;
        this.orderedList = new ArrayList<>(list);
        Collections.sort(orderedList);
    }

    @Override
    public List<Integer> getList() {
        return list;
    }

    @Override
    public void setList(List<Integer> list) {
        this.list = list;
    }

    @Override
    public MyIterator iterator() {
        return new MyIteratorImpl(list);
    }

    @Override
    public MyIterator orderedIterator() {
        return new MyOrderedIterator(list);
    }

    @Override
    public boolean add(Integer element) {
        boolean status = orderedList.add(element);
        Collections.sort(orderedList);

        return list.add(element) && status;
    }




}
