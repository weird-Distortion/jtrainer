package answers.arrays.task3;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

/**
 * who's the leader
 */

//TODO complete lore and method expressions
public class Solution {

    private static final String[] superheroes = {"Emmanuel", "Giuseppe", "Angela", "Donald", "Justin", "Shinzo", "Vladimir", "Teresa"};

    public static void main(String[] args) {
        System.out.println("Here our superheroes:\n" + Arrays.toString(superheroes) + " !\n");
        System.out.println("Searching...\n");

        findLeader(superheroes);
    }

    public static void findLeader(String[] superheroes) {
        assert superheroes != null;
        String leader = Stream.of(superheroes).max(comparing(String::length)).get();
        printLeader(leader);
    }

    private static void printLeader(String leader) {
        System.out.println("Looks like the leader is: " + leader);
    }
}
