package answers.arrays.task1;

import java.util.Arrays;

/**
 * Our friends have a kindly meeting today.
 * But they don't know where each one has to seat.
 * Help the fellows to take seats by alphabet order.
 * Print the result in terminal.
 */

public class Solution {
    private static final String[] friends = {"Emmanuel", "Giuseppe", "Angela", "Donald", "Justin", "Shinzo", "Vladimir", "Teresa"};

    public static void main(String[] args) {
        System.out.println("Here our friends:\n" + Arrays.toString(friends) + " !\n");
        System.out.println("sorting...\n");

        sortFriends(friends);
    }

    /**
     * Sorting method.
     *
     * @param friends - not sorted friends' names
     */
    public static void sortFriends(String[] friends) {
        Arrays.sort(friends);
        printArray(friends);
    }

    /**
     * Simple printing method.
     *
     * @param array - sorted friends' names
     */
    private static void printArray(String[] array) {
        System.out.println("Now our friends have their seats:\n" + Arrays.toString(array));
    }
}
