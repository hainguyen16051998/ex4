public class Leetcode69 {
    public static void main(String[] args) {
        int x = 90;
        System.out.println(mySqrt(x));
    }

    private static int mySqrt(int x) {
        int start = 0;
        int end = 10000;
        if (x == 1)
            return 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int binhphuong = mid * mid;
            if (binhphuong == x)
                return mid;
            if (binhphuong > x)
                end = mid - 1;
            if (binhphuong < x)
                start = mid + 1;
        }
        return end;
    }
}
