public class Leetcode389 {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
    }

    private static char findTheDifference(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                continue;
            }
            if (s.charAt(i) != t.charAt(i)) {
                return s.charAt(i);
            }
        }

        return 0;
    }

}
