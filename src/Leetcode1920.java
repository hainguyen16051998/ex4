import java.util.Arrays;

public class Leetcode1920 {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    private static int[] buildArray(int[] nums) {
        int[] nums1 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums1[i] = nums[nums[i]];
        }
        return nums1;
    }
}
