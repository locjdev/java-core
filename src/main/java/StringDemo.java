public class StringDemo {
    public static void main(String[] args) {
        // String dạng Primitive
        String s1 = "Java Core";
        String s2 = "Java Core";

        // String dạng Non-Primitive
        String s3 = new String("Java Core");
        String s4 = new String("Java Core");

        // So sanh == va equals
        System.out.println(s1 == s2);  // True vì s1 va s2 co cung dia chi
        System.out.println(s2 == s3);  // False vi s2 va s3 khac dia chi
        System.out.println(s3 == s4);  // False vi s3 va s4 khac dia chi

        System.out.println(s1.equals(s2)); // True
        System.out.println(s2.equals(s3)); // True
        System.out.println(s3.equals(s4)); // True
    }
}
