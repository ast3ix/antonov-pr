package Practice15;

import java.util.ArrayList;

public class Task3_RemoveDuplicates {
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();
        for (E element : list) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Sasha");
        list.add("Artem");
        list.add("Sasha");
        list.add("Spartak");
        list.add("Artem");

        System.out.println("Original List: " + list);
        ArrayList<String> uniqueList = removeDuplicates(list);
        System.out.println("List without duplicates: " + uniqueList);
    }
}
