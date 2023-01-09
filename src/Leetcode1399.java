public class Leetcode1399 {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(countLargestGroup(n));
    }

    private static int countLargestGroup(int n) {
        int[] arr = new int[36];
        for (int i = 1; i <= n; i++) {
            int a = i;
            int tong = 0;
            while (a > 0) {
                tong += a % 10;
                a = a / 10;
            }
            arr[tong - 1]++;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    int temp = arr[max];
                    arr[max] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int dem = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == arr[0])
                dem++;
        }
        return dem + 1;
    }
}

