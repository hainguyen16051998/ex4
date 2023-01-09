public class Leetcode1688 {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(numberOfMatches(n));
    }

    private static int numberOfMatches(int n) {
        int dem = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
                dem += n;
            }
            if (n % 2 != 0) {
                n = (n - 1) / 2;
                dem += n;
                n = n + 1;
            }
        }
        return dem;
    }
}
