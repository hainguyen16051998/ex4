public class Leetcode136 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {
        for (int i = 0; i <= nums.length; i++) {
            for (int j = 0; j <= nums.length; j++) {
                if (nums[i] != nums[j]){
                    break;
                }
            }
        }
        return 0;
    }
}
