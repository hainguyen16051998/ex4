import java.util.Scanner;

public class Leetcode704 {
    public static void main(String[] args) {
        int nums[] = {-1, 0, 3, 5, 9, 12};
        int target = 3;
        System.out.println(search(nums, target));
    }

    private static int search(int[] nums, int target) {
        for (int i = 0; i <= nums.length; i++) {
            if (target == nums[i]) {
                return i;
            } else
                return -1;
        }
        return -1;
    }
}
