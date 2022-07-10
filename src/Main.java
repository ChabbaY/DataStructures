import lists.LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList<Item> linkedList = new LinkedList<>();
        linkedList.add(new Item("Anton", 1));
        linkedList.add(new Item("Berta", 2));
        linkedList.add(new Item("Caesar", 3));
        System.out.println(linkedList.get(0));

        System.out.println(linkedList.size());

        System.out.println(Arrays.toString(linkedList.toArray()));
        System.out.println(linkedList);

        linkedList.remove(1);

        System.out.println(linkedList);
    }
}