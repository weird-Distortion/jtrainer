package answers.arrays.task5;

import java.util.Arrays;

//TODO complete the lore
/**
 * lore..
 */

public class Solution {

    private static final String[] superheroes = {"Giuseppe", "Angela", "Donald", "Justin", "Vladimir", "Teresa"};

    public static void main(String[] args) {
        System.out.println("Here our superheroes:\n" + Arrays.toString(superheroes) + " !\n");
        System.out.println("Counting...\n");

        countHeroes(superheroes);
    }

    /**
     * Create stream
     * Call method count()
     * Printing
     *
     * Profit!
     *
     * @param superheroes - superheroes' names
     */
    public static void countHeroes(String[] superheroes) {
        assert superheroes != null;
        System.out.println(Arrays.stream(superheroes).count());
    }
}
