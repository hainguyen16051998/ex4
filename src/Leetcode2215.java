import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode2215 {
    public static void main(String[] args) {
        int num1[] = {1, 2, 3};
        int num2[] = {4, 5, 6};
        System.out.println(findDifference(num1, num2));
    }

    public static List<List<Integer>> findDifference(int[] num1, int[] num2) {
        List<List<Integer>> array = new ArrayList<>();
        Set<Integer> array1 = new HashSet<>();
        Set<Integer> array2 = new HashSet<>();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int num : num1)
            array1.add(num);
        for (int num : num2)
            array2.add(num);
        for (int num : array1) {
            if (array2.contains(num)) {
                array2.remove(num);
            } else a.add(num);
        }
        for (int num : array2) {
            b.add(num);
        }
        array.add(a);
        array.add(b);
        return array;
    }
}
