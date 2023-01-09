public class Leetcode2455 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 10, 12, 15};
        System.out.println(averageValue(nums));
    }

    private static int averageValue(int[] nums) {
        int tong = 0;
        int dem = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && nums[i] % 3 == 0) {
                tong += nums[i];
                dem++;
            }
        }
        if (dem == 0)
            return 0;
        return tong / dem;
    }
}
