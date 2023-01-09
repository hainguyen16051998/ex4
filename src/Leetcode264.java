public class Leetcode264 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(nthUglyNumber(n));
    }

    public static int nthUglyNumber(int n) {
        int[] nums = new int[1690];
        int temp;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        nums[0] = 1;
        for (int i = 1; i < 1690; i++) {
            nums[i] = Math.min(nums[i2] * 2, Math.min(nums[i3] * 3, nums[i5] * 5));
            temp = nums[i];
            if (temp == nums[i2] * 2) i2++;
            if (temp == nums[i3] * 3) i3++;
            if (temp == nums[i5] * 5) i5++;
        }
        return nums[n - 1];
    }

}
