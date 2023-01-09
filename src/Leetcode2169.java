public class Leetcode2169 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        System.out.println(countOperations(num1, num2));
    }

    private static int countOperations(int num1, int num2) {
        int dem = 0;
        if (num1 == 0 || num2 == 0)
            return 0;
        if (num1 == num2)
            return 1;
        while (true) {
            while (num1 > num2) {
                num1 = num1 - num2;
                dem++;
            }
            while (num1 < num2) {
                num2 = num2 - num1;
                dem++;
            }
            if (num1 == num2) {
                num1 = num2 = num1 - num2;
                dem++;
            }
            if (num1 == 0 || num2 == 0)
                break;
        }
        return dem;
    }
}
