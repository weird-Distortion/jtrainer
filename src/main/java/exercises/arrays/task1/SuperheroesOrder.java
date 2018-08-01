package exercises.arrays.task1;

import java.util.Arrays;

/**
 * Our superheroes have a kindly meeting today.
 * But they don't know where each one has to seat.
 * Help them to take seats by alphabet order.
 * Print the result in terminal.
 */

public class SuperheroesOrder {

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
