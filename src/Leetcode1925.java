import java.lang.Math;

public class Leetcode1925 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countTriples(n));
    }

    private static int countTriples(int n) {
        if (n == 0)
            return 0;
        int dem = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                double a = Math.sqrt(i * i - j * j);
                if (a - Math.floor(a) == 0)
                    dem++;
            }
        }
        return dem;
    }
}
