import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Leetcode202 {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> temp = new HashSet<>();
        while (n != 1) {
            int a = 0;
            while (n > 0) {
                a += (n % 10) * (n % 10);
                n = n / 10;
            }
            if (temp.contains(a))
                return false;
            temp.add(a);
            n = a;
        }
        return true;
    }
}
