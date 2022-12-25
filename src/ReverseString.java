public class ReverseString {
    public static void swap(char[] s, int start, int end) {

        if (start >= end) {
            return;
        } else {
            char a = s[start];
            s[start] = s[end];
            s[end] = a;
            swap(s, start + 1, end - 1);
        }
    }

    public static void reverseString(char[] a) {
        swap(a, 0, a.length - 1);
    }
}
