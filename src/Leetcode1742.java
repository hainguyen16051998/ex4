import java.util.Arrays;
import java.util.HashSet;

public class Leetcode1742 {
    public static void main(String[] args) {
        int lowLimit = 5;
        int highLimit = 15;
        System.out.println(countBalls(lowLimit, highLimit));
    }

    private static int countBalls(int lowLimit, int highLimit) {
        int[] arr = new int[45];

        // duyệt tất cả bóng để xem từn bóng thuộc hộp nào
        for (int i = lowLimit; i <= highLimit; i++) {
            int a = i;
            int tong = 0;

            // kiểm tra bóng chọn hộp
            while (a > 0) {
                int du = a % 10;
                tong += du;
                a = a / 10;
            }
            arr[tong - 1]++;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    int a = arr[min];
                    arr[min] = arr[j];
                    arr[j] = a;
                }
            }
        }
        return arr[arr.length - 1];
    }
}
