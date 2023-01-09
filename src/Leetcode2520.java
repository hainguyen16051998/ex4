public class Leetcode2520 {
    public static void main(String[] args) {
        int num = 1248;
        System.out.println(countDigits(num));
    }

    private static int countDigits(int num) {
        int dem = 0;
        int temp = num;
        while (num > 0) {
            int du = num % 10;
            num = num / 10;
            if (temp % du == 0)
                dem++;
        }
        return dem;
    }
}
