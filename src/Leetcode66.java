import java.util.Arrays;
import java.util.HashSet;

public class Leetcode66 {
    public static void main(String[] args) {
        int digits[] = {1, 9, 0, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                break;
            }
            if (digits[0] == 0) {
                int[] a = new int[digits.length + 1];
                a[0] = 1;
                return a;
            }
        }
        return digits;
    }

}
