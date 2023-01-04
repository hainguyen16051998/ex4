import java.util.Arrays;

public class Leetcode912 {
    public static void main(String[] args) {
        int nums[] = {5, 2, 3, 1, 4, 2, 5, 7};
        System.out.println(Arrays.toString(sortArray(nums)));
    }

    public static int[] quickSort(int[] nums, int start, int end) {
        int key;
        if (start >= end)
            return nums;
        key = nums[(start + end) / 2];
        int i = start;
        int j = end;
        while (i < j) {
            while (nums[i] < key) i++;
            while (nums[j] > key) j--;
            if (i <= j) {
                int count = nums[i];
                nums[i] = nums[j];
                nums[j] = count;
                i++;
                j--;
            }
            quickSort(nums, start, j);
            quickSort(nums, i, end);
        }
        return nums;
    }

    public static int[] sortArray(int[] nums) {
        return quickSort(nums, 0, nums.length - 1);
    }
}
