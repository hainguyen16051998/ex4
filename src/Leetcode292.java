public class Leetcode292 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(canWinNim(n));
    }

    private static boolean canWinNim(int n) {
        if (n <= 0)
            return false;
        if (n % 4 == 0)
            return false;
        return true;
    }
}
