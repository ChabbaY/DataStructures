package lists;

import java.util.Iterator;

@SuppressWarnings({"all"})
public interface List<E> {
    boolean add(E item);
    void clear();
    E get(int index);
    Iterator<E> iterator();
    boolean remove(int index);
    int size();
    E[] toArray();

    List<E> clone();
    boolean equals(Object o);
    int hashCode();
    String toString();
}