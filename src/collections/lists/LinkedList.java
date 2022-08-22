package collections.lists;

import collections.Collection;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

@SuppressWarnings({"unused"})
public class LinkedList<E extends Cloneable> implements List<E>, Deque<E>, Cloneable, Serializable {
    private ListItem first;
    private int count;

    public LinkedList() {
        first = new Ending();
    }

    @Override
    /*
    Appends the specified element to the end of this list.
     */
    public boolean add(E e) {
        if (e == null) return false;
        first = first.add(e);
        return true;
    }
    @Override
    /*
    Inserts the specified element at the specified position in this list.
     */
    public void add(int index, E element) {
        if ((index < 0) || (element == null)) return;
        first = first.add(index, element);
    }
    @Override
    /*
    Appends all the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
     */
    public boolean addAll(Collection<? extends E> c) {
        if (c == null) return false;
        for (E e : c) {
            add(e);
        }
        return true;
    }
    @Override
    /*
    Inserts all the elements in the specified collection into this list, starting at the specified position.
     */
    public boolean addAll(int index, Collection<? extends E> c) {
        if ((index < 0) || (c == null)) return false;
        for (E e : c) {
            add(index, e);
            index++;
        }
        return true;
    }
    /*
    Inserts the specified element at the beginning of this list.
     */
    public void addFirst(E e) {
        add(0, e);
    }
    /*
    Appends the specified element to the end of this list.
     */
    public void addLast(E e) {
        add(e);
    }
    @Override
    /*
    Removes all the elements from this list.
     */
    public void clear() {
        first = new Ending();
        count = 0;
    }
    @Override
    /*
    Returns true if this list contains the specified element.
     */
    public boolean contains(Object o) {
        return false;//TODO implement
    }
    @Override
    /*
    Returns true if this collection contains all the elements in the specified collection.
     */
    public boolean containsAll(Collection<?> c) {
        return false;//TODO implement
    }
    /*
    Returns an iterator over the elements in this deque in reverse sequential order.
     */
    public Iterator<E> descendingIterator() {
        return null;//TODO implement
    }
    /*
    Retrieves, but does not remove, the head (first element) of this list.
     */
    public E element() {
        return get(0);
    }
    @Override
    /*
    Returns the element at the specified position in this list.
     */
    public E get(int index) {
        return first.get(index);
    }
    /*
    Returns the first element in this list.
     */
    public E getFirst() {
        return get(0);
    }
    /*
    Returns the last element in this list.
     */
    public E getLast() {
        return get(size() - 1);
    }
    @Override
    /*
    Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
     */
    public int indexOf(Object o) {
        return 0;//TODO implement
    }
    @Override
    /*
    Returns true if this collection contains no elements.
     */
    public boolean isEmpty() {
        return (size() == 0);
    }
    @Override
    /*
    Returns an iterator over the elements in this list in proper sequence.
     */
    public Iterator<E> iterator() {
        return new Iterator<>() {
            ListItem current = first;

            @Override
            public boolean hasNext() {
                return (current.next != null);
            }

            @Override
            public E next() {
                E e = ((DataItem)current).data;
                current = current.next;
                return e;
            }
        };
    }
    @Override
    /*
    Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
     */
    public int lastIndexOf(Object o) {
        return 0;//TODO implement
    }
    @Override
    /*
    Returns a list-iterator of the elements in this list (in proper sequence).
     */
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }
    @Override
    /*
    Returns a list-iterator of the elements in this list (in proper sequence), starting at the specified position in the list.
     */
    public ListIterator<E> listIterator(int index) {
        return null;//TODO implement
    }
    /*
    Adds the specified element as the tail (last element) of this list.
     */
    public boolean offer(E e) {
        return add(e);
    }
    /*
    Inserts the specified element at the front of this list.
     */
    public boolean offerFirst(E e) {
        add(0, e);
        return true;
    }
    /*
    Inserts the specified element at the end of this list.
     */
    public boolean offerLast(E e) {
        return add(e);
    }

    @Override
    public Stream<E> parallelStream() {
        return List.super.parallelStream();
    }

    /*
        Retrieves, but does not remove, the head (first element) of this list.
         */
    public E peek() {
        return get(0);
    }
    /*
    Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
     */
    public E peekFirst() {
        return get(0);
    }
    /*
    Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
     */
    public E peekLast() {
        return get(size() - 1);
    }
    /*
    Retrieves and removes the head (first element) of this list.
     */
    public E poll() {
        return null;//TODO implement
    }
    /*
    Retrieves and removes the first element of this list, or returns null if this list is empty.
     */
    public E pollFirst() {
        return null;//TODO implement
    }
    /*
    Retrieves and removes the last element of this list, or returns null if this list is empty.
     */
    public E pollLast() {
        return null;//TODO implement
    }
    /*
    Pops an element from the stack represented by this list.
     */
    public E pop() {
        return null;//TODO implement
    }
    /*
    Pushes an element onto the stack represented by this list.
     */
    public void push(E e) {

    }
    /*
    Retrieves and removes the head (first element) of this list.
     */
    public E remove() {
        return null;//TODO implement
    }
    @Override
    /*
    Removes the element at the specified position in this list.
     */
    public E remove(int index) {
        return null;//TODO implement
    }
    @Override
    /*
    Removes the first occurrence of the specified element from this list, if it is present.
     */
    public boolean remove(Object o) {
        return false;//TODO implement
    }
    @Override
    /*
    Removes from this list all of its elements that are contained in the specified collection (optional operation).
     */
    public boolean removeAll(Collection<?> c) {
        return false;//TODO implement
    }
    @Override
    /*
    Removes all the elements of this collection that satisfy the given predicate.
     */
    public boolean removeIf(Predicate<? super E> filter) {
        return List.super.removeIf(filter);//TODO implement
    }
    /*
    Removes and returns the first element from this list.
     */
    public E removeFirst() {
        return remove();
    }
    /*
    Removes the first occurrence of the specified element in this list (when traversing the list from head to tail).
     */
    public boolean removeFirstOccurrence(Object o) {
        return remove(o);
    }
    /*
    Removes and returns the last element from this list.
     */
    public E removeLast() {
        return remove(size() - 1);
    }
    /*
    Removes the last occurrence of the specified element in this list (when traversing the list from head to tail).
     */
    public boolean removeLastOccurrence(Object o) {
        return false;//TODO implement
    }
    @Override
    /*
    Replaces each element of this list with the result of applying the operator to that element.
     */
    public void replaceAll(UnaryOperator<E> operator) {
        List.super.replaceAll(operator);//TODO implement
    }
    @Override
    /*
    Retains only the elements in this list that are contained in the specified collection (optional operation). In other words, removes from this list all of its elements that are not contained in the specified collection.
     */
    public boolean retainAll(Collection<?> c) {
        return false;//TODO implement
    }
    @Override
    /*
    Replaces the element at the specified position in this list with the specified element.
     */
    public E set(int index, E element) {
        return null;
    }
    @Override
    /*
    Returns the number of elements in this list.
     */
    public int size() {
        return count;
    }
    @Override
    /*
    Sorts this list according to the order induced by the specified Comparator.
     */
    public void sort(Comparator<? super E> c) {
        List.super.sort(c);//TODO implement
    }
    @Override
    /*
    Creates a late-binding and fail-fast Spliterator over the elements in this list.
     */
    public Spliterator<E> spliterator() {
        return List.super.spliterator();//TODO implement
    }
    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;//TODO implement
    }
    @Override
    /*
    Returns an array containing all the elements in this list in proper sequence (from first to last element).
     */
    public Object[] toArray() {
        Object[] erg = new Object[size()];
        int counter = 0;
        for (E e : this) {
            erg[counter] = e;
            counter++;
        }
        return erg;
    }
    @Override
    /*
    Returns an array containing all the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
     */
    public <T> T[] toArray(T[] a) {
        return null;//TODO implement
    }

    private abstract class ListItem {
        ListItem next;

        public abstract ListItem add(E item);
        public abstract ListItem add(int index, E item);
        public abstract E get(int index);
        public abstract ListItem remove(int index);
    }
    private class DataItem extends ListItem {
        E data;

        public DataItem(E data) {
            this.data = data;
            next = new Ending();
        }

        @Override
        public ListItem add(E item) {
            next = next.add(item);
            return this;
        }
        @Override
        public ListItem add(int index, E item) {
            if (index > 0) {
                next = next.add(index, item);
                return this;
            } else {
                DataItem dataitem = new DataItem(item);
                dataitem.next = this;
                return dataitem;
            }
        }
        @Override
        public E get(int index) {
            if (index == 0) return data;
            return next.get(index - 1);
        }
        @Override
        public ListItem remove(int index) {
            if (index == 0) {
                count--;
                return next;
            }
            next = next.remove(index - 1);
            return this;
        }
    }
    private class Ending extends ListItem {
        @Override
        public ListItem add(E item) {
            DataItem data = new DataItem(item);
            data.next = this;
            count++;
            return data;
        }
        @Override
        public ListItem add(int index, E item) {
            DataItem data = new DataItem(item);
            data.next = this;
            count++;
            return data;
        }
        @Override
        public E get(int index) {
            return null;
        }
        @Override
        public ListItem remove(int index) {
            return this;
        }
    }

    @Override
    public LinkedList<E> clone() {
        try {
            LinkedList<E> clone = (LinkedList<E>) super.clone();
            for (E e : this) {
                clone.add(e);//TODO replace with deep copy
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || (o.getClass() != getClass())) return false;
        LinkedList<?> list = (LinkedList<?>)o;
        return Arrays.equals(list.toArray(), toArray());
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(toArray());
    }
    @Override
    public String toString() {
        StringBuilder erg = new StringBuilder("LinkedList{");
        for (E e : this) {
            erg.append("-> ").append(e);
        }
        erg.append("}");
        return erg.toString();
    }
}