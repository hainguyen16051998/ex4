public class Leetcode2180 {
    public static void main(String[] args) {
        int num = 30;
        System.out.println(countEven(num));
    }

    private static int countEven(int num) {
        if (num == 0)
            return 0;
        int dem = 0;
        for (int i = 1; i <= num; i++) {
            int a = i;
            int temp = 0;
            while (a > 0) {
                int du = a % 10;
                temp += du;
                a = a / 10;
            }

            if (temp % 2 == 0) {
                dem++;
            }
        }
        return dem;
    }
}
