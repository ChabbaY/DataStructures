import java.util.Objects;

public class Item {
    private final String name;
    private final int alter;

    public Item(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }
    public int getAlter() {
        return alter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return alter == item.alter && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, alter);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                '}';
    }
}