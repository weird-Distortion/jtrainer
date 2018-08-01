package exercises.arrays.task3;

import java.util.Arrays;

/**
 * who's the leader
 */

//TODO complete lore
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
