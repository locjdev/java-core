public class OperatorsDemo {
    public static void main(String[] args) {
        // Toán tử số học
        // +, -, *, /, %
        // int   +-*/ int ----> int
        // float +-*/   ----> float
        System.out.println(99 + 2);
        System.out.println(99 - 2);
        System.out.println(99 * 2);
        // Chia lấy phần nguyên
        System.out.println(99 / 2);
        // Chia lấy phần dư
        System.out.println(99 % 2);

        // +=. -=, *=, /=, %=
        int a = 100;
        a += 10; // a = a + 10
        System.out.println("a = " + a);

        // ++, --
        int b = 1000;
        b++; // b += 1
        System.out.println("b = " + b);

        // Chú ý
        // b++ => tăng giá trị sau
        // ++b => tăng giá trị trước

        int c = b++;
        // int c = b
        // b = b + 1

        int d = ++b;
        // b = b + 1;
        // int d = b;

        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // Toán tử quan hệ
        // ==, >, <, >=, <=, !=

        // Toán tử logic
        // AND: &&
        // OR: ||
        // NOT: !
        boolean ok = b > 5 && b < 10;
        boolean notTrue = !true;

    }
}
