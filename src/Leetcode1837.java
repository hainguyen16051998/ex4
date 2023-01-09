public class Leetcode1837 {
    public static void main(String[] args) {
        int n = 34;
        int k = 6;
        System.out.println(sumBase(n, k));
    }

    private static int sumBase(int n, int k) {
        int tong = 0;
        while (n != 0) {
            tong += n % k;
            n = n / k;
        }
        return tong;
    }
}
