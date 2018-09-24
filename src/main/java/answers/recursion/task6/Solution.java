package answers.recursion.task6;

/**
 * TODO complete lore
 *
 * Task:
 * Implement method that return reversed number.
 * Use recursion!
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(reverseNumber(574, 0));
    }

    static int reverseNumber(int n, int i) {
        if (n == 0) return i;
        else {
            return reverseNumber(n / 10, i * 10 + n % 10);
        }
    }
}
