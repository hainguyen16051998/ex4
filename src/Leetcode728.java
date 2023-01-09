import java.util.ArrayList;
import java.util.List;

public class Leetcode728 {
    public static void main(String[] args) {
        int left = 99;
        int right = 101;
        System.out.println(selfDividingNumbers(left, right));
    }

    private static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> temp = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i % 10 == 0)
                continue;
            int a = i;
            while (a > 0) {
                int du = a % 10;
                a = a / 10;
                if (du == 0 || i % du != 0) {
                    break;
                }
                if (i % du == 0 && a == 0) {
                    temp.add(i);
                }
            }
        }
        return temp;
    }
}
