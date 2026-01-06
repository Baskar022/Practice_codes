
// Java program to demonstrate that
// the static method does not have
// access to the instance variable
import java.io.*;

public class Method {

    // static variable
    static int a = 40;

    // instance variable
    int b = 50;

    void simpleDisplay() {
        System.out.println(a);
        System.out.println(b);
    }

    // Declaration of a static method
    static void staticDisplay() {
        System.out.println(a);
    }

    void inst() {
        System.out.println(b);
        System.out.println("Instance Method-1");
    }

    void inst2 () {
        System.out.println("Instance Mthd-2");
        inst();
    }

    // main method
    public static void main(String[] args) {
        Method obj = new Method();
        obj.simpleDisplay();

        // Calling static method
        staticDisplay();
        // System.out.println(b); // err
        System.out.println(obj.b); // 50
        obj.inst(); // 50 and Inst mthd-1
        // obj.inst2(); // Inst mthd-2 and call inst (50 and inst mtd-1)
    }
}