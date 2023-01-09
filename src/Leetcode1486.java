public class Leetcode1486 {
    public static void main(String[] args) {
        int n = 5;
        int start = 0;
        System.out.println(xorOperation(n, start));
    }

    private static int xorOperation(int n, int start) {
        int[] a = new int[n];
        int tong = 0;
        int dem = 0;
        while (dem < n - 1) {
            a[0] = start;
            dem++;
            a[dem] = start + 2 * dem;
        }
        for (int i = 0; i <= a.length-1; i++) {
            tong ^= a[i];
        }
        return tong;
    }
}
