public class ex {
    public static void main(String[] args) {
        int[] a = {1, 4, 6, 7, 8, 9, 12, 15, 17};
        int b = 12;
        System.out.println(TKNP(a, b));
    }

    public static int TKNP(int a[], int target) {
        int start = 0;
        int end = a.length - 1;
            while (start <= end) {
                int m = (start + end) / 2;
                if (a[m] == target) {
                    return m;
                }
                if (a[m] > target) {
                    end = m - 1;
                }
                if (a[m] < target) {
                    start = m + 1;
                }
            }
        return -1;
    }


}
