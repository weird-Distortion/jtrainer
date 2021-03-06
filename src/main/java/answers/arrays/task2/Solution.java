package answers.arrays.task2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * * RANG-RANG *
 * Time to take a group picture!
 * Photographer spent a lot of time thinking about light, zoom, shadows...
 * Also he worried how not to make upset any of superheroes, so he decided to put them by name length order.
 * Help the photographer sort them by name length order.
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
     * @param superheroes - not sorted friends' names
     */
    public static void sortHeroes(String[] superheroes) {
        Arrays.sort(superheroes, Comparator.comparing(String::length));
        printArray(superheroes);
    }

    /**
     * Simple printing method.
     *
     * @param array - sorted superheroes' names
     */
    private static void printArray(String[] array) {
        System.out.println("Now our superheroes have their seats:\n" + Arrays.toString(array));
    }
}
