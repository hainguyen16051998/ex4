import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leetcode888 {
    public static void main(String[] args) {
        int[] aliceSizes = {1, 1};
        int[] bobSizes = {2, 2};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }

    private static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;
        int[] temp = new int[2];
        Set<Integer> setB = new HashSet<>();
        for (int a : aliceSizes) {
            sumA += a;
        }
        for (int b : bobSizes) {
            setB.add(b);
            sumB += b;
        }
        int mid = (sumB - sumA) / 2;
        for (int a : aliceSizes) {
            if (setB.contains(a + mid)) {
                temp[0] = a;
                temp[1] = a + mid;
            }
        }
        return temp;
    }
}
