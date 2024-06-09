// Ep kieu
public class DataTypeCastingDemo {
    public static void main(String[] args) {
        //Widening: mo rong: gan nho cho lon
        // chi dung cho so
        // byte -> short -> int -> long -> float -> double
        byte a = 10;
        // int b = (int) a; chuyen tu nho sang lon thi kh can ghi (int) cung duoc
        int b = a;
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        //Narrowing: thu hep
        // double -> float -> long -> int -> short -> byte
        long m = 8000000000L;
        int n = (int) m;
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        // byte -128 -> 127
        // khi vuot qua gioi han byte la 127 no se quay vong lai -128
        short u = 128;
        byte v = (byte) u;
        System.out.println("u = " + u);
        System.out.println("v = " + v);

        // Chu y
        int x = 1;
        int y = 2;
        System.out.println("x/y = " + (float) x / y);
        System.out.println("x/y = " + x / (float) y);
        System.out.println("x/y = " + (float) x / (float) y);
        // Sai
        System.out.println("x/y = " + (float) (x / y));



    }
}
