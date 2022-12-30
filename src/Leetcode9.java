import java.util.Scanner;

public class Leetcode9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        isPalindrome(x);
    }

    private static boolean isPalindrome(int x) {
        int a = x;
        int count = 0;
        while (x > 0) {
            int du = x % 10;
            x = x / 10;
            count = count * 10 + du;
        }
        if (count == a) {
            return true;
        } else {
            return false;
        }
    }
}
