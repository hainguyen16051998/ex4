public class Leetcode1518 {
    public static void main(String[] args) {
        int numBottles = 9;
        int numExchange = 3;
        System.out.println(numWaterBottles(numBottles, numExchange));
    }

    private static int numWaterBottles(int numBottles, int numExchange) {
        int tong = numBottles;
        while (numBottles >= numExchange) {
            int doi = numBottles / numExchange;
            tong += doi;
            numBottles = numBottles % numExchange + doi;
        }
        return tong;
    }
}
