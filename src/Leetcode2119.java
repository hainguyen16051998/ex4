public class Leetcode2119 {
    public static void main(String[] args) {
        int num = 526;
        System.out.println(isSameAfterReversals(num));
    }

    private static boolean isSameAfterReversals(int num) {
        int a = num;
        if (num == 0)
            return true;
        if (num % 10 == 0)
            return false;
        int temp = 0;
        while (num > 0) {
            int du = num % 10;
            temp = temp * 10 + du;
            num = num / 10;
        }
        int temp2 = 0;
        while (temp > 0) {
            int du = temp % 10;
            temp2 = temp2 * 10 + du;
            temp = temp / 10;
        }
        if (temp2 == a)
            return true;
        return false;
    }
}
