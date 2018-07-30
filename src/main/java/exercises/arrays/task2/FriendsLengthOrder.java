package exercises.arrays.task2;

import java.util.Arrays;

/**
 *  * RANG-RANG *
 * It's lunch time!
 * So friends decided to take a break and continue their conversation within more relax environment.
 * But some of the friends want to change their seats because of cuisine type.
 * Some of them like Italian, but don't like British...
 * So they need to take seats by their name length order. to waiter to be easier figure out with orders.
 * Help friends to take seats by name length order.
 * Print the result in terminal.
 */

public class FriendsLengthOrder {
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
