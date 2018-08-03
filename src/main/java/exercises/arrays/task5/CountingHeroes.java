package exercises.arrays.task5;

import java.util.Arrays;

//TODO Complete lore.
/**
 * Counting heroes
 */

public class CountingHeroes {

    private static final String[] superheroes = {"Giuseppe", "Angela", "Donald", "Justin", "Vladimir", "Teresa"};

    public static void main(String[] args) {
        System.out.println("Here our superheroes:\n" + Arrays.toString(superheroes) + " !\n");
        System.out.println("Counting...\n");

        countHeroes(superheroes);
    }

    public static void countHeroes(String[] superheroes) {
        assert superheroes != null;
        /* count heroes here */
    }
}
