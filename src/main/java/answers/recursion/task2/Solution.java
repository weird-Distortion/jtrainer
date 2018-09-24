package answers.recursion.task2;

/**
 * TODO complete lore
 *
 * Task:
 * There are numbers n and m
 * If n > m: print all numbers between n and m in ascending order.
 * If n < m: print all numbers between n and m in descending order.
 * Use recursion!
 */
public class Solution {
    public static void main(String[] args) {
        int n = 5;
        int m = 10;

        System.out.println("n < m");
        showNumbers(n, m);

        n = 10;
        m = 5;

        System.out.println("\n\nn > m:");
        showNumbers(n, m);
    }

    public static void showNumbers(int n, int m) {
        if (n == m) System.out.print(n + " ");

        if (n < m) {
            System.out.print(n + " ");
            showNumbers(n + 1, m);
        } else if (n > m){
            System.out.print(n + " ");
            showNumbers(n - 1, m);
        }
    }
}