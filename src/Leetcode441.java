public class Leetcode441 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));
    }

    private static int arrangeCoins(int n) {
        int count = 1;
        int temp = 0;
        while (n >= count) {
            n = n - count;
            count++;
            temp++;
        }
        return temp;
    }

//    private static int arrangeCoins(int n) {
//        int a = 0;
//        for (int i = 0; i <= n; i++) {
//            a = (2 * n - i * (i + 1)) / 2;
//            if (a <= i)
//                return i;
//        }
//        return a;
//    }
}
