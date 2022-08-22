package collections.lists;

import collections.Collection;

import java.util.Iterator;
import java.util.ListIterator;

public abstract class AbstractSequentialList<E> extends AbstractList<E> {
    protected AbstractSequentialList() {
        //TODO implement
    }

    /*
    Inserts the specified element at the specified position in this list (optional operation).
     */
    abstract public void add(int index, E element);//TODO make non-abstract
    /*
    Inserts all of the elements in the specified collection into this list at the specified position (optional operation).
     */
    abstract public boolean addAll(int index, Collection<? extends E> c);//TODO make non-abstract
    /*
    Returns the element at the specified position in this list.
     */
    abstract public E get(int index);//TODO make non-abstract
    /*
    Returns an iterator over the elements in this list (in proper sequence).
     */
    abstract public Iterator<E> iterator();//TODO make non-abstract
    /*
    Returns a list iterator over the elements in this list (in proper sequence).
     */
    abstract public ListIterator<E> listIterator(int index);
    /*
    Removes the element at the specified position in this list (optional operation).
     */
    abstract public E remove(int index);//TODO make non-abstract
    /*
    Replaces the element at the specified position in this list with the specified element (optional operation).
     */
    abstract public E set(int index, E element);//TODO make non-abstract
}