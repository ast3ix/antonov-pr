package Practice15;

import java.util.ArrayList;
import java.util.Collections;

public class Task8_Sort {
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Natasha");
        words.add("Sasha");
        words.add("Artem");
        words.add("Spartak");
        words.add("Arkasha");

        System.out.println("Before sort: " + words);
        sort(words);
        System.out.println("After sort: " + words);
    }
}
