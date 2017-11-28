package com.lab111.labwork8.list;

import com.lab111.labwork8.iterators.MyListIterator;

import java.util.Collection;
import java.util.NoSuchElementException;


/**
 * Custom double linked list implementation
 */
public class MyListImpl<T> implements MyList<T> {

    private int len;
    private Node head;
    private Node tail;

    public MyListImpl() {
    }

    public MyListImpl(Collection<? extends T> collection) {
        collection.forEach(this::add);
    }


    @Override
    public boolean add(T element) {
        if (tail == null) {
            head = new Node(null, null, element);
            tail = head;
        } else {
            tail.next = new Node(tail, null, element);
            tail = tail.next;
        }

        return true;
    }

    @Override
    public T remove(int index) {
        if ((index < 0) || (index >= len))
            throw new IndexOutOfBoundsException();

        Node curr = head;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }


        if (curr.prev != null) {
            curr.prev.next = curr.next;
        } else {
            head = curr.next;
        }

        if (curr.next != null) {
            curr.next.prev = curr.prev;
        } else {
            tail = curr.prev;
        }


        return curr.value;
    }

    @Override
    public int size() {
        return len;
    }

    @Override
    public boolean isEmpty() {
        return len == 0;
    }

    @Override
    public boolean contains(T element) {
        return indexOf(element) != -1;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        len = 0;
    }

    @Override
    public T get(int index) {
        if ((index < 0) || (index >= len))
            throw new IndexOutOfBoundsException();

        Node curr = head;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        return curr.value;
    }

    @Override
    public int indexOf(T element) {
        Node curr = head;

        for (int i = 0; i < len; i++) {
            if (curr.value.equals(element))
                return i;

            curr = curr.next;
        }

        return -1;
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public MyListIterator<T> iterator() {
        return new MyListIteratorImpl();
    }


    /**
     * Inner class of my list
     */
    private class Node {
        private Node prev;
        private Node next;

        private T value;

        public Node(T value) {
            this.value = value;
            prev = null;
            next = null;
        }

        public Node(Node prev, Node next, T value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }


    private class MyListIteratorImpl implements MyListIterator<T> {

        private Node cursor;
        private Node prev;

        public MyListIteratorImpl() {
            cursor = head;
            prev = null;
        }

        @Override
        public boolean hasPrevious() {
            return prev != null;
        }

        @Override
        public T previous() {
            if (!hasPrevious())
                throw new NoSuchElementException("You are at the start of the list");

            T res = prev.value;
            cursor = prev;

            prev = cursor.prev;


            return res;
        }

        @Override
        public boolean hasNext() {
            return cursor != null;
        }

        @Override
        public T next() {
            if (!hasNext())
                throw new NoSuchElementException("List ended!");

            T res = cursor.value;

            prev = cursor;
            cursor = cursor.next;

            return res;
        }
    }
}
