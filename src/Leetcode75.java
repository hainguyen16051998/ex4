import java.util.Arrays;

public class Leetcode75 {
    public static void main(String[] args) {
        int nums[] = {2, 0, 2, 1, 1, 0};
        System.out.println(Arrays.toString(sortColors(nums)));

    }

    public static int[] selectionSort(int[] arr, int i, int j) {
        int indexMin;
        for (i = 0; i < arr.length - 1; i++) {
            indexMin = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                int temp = arr[indexMin];
                arr[indexMin] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static int[] sortColors(int[] nums) {
        return selectionSort(nums, 0, nums.length - 1);
    }
}
