public class Leetcode1716 {
    public static void main(String[] args) {
        int n = 26;
        System.out.println(totalMoney(n));
    }

    private static int totalMoney(int n) {
        int tong = 28;
        int tien = 0;
        int a = n / 7;
        for (int i = 1; i <= a; i++) {
            if (i == 1) {
                tien = tong;
            } else {
                tien += tong + 7 * (i - 1);
            }
        }
        int b = n % 7;
        tien += a * b + b * (b + 1) / 2;
        return tien;
    }

    private static int totalMoney2(int n) {
        int a = 0;
        for (int i = 0; i < n; i++) {
            a += (i / 7) + 1 + (i % 7);
        }
        return a;
    }
}
