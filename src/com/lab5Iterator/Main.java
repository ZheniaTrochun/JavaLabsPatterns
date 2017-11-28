package com.lab5Iterator;


import com.lab5Iterator.iterators.MyIterator;
import com.lab5Iterator.iterators.MyIteratorImpl;
import com.lab5Iterator.iterators.MyOrderedIterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        MyListWrapper list = new MyListWrapperImpl();
//
//        list.add(2);
//        list.add(1);
//        list.add(4);
//        list.add(3);
//
//        MyIterator iterator = list.iterator();
//        MyIterator ordered = list.orderedIterator();
//
//        System.out.println("Regular list iterator");
//        while (iterator.hasNext())
//            System.out.println(iterator.next());
//
//        System.out.println("Ordered list iteration");
//        while (ordered.hasNext())
//            System.out.println(ordered.next());

        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(1);
        list.add(4);
        list.add(3);

        MyIterator<Integer> iterator = new MyIteratorImpl(list);

        MyIterator<Integer> ordered = new MyOrderedIterator(list);

        System.out.println("Regular list iterator");
        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("Ordered list iteration");
        while (ordered.hasNext())
            System.out.println(ordered.next());
    }
}
