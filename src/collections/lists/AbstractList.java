package collections.lists;

public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E> {
    /*
    The number of times this list has been structurally modified.
     */
    protected int modCount;

    protected AbstractList() {
        modCount = 0;
    }

    //TODO implement methods
}