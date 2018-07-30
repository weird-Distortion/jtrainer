package exercises.arrays.task1;

import java.util.Arrays;

/**
 * Our friends have a kindly meeting today.
 * But they don't know where each one has to seat.
 * Help friends to take seats by alphabet order.
 * Print the result in terminal.
 */

public class FriendsOrder {
    private static final String[] friends = {"Emmanuel", "Giuseppe", "Angela", "Donald", "Justin", "Shinzo", "Vladimir", "Teresa"};

    public static void main(String[] args) {
        System.out.println("Here our friends:\n" + Arrays.toString(friends) + " !\n");
        System.out.println("sorting...\n");

        sortFriends(friends);
    }

    public static void sortFriends(String[] friends) {
        /* add your code here */
    }

    private static void printArray(String[] array) {
        System.out.println("Now our friends have their seats:\n" /* add your code here */);
    }
}
