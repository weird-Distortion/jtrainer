package exercises.arrays.task4;

import java.util.Arrays;

/**
 * Something's wrong...
 * Some of the superheroes look as usual, but do some weird things.
 * The do selfies near every secret stuff in there!
 * So to figure out what is going on, heroes decided to write their names on the piece of paper.
 * We all know that the spies always write their names with odd amount of letters... It's the fact.
 * Find spies! They have odd amount of letter in the name. Print each one in a new line.
 */

public class Spies {

    private static final String[] superheroes = {"Emmmanuel", "Giuseppe", "Angela", "Donald", "Justin", "Shinzzo", "Vladimir", "Teresa"};

    public static void main(String[] args) {
        System.out.println("Here our superheroes:\n" + Arrays.toString(superheroes) + " !\n");
        System.out.println("Searching...\n");

        findSpies(superheroes);
    }

    public static void findSpies(String[] superheroes) {
        assert superheroes != null;
        /* find those bastards here! */
    }
}
