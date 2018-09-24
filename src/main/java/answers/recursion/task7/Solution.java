package answers.recursion.task7;

/**
 * TODO complete lore
 *
 * Task:
 * Implement method that return sum of digits.
 * Use recursion!
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(countSum(12052));
    }

    static int countSum(int n) {
        if (n < 10) return n;
        else {
            int result = n % 10;
            return result + countSum(n / 10);
        }
    }
}
