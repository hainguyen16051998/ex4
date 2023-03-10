public class Leetcode13 {
    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
        ;
    }

    public static int dich(char a) {
        switch (a) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }


    public static int romanToInt(String s) {
        int sum = 0;
        int temp = dich(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            int next = dich(s.charAt(i));
            if (temp < next)
                sum -= temp;
            else
                sum += temp;
            temp = next;
        }
        sum += temp;
        return sum;
    }
}
