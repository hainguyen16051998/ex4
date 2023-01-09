public class Leetcode171 {
    public static void main(String[] args) {
        String columnTitle = "ZY";
        System.out.println(titleToNumber(columnTitle));
    }

    private static int titleToNumber(String columnTitle) {
        int temp = 0;
        for (char a : columnTitle.toCharArray()) {
            int b = a - 'A' + 1;
            temp = temp * 26 + b;
        }
        return temp;
    }
}
