package answers.recursion.task3;

/**
 * TODO complete lore
 *
 * Task:
 * Implement method that prints all digits of n
 * from first to last.
 * Split digits with space
 * Use recursion!
 */
public class Solution {
    public static void main(String[] args) {
        int n = 2456;

        showDigits(n);
    }

    public static void showDigits(int n) {
        if (n < 10) System.out.print(n + " ");
        else {
            showDigits(n / 10);
            System.out.print(n % 10 + " ");
        }
    }
}
