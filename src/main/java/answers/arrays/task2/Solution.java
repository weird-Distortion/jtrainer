package answers.arrays.task2;

import java.util.Arrays;
import java.util.Comparator;

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
        Arrays.sort(friends, Comparator.comparing(String::length));
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
