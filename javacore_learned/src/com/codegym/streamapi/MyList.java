package com.codegym.streamapi;


import java.util.*;
import java.util.function.Consumer;


public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object [] elements;

/*    public MyList(int size) {
        elements = new Object[size];
    }*/


    public void sortComparable() {

        List<String> s = new ArrayList<>();

        for (int i = 0; i < elements.length-1; i++) {
            for (int j = i+1; j < elements.length; j++) {
                Comparable comparable = (Comparable) elements[i];
                if (comparable.compareTo(elements[j])>0) {
                    Object temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }
    }
    public void sortComparator(Comparator<Object> comparator) {
        for (int i = 0; i < elements.length-1; i++) {
            for (int j = i+1; j < elements.length; j++) {
                if (comparator.compare(elements[i], elements[j])>0) {
                    Object temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }
    }


    public Optional<Object> findMax(Comparator<Object> comparator){
            Optional<Object> max = Optional.empty();
            max = Optional.of(elements[0]);
            for (int i = 0; i < size; i++) {
                if(comparator.compare(max.get(), elements[i])<0){
                    max = Optional.of(elements[i]);
                }
            }
            return max;
        }

        public void forEach(Consumer c){
            for (int i = 0; i < size; i++) {
                c.accept(elements[i]);
            }
        }
    public MyListIterator<E> createIterator() {
        MyListIterator<E> myListIterator = new MyListIterator<>();
        return myListIterator;
    }

    private class MyListIterator<E> implements Iterator {

        private int position;
        @Override
        public boolean hasNext() {
            if (position < elements.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return elements[position++];
            }
            return null;
        }
    }
    public MyList(int capacity) {
        elements = new Object[capacity];
    }


    public boolean add(E element) {
        if (size == elements.length) {
            return false ;
        }
        elements[size++] = element; //  elements[size] = element , sau do size+=1 ;
        return true ;
    }

    public void add(int index, E element) {
        for (int i = size; i > index; i--)
            elements[i] = elements[i - 1];
        elements[index] = element;
        size++;
    }
    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds") ;
    }

    public E remove(int index) {
        checkIndex(index);
        E temp = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return temp;
    }
    public int size() {
        return this.size;
    }

    @Override
    public com.codegym.comparable.MyList clone() {
        com.codegym.comparable.MyList<E> clone = new com.codegym.comparable.MyList<E>(elements.length);
        for (E e : (E[]) elements) {
            clone.add(e);
        }
        return clone;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i]))
                return true;
        return false;
    }
    public int indexOf(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i])) return i;
        return -1;
    }

    public int lastIndexOf(E e) {
        for (int i = size - 1; i >= 0; i--) if (e.equals(elements[i])) return i;
        return -1;
    }


    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    public E get(int index){
        if (index >= size|| index < 0){
            throw new IndexOutOfBoundsException("Index : " + index + ",size : " + index);
        }
        return (E) elements[index] ; // vi moi element la  1 object
    }

    public void printMyList(){
        int i = 0 ;
        for( E e : (E[]) elements){
            System.out.println( "Element " + i +" : " + e);
            i++;
        }
    }

}
