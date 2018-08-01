package exercises.arrays.task2;

import java.util.Arrays;

/**
 * * RANG-RANG *
 * Time to take a group picture!
 * Photographer spent a lot of time thinking about light, zoom, shadows...
 * Also he worried how not to make upset any of superheroes, so he decided to put them by name length order.
 * Help the photographer sort them by name length order.
 * Print the result in terminal.
 */

public class SuperheroesLengthOrder {

    private static final String[] superheroes = {"Emmanuel", "Giuseppe", "Angela", "Donald", "Justin", "Shinzo", "Vladimir", "Teresa"};

    public static void main(String[] args) {
        System.out.println("Here our superheroes:\n" + Arrays.toString(superheroes) + " !\n");
        System.out.println("sorting...\n");

        sortHeroes(superheroes);
    }

    public static void sortHeroes(String[] superheroes) {
        /* add your code here */
    }

    private static void printArray(String[] array) {
        System.out.println("Now our superheroes have their seats:\n" /* add your code here */);
    }
}
