import java.util.Arrays;

public class Leetcode492 {
    public static void main(String[] args) {
        int area = 10;
        System.out.println(Arrays.toString(constructRectangle(area)));
    }

    private static int[] constructRectangle(int area) {
        int[] a = new int[2];
        int temp = (int) Math.sqrt(area);
        while (area % temp != 0) {
            temp--;
        }
        int temp2 = area / temp;
        a[0] = temp2;
        a[1] = temp;
        return a;
    }
}
