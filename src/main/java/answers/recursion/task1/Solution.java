package answers.recursion.task1;

/**
 * TODO complete lore
 *
 * Task:
 * Implement method that prints all numbers
 * before n in descending order.
 * n is inclusive.
 * Use recursion!
 */
public class Solution {
    public static void main(String[] args) {
        int n = 5;

        showNumbers(n);
    }

    static void showNumbers(int n) {
        if (n == 0) System.out.print(n + " ");
        else {
            System.out.print(n + " ");
            showNumbers(n - 1);
        }
    }
}
