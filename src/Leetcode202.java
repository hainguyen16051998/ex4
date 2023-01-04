public class Leetcode202 {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    private static boolean isHappy(int n) {
        int a = 0;
        while (n != 0) {
            int temp = n % 10;
            a += temp * temp;
            n = n / 10;
        }
        n = a;
        return n == 1;
    }
}
