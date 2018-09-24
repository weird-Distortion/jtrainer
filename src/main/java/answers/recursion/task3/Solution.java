package answers.recursion.task3;

/**
 * TODO complete lore
 *
 * Task:
 * Implement method that prints all digits of n
 * from first to last.
 * Use recursion!
 */
public class Solution {
    public static void main(String[] args) {
        int n = 2456;

        showNumerics(n);
    }

    static void showNumerics(int n) {
        if (n < 10) System.out.print(n + " ");
        else {
            showNumerics(n / 10);
            System.out.print(n % 10 + " ");
        }
    }
}
