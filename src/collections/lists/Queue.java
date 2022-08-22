package collections.lists;

import collections.Collection;

@SuppressWarnings({"unused"})
public interface Queue<E> extends Collection<E> {
    @Override
    /*
    Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
     */
    boolean add(E e);
    /*
    Retrieves, but does not remove, the head of this queue.
     */
    E element();
    /*
    Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
     */
    boolean offer(E e);
    /*
    Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
     */
    E peek();
    /*
    Retrieves and removes the head of this queue, or returns null if this queue is empty.
     */
    E poll();
    /*
    Retrieves and removes the head of this queue.
     */
    E remove();
}