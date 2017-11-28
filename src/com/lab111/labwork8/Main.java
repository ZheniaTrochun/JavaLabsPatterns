package com.lab111.labwork8;

import com.lab111.labwork8.iterators.MyListIterator;
import com.lab111.labwork8.list.MyList;
import com.lab111.labwork8.list.MyListImpl;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyListImpl<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        MyListIterator iterator = list.iterator();

        System.out.println("Forward iteration");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Backward iteration");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
