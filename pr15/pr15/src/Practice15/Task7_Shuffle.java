package Practice15;

import java.util.ArrayList;
import java.util.Collections;

public class Task7_Shuffle {
    public static <E> void shuffle(ArrayList<E> list) {
        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Sasha");
        words.add("Artem");
        words.add("Spartak");
        words.add("Arkasha");
        words.add("Natasha");

        System.out.println("Before shuffle: " + words);
        shuffle(words);
        System.out.println("After shuffle: " + words);
    }
}
