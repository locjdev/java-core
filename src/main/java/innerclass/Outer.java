package innerclass;

public class Outer {
    private int value;
    private static int count =3;

    public Outer(int value) {
        this.value = value;
    }

    // Inner class có các tính chất của class
    // Truy cập được thuộc tính private của class này
    // Mục đính đóng gói và che giấu dữ liệu
    public class Inner {
        public void showInfor() {
            System.out.println(value);
            System.out.println(count);
        }
    }

    // vì là static nên k gọi biến value (K phải static) được
    public static class Nested{
        public void showInfor() {
//            System.out.println(value);
            System.out.println(count);
        }
    }
}
