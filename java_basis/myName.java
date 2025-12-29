//! {} & Ident (Block)
/*
public class intro {
    public static void main(String[] args) {
        {System.out.println("Inside Block-1");
    } System.out.println("Outside Block");
    }
}
*/
//! command-line arg
/*
public class myName {
    public void main (String args[]){
        System.out.println("My name is: ");
        // System.out.println(args[0]);
        // System.out.println(args[1]);
    }
}
    */
 //* output
 /*
PS D:\All Code\Java> javac myName.java       
PS D:\All Code\Java> java myName      
My name is: 
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at myName.main(myName.java:14)
PS D:\All Code\Java> java myName Brock Lesnar
My name is: 
Brock
Lesnar
 */

//! identifier
/*
class Student {
    int roll;
    // string roll; //error
    void names() {
        
    }
    void rolls() {

    }
    // void names(){

    // } //error
}
void names(){
    
}
*/
class student {
    String name_$ = "abc";
    // String 9name = "hi"; //error
    int _$roll = 10; //allowed but try to avoid
    int _$Roll = 11;
}