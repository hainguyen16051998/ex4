public class Leetcode1025 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(divisorGame(n));
    }

    private static boolean divisorGame(int n) {
        if (n == 1)
            return false;
        if (n % 2 == 0)
            return true;
            return false;
    }
}
