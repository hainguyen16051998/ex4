public class Leetcode268 {
    public static void main(String[] args) {
        int nums[] = {9, 7, 4, 5, 6, 8, 3, 1, 0};
        System.out.println(missingNumber1(nums));
    }

    public static int missingNumber1(int[] nums) {
        int count = nums.length;
        int a = count * (count+1)/2;
        int b = 0;
        for(int i = 0; i < nums.length; i++){
            b += nums[i];

        }
        return a-b;
    }

//    public static void sort(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[i]) {
//                    i = j;
//                }
//            }
//            int count = arr[i];
//            arr[i] = arr[i];
//            arr[i] = count;
//        }
//    }
//
//    public static int missingNumber2(int[] nums) {
//        sort(nums);
//        int a = 0;
//        for (int i = 0; i <= nums.length; i++) {
//            if (nums[i + 1] - nums[i] == 1) {
//                break;
//            } else
//                a = (nums[i + 1] + nums[i]) / 2;
//
//        }
//        return a;
//    }

}
