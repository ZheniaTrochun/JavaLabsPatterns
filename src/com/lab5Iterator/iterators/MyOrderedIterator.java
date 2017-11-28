package com.lab5Iterator.iterators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class MyOrderedIterator implements MyIterator<Integer> {

    private List<Integer> list;
    private Integer curr;
    private int index;
    private int iteratedNum;


    public MyOrderedIterator(List<Integer> list) {
        this.list = list;

        curr = list.stream().min(Comparator.naturalOrder()).get();
        iteratedNum = 0;
        index = list.indexOf(curr);
    }

    /**
     * Returns {@code true} if the iteration has more elements.
     * (In other words, returns {@code true} if {@link #next} would
     * return an element rather than throwing an exception.)
     *
     * @return {@code true} if the iteration has more elements
     */
    @Override
    public boolean hasNext() {
        return iteratedNum < list.size();
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    @Override
    public Integer next() {
        if (!hasNext())
            throw new NoSuchElementException("List ended :(");

        int res = curr;

        curr = findMinAbove();
        index = list.indexOf(curr);
        iteratedNum++;

        return res;
    }

    private int findMinAbove() {
        int min = list.stream().max(Comparator.naturalOrder()).get();
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);

            if ((element == curr) && (nextIndexOf(element) != -1)) {
                min = element;
            }

            if ((element > curr) && (element < min) && (i != index)) {
                min = element;
            }
        }

        return min;
    }

    private int nextIndexOf(Integer e) {
        for (int i = index + 1; i < list.size(); i++) {
            if (list.get(i).equals(e)) {
                return i;
            }
        }

        return -1;
    }
}
