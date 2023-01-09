import java.util.Arrays;

public class Leetcode1 {
    public static void main(String[] args) {
        int a[] = {2, 7, 11, 15};
        int target = 18;
        System.out.println(Arrays.toString(twoSum(a, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        int a[] = new int[2];
        for (int i = 0; i <= nums.length-1; i++) {
            for (int j = i + 1; j <= nums.length-1; j++) {
                if (target == nums[i] + nums[j]) {
                    return a = new int[]{i, j};
                }
            }
        }
        return a;
    }
}

