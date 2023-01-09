public class Leetcode2413 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(smallestEvenMultiple(n));
    }

    private static int smallestEvenMultiple(int n) {
        if (n == 1 || n == 2) {
            return 2;
        }
        if (n % 2 == 0) {
            return n;
        }
        return 2 * n;
    }
}
