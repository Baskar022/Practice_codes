// import java.util.Arrays;
public class Shopping {
    public static void main(String[] args) {
        // String name[10]; //err
        /*
         * String name[] = new String[10];
         * int roll[];
         * roll = new int[10];
         */
        int[] prices = { 10, 50, 20, 80, 40 };
        System.out.println("Prices greater than 30 are: ");
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > 30) {
                System.out.println(prices[i]);
            }
        }
    }
}
