import java.util.Arrays;
import java.util.Scanner;

public class Warehouse {

    final static int MAX_CAPACITY = 10;
    static Scanner sc = new Scanner(System.in);

    public void sorting(int[] values) {
        Arrays.sort(values);
        // return values;
    }

    void search(int[] values, int key) {
        int index = Arrays.binarySearch(values, key);
        if (index >= 0) {
            System.out.println("The price " + key + " is found at index " + index);
        } else {
            int insertionPoint = -index - 1;
            System.out.println("Price " + key + " not found and can be inserted at index " + insertionPoint);
        }
    }

    void highValueFilter(int[] priceList, int highValue) {
        System.out.println("Filtering items whose price is more than " + highValue);
        for (int i = 0; i < priceList.length; i++) {
            if (priceList[i] > highValue) {
                System.out.println(priceList[i]);
            }
        }
    }

    public static void main(String[] args) {
        Warehouse works = new Warehouse();
        System.out.println("Welcome to Data Warehouse");
        System.out.println("The Maximum capacity of WareHouse is: " + MAX_CAPACITY);
        // MAX_CAPACITY = 15; //error (final field can't reassign)
        int[] prices = { 150, 20, 85, 300, 10, 50, 90 };
        works.sorting(prices);
        System.out.println("Sorted prices in a Warehouse: " + Arrays.toString(prices));

        System.out.println("Enter price to find in price list:");
        int findValue = sc.nextInt();
        works.search(prices, findValue);

        System.out.println("Enter Value for High value filtering");
        int highValue = sc.nextInt();
        works.highValueFilter(prices, highValue);

    }
}
