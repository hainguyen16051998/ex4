public class Leetcode504 {
    public static void main(String[] args) {
        int num = -7;
        System.out.println(convertToBase7(num));
    }

    private static String convertToBase7(int num) {
        if (num == 0)
            return "0";
        String b="";
        String n = "";
        while (num < 0) {
            n = "-";
            num = -num;
        }
        while (num > 0) {
            int du = num % 7;
            b = String.valueOf(du).concat(b);
            num = num / 7;
        }

        return n + b;
    }
}
