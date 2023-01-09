public class Leetcode258 {
    public static void main(String[] args) {
        int num = 19;
        System.out.println(addDigits(num));
    }

    private static int addDigits(int num) {
        int du;
        int tong = 0;
        while (num > 0) {
            du = num % 10;
            num = num / 10;
            tong += du;
            if (num == 0 && tong >= 10) {
                return addDigits(tong);
            }
            if (num == 0 && tong < 10)
                break;
        }
        return tong;
    }
}
