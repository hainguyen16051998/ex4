import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode1979 {
    public static void main(String[] args) {
        int[] nums = {8, 7, 6, 5, 3};
        System.out.println(findGCD(nums));
    }

    private static int findGCD(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    int a = nums[min];
                    nums[min] = nums[j];
                    nums[j] = a;
                }
            }
        }
        int temp = 0;
        for (int i = 1; i <= nums[0]; i++) {
            if (nums[nums.length - 1] % i == 0 && nums[0] % i == 0) {
                temp = i;
            }
        }
        return temp;
    }
}