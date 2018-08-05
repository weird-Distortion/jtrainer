package answers.arrays.task7;

import java.util.Arrays;
import java.util.stream.Stream;

//TODO complete lore.
/**
 * LORE
 */

public class Solution {

    private static final String[] superheroes = {"Emmanuel-OOP", "Giuseppe", "Angela-OOP", "Donald-OOP", "Justin", "Shinzo", "Vladimir-OOP", "Teresa"};

    public static void main(String[] args) {
        System.out.println("Here our superheroes:\n" + Arrays.toString(superheroes) + " !\n");
        System.out.println("Searching...\n");

        teamUp(superheroes);
    }

    /**
     * Create stream
     * find max by String length.
     *
     * @param superheroes - not sorted friends' names
     */
    public static void teamUp(String[] superheroes) {
        assert superheroes != null;
        System.out.println("Team A:");
        Stream.of(superheroes).filter(x -> x.endsWith("OOP")).forEach(hero -> System.out.print(hero + " "));
        System.out.println("\nTeam B:");
        Stream.of(superheroes).filter(x -> !x.endsWith("OOP")).forEach(hero -> System.out.print(hero + " "));
    }
}
