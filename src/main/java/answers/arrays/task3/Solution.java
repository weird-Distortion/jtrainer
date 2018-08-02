package answers.arrays.task3;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

/**
 * "So who is leading us on?" asked some of the superheroes.
 * "I know how to choose! The guy with the longest di.." said Donald.
 * "WTF?! That's sexism, racism, antisim...." yelled Angela.
 * "Ok, OK. Calm down! The leader is the hero with the coolest and longest name. Is that ok?" asked Vladimir.
 *
 * Find the hero with the longest d.. name. So he's going to lead the fellows. Print his name with capital letters.
 */

public class Solution {

    private static final String[] superheroes = {"Emmanuel", "Giuseppe", "Angela", "Donald", "Justin", "Shinzo", "Vladimir", "Teresa"};

    public static void main(String[] args) {
        System.out.println("Here our superheroes:\n" + Arrays.toString(superheroes) + " !\n");
        System.out.println("Searching...\n");

        findLeader(superheroes);
    }

    /**
     * Create stream
     * find max by String length.
     *
     * @param superheroes - not sorted friends' names
     */
    public static void findLeader(String[] superheroes) {
        assert superheroes != null;
        String leader = Stream.of(superheroes).max(comparing(String::length)).get();
        printLeader(leader);
    }

    /**
     * Simple printing method.
     *
     * @param leader - founded name
     */
    private static void printLeader(String leader) {
        System.out.println("Looks like the leader is: " /* print his name here */);
    }
}
