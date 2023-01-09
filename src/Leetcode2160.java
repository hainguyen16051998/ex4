import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode2160 {
    public static void main(String[] args) {
        int num = 2932;
        System.out.println(minimumSum(num));
    }

    private static int minimumSum(int num) {
        int[] a = new int[4];
        int dem = -1;
        while (num > 0) {
            dem++;
            int soDu = num % 10;
            a[dem] = soDu;
            num = num / 10;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        return a[0] * 10 + a[1] * 10 + a[2] + a[3];
    }
}

