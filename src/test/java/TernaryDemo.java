public class TernaryDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int max = (a > b) ? a : b;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
        System.out.println("max = " + max);
    }
}
