public class Leetcode1342 {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }

    private static int numberOfSteps(int num) {
        int dem = 0;
        while (num > 0) {
            while (num % 2 == 0) {
                num = num / 2;
                dem++;
            }
            while (num % 2 != 0) {
                num = num - 1;
                dem++;
            }
        }
        return dem;
    }
}
