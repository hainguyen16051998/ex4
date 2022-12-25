import java.util.Scanner;

public class PowerofTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n < 1)
            return false;
        if (n == 1)
            return true;
        if (n % 2 == 1)
            return false;
        return isPowerOfTwo(n/2);
    }
}
