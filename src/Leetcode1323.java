import javax.sql.rowset.serial.SerialArray;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode1323 {
    public static void main(String[] args) {
        int num = 9669;
        System.out.println(maximum69Number(num));
    }

    private static int maximum69Number(int num) {
        int dem = 0;
        int temp = num;
        while (num > 0) {
            num = num / 10;
        }

        return num;
    }
}
