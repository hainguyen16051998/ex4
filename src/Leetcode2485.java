public class Leetcode2485 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(pivotInteger(n));
    }

    private static int pivotInteger(int n) {
        int a = -1;
        if (n == 1)
            return 1;
        for (int i = 0; i <= n; i++) {
            int l = n * (n + 1) / 2 - i * (i + 1) / 2 + i;
            if (i * (i + 1) / 2 == l)
                return i;
        }
        return a;
    }
}
