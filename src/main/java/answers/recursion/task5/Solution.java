package answers.recursion.task5;

/**
 * TODO complete lore
 *
 * Task:
 * Implement method that checks if n is a power of 2.
 * Print "YES" if it is.
 * Print "NO if isn't.
 * Use recursion!
 *
 * Example:
 * n == 10. result: NO.
 * n = 64. result: YES. (2*2*2*2*2*2 == 64)
 */
public class Solution {
    public static void main(String[] args) {
        int n = 4096;
        isPowerOfTwo(n);

        n = 10;
        isPowerOfTwo(n);
    }

    public static void isPowerOfTwo(double n) {
        if (n == 1) System.out.println("YES");
        else if (n > 1){
            isPowerOfTwo(n / 2);
        } else System.out.println("NO");
    }
}
