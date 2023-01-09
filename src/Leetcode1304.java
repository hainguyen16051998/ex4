import java.util.Arrays;
import java.util.Random;

public class Leetcode1304 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
    }

    private static int[] sumZero(int n) {
        int[] a = new int[n];
        int start = 0;
        int end = n - 1;
        int mid = n / 2;
        while (start <= end) {
            a[start] = -mid;
            a[end] = mid;
            start++;
            end--;
            mid--;
        }
        return a;
    }
}
