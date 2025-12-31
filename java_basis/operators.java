public class operators {
    public static void main(String[] args) {
        int a = 11, b = 5;
        int sum = a + b; //same for -,*,/
        int remainder = a%b;
        System.out.println("Sum is " + sum + " remainder is " + remainder);
        int num1 = 6;
        int result = -num1; //-6
        System.out.println(result); //-6
        ++result; //-5
        System.out.println(result); //-5

        System.out.println(~num1);
    }
}