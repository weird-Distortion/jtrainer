package answers.arrays.task1;

import java.util.Arrays;

/**
 * Our superheroes have a kindly meeting today.
 * But they don't know where each one has to seat.
 * Help them to take seats by alphabet order.
 * Print the result in terminal.
 */

public class Solution {

    private static final String[] superheroes = {"Emmanuel", "Giuseppe", "Angela", "Donald", "Justin", "Shinzo", "Vladimir", "Teresa"};

    public static void main(String[] args) {
        System.out.println("Here our superheroes:\n" + Arrays.toString(superheroes) + " !\n");
        System.out.println("sorting...\n");

        sortHeroes(superheroes);
    }

    /**
     * Sorting method.
     *
     * @param superheroes - not sorted superheroes' names
     */
    public static void sortHeroes(String[] superheroes) {
        Arrays.sort(superheroes);
        printArray(superheroes);
    }

    /**
     * Simple printing method.
     *
     * @param array - sorted friends' names
     */
    private static void printArray(String[] array) {
        System.out.println("Now our superheroes have their seats:\n" + Arrays.toString(array));
    }
}
