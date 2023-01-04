public class Leetcode70 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int b1 = 1;
        int b2 = 2;
        int count = 0;
        for (int i = 3; i <= n; i++) {
            count = b2 + b1;
            b1 = b2;
            b2 = count;

        }
        return count;
    }
}
