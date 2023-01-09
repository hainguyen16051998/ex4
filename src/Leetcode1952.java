public class Leetcode1952 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isThree(n));
    }

    private static boolean isThree(int n) {
        int dem = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                dem++;
        }
        if (dem == 3)
            return true;
        return false;
    }
}
