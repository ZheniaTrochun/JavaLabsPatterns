package com.lab5;


import java.util.List;
import java.util.ListIterator;

public interface MyListHolder<T> extends Iterable<T> {
    void setList(List<T> newList);
    List<T> getList();

    ListIterator<T> listIterator();
}
