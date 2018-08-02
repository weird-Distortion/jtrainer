package exercises.arrays.task3;

import java.util.Arrays;

/**
 * "So who is leading us on?" asked some of the superheroes.
 * "I know how to choose! The guy with the longest di.." said Donald.
 * "WTF?! That's sexism, racism, antisim...." yelled Angela.
 * "Ok, OK. Calm down! The leader is the hero with the coolest and longest name. Is that ok?" asked Vladimir.
 *
 * Find the hero with the longest d.. name. So he's going to lead the fellows. Print his name with capital letters.
 */

public class Leader {
    private static final String[] superheroes = {"Emmanuel", "Giuseppe", "Angela", "Donald", "Justin", "Shinzo", "Vladimir", "Teresa"};

    public static void main(String[] args) {
        System.out.println("Here our superheroes:\n" + Arrays.toString(superheroes) + " !\n");
        System.out.println("Searching...\n");

        findLeader(superheroes);
    }

    public static void findLeader(String[] superheroes) {
        assert superheroes != null;
        String leader = "there's still no leader :("; /* Find a leader here */

        printLeader(leader);
    }

    private static void printLeader(String leader) {
        System.out.println("Looks like the leader is: " + leader);
    }
}
