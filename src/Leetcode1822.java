public class Leetcode1822 {
    public static void main(String[] args) {
        int[] nums = {-1, 1, -1, 1, -1};
        System.out.println(arraySign(nums));
    }

    private static int arraySign(int[] nums) {
        int dem = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == 0)
                return 0;
            if (nums[i] < 0) {
                dem++;
            }
        }
        if (dem % 2 == 0)
            return 1;
        return -1;
    }
}
