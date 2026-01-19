public class StringMemory {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println("s1 == s2? " + (s1==s2)); //true
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println("s1 == s3? " + (s1 == s3)); //false
        System.out.println("s1 == s4? " + (s1 == s4)); //false
        System.out.println("s3 == s4? " + (s3 == s4));//false
        String heapToPool = s3.intern();
        System.out.println("s1 == heapToPool? " + (s1 == heapToPool));
    }
}