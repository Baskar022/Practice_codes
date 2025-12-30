
//! static var-class level scope

class Test {
    static int marks = 9;
}


public class varb {
    int a=100;
    public static void main(String[] args) {
        System.out.println("Got marks using static var: "+Test.marks);
        
        for (int a=10;a<20;a++) {
            // int a = 5; //error
        };
        int a = 10;
        // class roll {
        //     int a; //no error
        // }
        
        // System.out.println(a); //CT error
    }
    // public void display() {
    //         int a; //no error
    //     }
}
