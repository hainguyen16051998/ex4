public class Leetcode2427 {
    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        System.out.println(commonFactors(a, b));
    }

    private static int commonFactors(int a, int b) {
        while (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int dem = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0)
                dem++;
        }
        return dem;
    }

}
