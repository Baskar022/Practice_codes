public class operators {
    public static void main(String[] args) {
        /*
        int a = 11, b = 5;
        int sum = a + b; //same for -,*,/
        int remainder = a%b;
        System.out.println("Sum is " + sum + " remainder is " + remainder);
        int num1 = 6;
        int result = -num1; //-6
        System.out.println(result); //-6
        ++result; //-5
        System.out.println(result); //-5

        System.out.println(~num1);//bitewise complement
        */
       int n1 = 10;
       double n2 = 5.7;
       n1 += n2; // no error, 15
    //    n2 += n1; // no error, 20.7
        n2 = n2 + 10; // no er, 15.7
        // n1 = n1 + 5.5; //RT er
        n1 = (int) (n1 + 5.5); // no err, 20
       System.out.println(n1 + " and " + n2);
       String s1 = "10";
    //    boolean result = n1!=s1; // err
    boolean result = n1!=n2; 
       System.out.println(result);
    //    System.out.println(n1 && n2); //err, type is int, double not boolean or condition
    double n3 = 7.9;
        System.out.println(n3 instanceof double);
        System.out.println(n2 instanceof int);
    }
}