public class Leetcode367 {
    public static void main(String[] args) {
        int num = 17;
        System.out.println(isPerfectSquare(num));
    }

    private static boolean isPerfectSquare(int num) {
        int a = (int) Math.sqrt(num);
        int b = a * a;
        if (b == num)
            return true;
        return false;
    }
}
