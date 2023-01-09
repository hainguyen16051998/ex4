public class Leetcode263 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(isUgly(n));
    }

    private static boolean isUgly(int n) {
        if (n < 0)
            return false;
        while (n % 2 == 0) {
            n = n / 2;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        while (n % 5 == 0) {
            n = n / 5;
        }
        return n == 1;
    }
}