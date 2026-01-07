class this2 {
    int a;
    int b;

    // Default constructor
    this2()
    {
        //this(10, 20);
        System.out.println(
            "Inside  default constructor \n" );
            // display(); //err
      this(10, 20);
      display();
    }
    
    void display (){
        System.out.println("In display()");
        
    }
    // Parameterized constructor
    this2(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println(
            "Inside parameterized constructor");
    }

    public static void main(String[] args)
    {
        this2 object = new this2();
    }
}
