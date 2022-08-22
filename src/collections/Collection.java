package collections;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

@SuppressWarnings({"unused"})
public interface Collection<E> extends Iterable<E> {
    /*
    Ensures that this collection contains the specified element (optional operation).
     */
    boolean add(E item);
    /*
    Adds all the elements in the specified collection to this collection (optional operation).
     */
    boolean addAll(Collection<? extends E> c);
    /*
    Removes all the elements from this collection (optional operation).
     */
    void clear();
    /*
    Returns true if this collection contains the specified element.
     */
    boolean contains(Object o);
    /*
    Returns true if this collection contains all the elements in the specified collection.
     */
    boolean containsAll(Collection<?> c);
    /*
    Returns true if this collection contains no elements.
     */
    boolean isEmpty();
    @Override
    /*
    Returns an iterator over the elements in this collection.
     */
    Iterator<E> iterator();
    /*
    Returns a possibly parallel Stream with this collection as its source.
     */
    default Stream<E> parallelStream() {
        return null;//TODO implement
    }
    /*
    Removes a single instance of the specified element from this collection, if it is present (optional operation).
     */
    boolean remove(Object o);
    /*
    Removes all of this collection's elements that are also contained in the specified collection (optional operation).
     */
    boolean removeAll(Collection<?> c);
    /*
    Removes all the elements of this collection that satisfy the given predicate.
     */
    default boolean removeIf(Predicate<? super E> filter) {
        return false;//TODO implement
    }
    /*
    Retains only the elements in this collection that are contained in the specified collection (optional operation).
     */
    boolean retainAll(Collection<?> c);
    /*
    Returns the number of elements in this collection.
     */
    int size();
    /*
    Creates a Spliterator over the elements in this collection.
     */
    default Spliterator<E> spliterator() {
        return null;//TODO implement
    }
    /*
    Returns a sequential Stream with this collection as its source.
     */
    default Stream<E> stream() {
        return null;//TODO implement
    }
    /*
    Returns an array containing all the elements in this collection.
     */
    Object[] toArray();
    /*
    Returns an array containing all the elements in this collection; the runtime type of the returned array is that of the specified array.
     */
    <T> T[] toArray(T[] a);

    Collection<E> clone();
    boolean equals(Object o);
    int hashCode();
    String toString();
}