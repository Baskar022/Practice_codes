import java.math.RoundingMode;
import java.math.BigDecimal;

public class dt {
    public static void main(String[] args) {
        //! PDT
        //* boolean
        /* 
        boolean isFun = true;
        boolean willGUp = false;
        System.out.println("Is is fun to learn JAVA? " + isFun);
        System.out.println("Will you give up? "+ willGUp);
         */
        //* byte
        /*
        byte roll = 28;
        byte backlog = -128;
        System.out.println("Roll no: "+ roll + " have backlog of: "+ backlog); */

        //* short (same for int)
        /*
        short ballFaced = 15200;
        short runs = 32690;
        System.out.println(runs + " runs scored in "+ballFaced + " balls"); */

        //*long
        /*
        long balance = 85697845458585L; //error without L
        long price = (long) 2589; 
        // long outOfBound = (long) 85958748565485; //error, too large
        System.out.println("Have balance of "+ balance);
        System.out.println("price is "+ price); */

        //*float & double
        /*
        float PI = 3.14845648f;
        double gravity = 9.8123456485478d; // with or without d will be same
        System.out.println("pi is "+ PI + " and g is "+ gravity); */

        //* Round off 
        /*
        double a = 0.8;
        double b = 0.6;
        double x = a + 0.1;
        double y = b - 0.1;
        System.out.println("x is " + x); //0.9
        System.out.println("y is "+ y); //0.5
        System.out.println(x==y); //false */

        /* 
        float a = 0.8f;
        float b = 0.6f;
        float x = Math.round(a - 0.1f);
        float y = Math.round(b + 0.1f);
        System.out.println("x is " + x); //0.7000000000000001 and for float it's 0.7 and MR 1.0
        System.out.println("y is " + y); //0.7 and for float it's 0.70000005 MP 1.0
        System.out.println(x==y); //false MR true */

        //!Big Decimal
        /*
        BigDecimal sal1 = new BigDecimal (1.0);
        BigDecimal sal2 = new BigDecimal("0.10");
        BigDecimal x = sal2.multiply(new BigDecimal("9.0"));
        sal1 = sal1.subtract(x);
        //rounding 3 deci. places
        sal1 = sal1.setScale(3, RoundingMode.HALF_UP);
        System.out.println("salary-1 is " + sal1);
        System.out.println(Math.round(2.456));
        char sym = '&';
        char letter = 'B';
        System.out.println("sym is " + sym + " letter is " + letter);
        */
       //! string
        // String str = 'hi'; //not valid, "" required
        String str1 = "Hello";
        str1 = "Welcome";
        System.out.println(str1); //Welcome
        
    }
}
