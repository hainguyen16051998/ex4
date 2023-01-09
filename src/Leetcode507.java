public class Leetcode507 {
    public static void main(String[] args) {
        int num = 28;
        System.out.println(checkPerfectNumber(num));
    }

    private static boolean checkPerfectNumber(int num) {
        int tong = 1;
        if(num == 1 || num == 0){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0){
                tong += i + num / i;
            }
        }
        return tong == num;
    }
}
