import java.util.Arrays;

public class Leetcode912 {

    public static int sortArray(int[] nums, int start, int end) {
        int i = (start - 1);
        for (int j = start; j < end; j++) {
            if (nums[j] <= nums[end]) {
                i++;

                int swap = nums[i];
                nums[i] = nums[j];
                nums[j] = swap;
            }
        }
        int swap1 = nums[i + 1];
        nums[i + 1] = nums[end];
        nums[end] = swap1;

        return i + 1;
    }

    public static void quickSort(int[] nums, int start, int end) {
        if (start < end) {
            int sortArray = sortArray(nums, start, end);
            sortArray(nums, start, sortArray - 1);
            sortArray(nums, sortArray + 1, end);
        }
    }

    public static void main(String[] args) {
        int nums[] = {5, 2, 3, 1, 4, 2, 5, 7};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}

//    public static int[] quickSort(int[] nums, int start, int end) {
//        int key;
//        if (start >= end)
//            return nums;
//        key = nums[(start + end) / 2];
//        int i = start;
//        int j = end;
//        while (i < j) {
//            while (nums[i] < key) i++;
//            while (nums[j] > key) j--;
//            if (i <= j) {
//                int count = nums[i];
//                nums[i] = nums[j];
//                nums[j] = count;
//                i++;
//                j--;
//            }
//            quickSort(nums, start, j);
//            quickSort(nums, i, end);
//        }
//        return nums;
//    }
//
