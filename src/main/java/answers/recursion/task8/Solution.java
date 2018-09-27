package answers.recursion.task8;

/**
 * TODO complete lore
 *
 * Task:
 * Implement Ackermann function.
 * https://en.wikipedia.org/wiki/Ackermann_function
 * Use recursion!
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(ackermann(3, 2));
    }

    static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);
        } else {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }
}
