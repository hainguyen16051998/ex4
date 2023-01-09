public class Leetcode1281 {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }

    private static int subtractProductAndSum(int n) {
        int tong = 0;
        int tich = 1;
        while (n > 0) {
            int du = n % 10;
            tong += du;
            tich *= du;
            n = n / 10;
        }
        return tich - tong;
    }
}
