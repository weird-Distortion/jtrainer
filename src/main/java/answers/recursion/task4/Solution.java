package answers.recursion.task4;

/**
 * TODO complete lore
 *
 * Task:
 * Implement method that prints all digits of n
 * from last to the first.
 * Split digits with space
 * Use recursion!
 */
public class Solution {
    public static void main(String[] args) {
        int n = 1026;

        showReverseDigits(n);
    }

    public static void showReverseDigits(int n) {
        if (n < 10) System.out.print(n + " ");
        else {
            System.out.print(n % 10 + " ");
            showReverseDigits(n / 10);
        }
    }
}
