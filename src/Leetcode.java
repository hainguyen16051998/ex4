import java.util.Arrays;

public class Leetcode {
    public static void main(String[] args) {
        int nums[] = {5, 2, 3, 1, 4, 7, 5, 4};
        System.out.println(Arrays.toString(mergeArray(nums)));
    }

    public static int[] sort(int[] nums, int start, int end) {
        if (start >= end) {
            return nums;
        }
        int nums3[] = new int[0];
        while (start < end) {
            int mid = (start + end) / 2;
            sort(nums, start, mid);
            sort(nums, mid + 1, end);
            int i = start;
            int j = mid + 1;
            int u = start;

            while (i < mid && j < end) {
                while (nums[i] > nums[j]) {
                    nums3[u] = nums[j];
                    j++;
                    u++;
                }
                while (nums[i] <= nums[j]) {
                    nums3[u] = nums[i];
                    i++;
                    u++;
                }
                while (i <= mid) {
                    nums3[u] = nums[i];
                    i++;
                    u++;
                }
                while (j <= end) {
                    nums3[u] = nums[j];
                    j++;
                    u++;
                }
            }

        }
        return nums3;
    }

    public static int[] mergeArray(int[] nums) {
        return sort(nums, 0, nums.length - 1);
    }
}
