public class Leetcode1 {
    public static void main(String[] args) {
        int a[] = {2, 7, 11, 15};
        int target = 9;
        sapxep(a, target);
    }

    private static void sapxep(int[] nums, int target) {
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    System.out.println(i);
                }

            }
        }
    }
}

