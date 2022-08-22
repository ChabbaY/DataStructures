package collections.lists;

import java.util.Iterator;

@SuppressWarnings({"unused"})
public interface Deque<E> extends Queue<E> {
    @Override
    /*
    Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
     */
    boolean add(E e);
    /*
    Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
     */
    void addFirst(E e);
    /*
    Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
     */
    void addLast(E e);
    @Override
    /*
    Returns true if this deque contains the specified element.
     */
    boolean contains(Object o);
    /*
    Returns an iterator over the elements in this deque in reverse sequential order.
     */
    Iterator<E> descendingIterator();
    @Override
    /*
    Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque).
     */
    E element();
    /*
    Retrieves, but does not remove, the first element of this deque.
     */
    E getFirst();
    /*
    Retrieves, but does not remove, the last element of this deque.
     */
    E getLast();
    @Override
    /*
    Returns an iterator over the elements in this deque in proper sequence.
     */
    Iterator<E> iterator();
    @Override
    /*
    Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and false if no space is currently available.
     */
    boolean offer(E e);
    /*
    Inserts the specified element at the front of this deque unless it would violate capacity restrictions.
     */
    boolean offerFirst(E e);
    /*
    Inserts the specified element at the end of this deque unless it would violate capacity restrictions.
     */
    boolean offerLast(E e);
    @Override
    /*
    Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
     */
    E peek();
    /*
    Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
     */
    E peekFirst();
    /*
    Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
     */
    E peekLast();
    @Override
    /*
    Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
     */
    E poll();
    /*
    Retrieves and removes the first element of this deque, or returns null if this deque is empty.
     */
    E pollFirst();
    /*
    Retrieves and removes the last element of this deque, or returns null if this deque is empty.
     */
    E pollLast();
    /*
    Pops an element from the stack represented by this deque.
     */
    E pop();
    /*
    Pushes an element onto the stack represented by this deque (in other words, at the head of this deque) if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
     */
    void push(E e);
    @Override
    /*
    Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque).
     */
    E remove();
    @Override
    /*
    Removes the first occurrence of the specified element from this deque.
     */
    boolean remove(Object o);
    /*
    Retrieves and removes the first element of this deque.
     */
    E removeFirst();
    /*
    Removes the first occurrence of the specified element from this deque.
     */
    boolean removeFirstOccurrence(Object o);
    /*
    Retrieves and removes the last element of this deque.
     */
    E removeLast();
    /*
    Removes the last occurrence of the specified element from this deque.
     */
    boolean removeLastOccurrence(Object o);
    @Override
    /*
    Returns the number of elements in this deque.
     */
    int size();
}