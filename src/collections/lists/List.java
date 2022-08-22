package collections.lists;

import collections.Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.UnaryOperator;

@SuppressWarnings({"unused"})
public interface List<E> extends Collection<E> {
    @Override
    /*
    Appends the specified element to the end of this list (optional operation).
     */
    boolean add(E e);
    /*
    Inserts the specified element at the specified position in this list (optional operation).
     */
    void add(int index, E element);
    @Override
    /*
    Appends all the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator (optional operation).
     */
    boolean addAll(Collection<? extends E> c);
    /*
    Inserts all the elements in the specified collection into this list at the specified position (optional operation).
     */
    boolean addAll(int index, Collection<? extends E> c);
    @Override
    /*
    Removes all the elements from this list (optional operation).
     */
    void clear();
    @Override
    /*
    Returns true if this list contains the specified element.
     */
    boolean contains(Object o);
    @Override
    /*
    Returns true if this list contains all the elements of the specified collection.
     */
    boolean containsAll(Collection<?> c);
    /*
    Returns the element at the specified position in this list.
     */
    E get(int index);
    /*
    Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
     */
    int indexOf(Object o);
    @Override
    /*
    Returns true if this list contains no elements.
     */
    boolean isEmpty();
    @Override
    /*
    Returns an iterator over the elements in this list in proper sequence.
     */
    Iterator<E> iterator();
    /*
    Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
     */
    int lastIndexOf(Object o);
    /*
    Returns a list iterator over the elements in this list (in proper sequence).
     */
    ListIterator<E> listIterator();
    /*
    Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list.
     */
    ListIterator<E> listIterator(int index);
    /*
    Removes the element at the specified position in this list (optional operation).
     */
    E remove(int index);
    @Override
    /*
    Removes the first occurrence of the specified element from this list, if it is present (optional operation).
     */
    boolean remove(Object o);
    @Override
    /*
    Removes from this list all of its elements that are contained in the specified collection (optional operation).
     */
    boolean removeAll(Collection<?> c);
    /*
    Replaces each element of this list with the result of applying the operator to that element.
     */
    default void replaceAll(UnaryOperator<E> operator) {
        //TODO implement
    }
    @Override
    /*
    Retains only the elements in this list that are contained in the specified collection (optional operation).
     */
    boolean retainAll(Collection<?> c);
    /*
    Replaces the element at the specified position in this list with the specified element (optional operation).
     */
    E set(int index, E element);
    @Override
    /*
    Returns the number of elements in this list.
     */
    int size();
    /*
    Sorts this list according to the order induced by the specified Comparator.
     */
    default void sort(Comparator<? super E> c) {
        //TODO implement
    }
    @Override
    /*
    Creates a Spliterator over the elements in this list.
     */
    default Spliterator<E> spliterator() {
        return Collection.super.spliterator();//TODO implement
    }
    /*
    Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
     */
    List<E> subList(int fromIndex, int toIndex);
    @Override
    /*
    Returns an array containing all the elements in this list in proper sequence (from first to last element).
     */
    Object[] toArray();
    @Override
    /*
    Returns an array containing all the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
     */
    <T> T[] toArray(T[] a);

    @Override
    List<E> clone();
    @Override
    boolean equals(Object o);
    @Override
    int hashCode();
    @Override
    String toString();
}