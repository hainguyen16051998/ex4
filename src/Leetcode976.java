public class Leetcode976 {
    public static void main(String[] args) {
        int[] nums = {2, 1, 2};
        System.out.println(largestPerimeter(nums));
    }

    private static int largestPerimeter(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    int temp = nums[min];
                    nums[min] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i = nums.length - 3; i >= 0; i--) {
            if (nums[i] + nums[i + 1] > nums[i + 2]) {
                return nums[i] + nums[i + 1] + nums[i + 2];
            }
        }
        return 0;
    }
}
