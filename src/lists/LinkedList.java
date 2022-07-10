package lists;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class LinkedList<E> implements List<E>, Cloneable, Iterable<E> {
    private ListItem first;
    private int count;

    public LinkedList() {
        first = new Ending();
    }

    @Override
    public boolean add(E item) {
        first = first.add(item);
        return true;
    }
    @Override
    public void clear() {
        first = new Ending();
        count = 0;
    }
    @Override
    public E get(int index) {
        return first.get(index);
    }
    @Override
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
    public boolean remove(int index) {
        first.remove(index);
        return true;
    }
    @Override
    public int size() {
        return count;
    }
    @Override
    public E[] toArray() {
        E[] erg = (E[])new Object[size()];
        int counter = 0;
        for (E e : this) {
            erg[counter] = e;
            counter++;
        }
        return erg;
    }

    private abstract class ListItem {
        ListItem next;

        public abstract ListItem add(E item);
        public abstract E get(int index);
        public abstract ListItem remove(int index);
    }
    private class DataItem extends ListItem {
        E data;

        public DataItem(E data) {
            this.data = data;
        }

        @Override
        public ListItem add(E item) {
            next = next.add(item);
            return this;
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
        LinkedList<E> clone = new LinkedList<E>();
        try {
            clone = (LinkedList<E>) super.clone();
            for (E e : this) {
                clone.add(e);//TODO replace with deep copy
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
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