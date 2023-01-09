public class Leetcode58 {
    public static void main(String[] args) {
        String s = "Hello ab World ";
        System.out.println(lengthOfLastWord(s));
    }


    public static int lengthOfLastWord(String s) {
        int dem = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && dem == 0)
                continue;
            if (s.charAt(i) == ' ' && dem > 0)
                break;
            if (s.charAt(i) != ' ')
                dem++;
        }
        return dem;
    }
}
