import java.sql.Array;
import java.util.Arrays;

public class Leetcode1103 {
    public static void main(String[] args) {
        int candies = 7;
        int num_people = 4;
        System.out.println(Arrays.toString(distributeCandies(candies, num_people)));
    }

    private static int[] distributeCandies(int candies, int num_people) {
        int[] arr = new int[num_people];
        int count = 1;
        while (candies > count) {
            arr[(count - 1) % num_people] += count;
            candies -= count;
            count++;
        }
        arr[(count - 1) % num_people] += candies;
        return arr;
    }
}
