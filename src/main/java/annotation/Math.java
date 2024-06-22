package annotation;

public class Math {
    @Deprecated //(Không dùng nữa, lỗi thời)
    public static int maxVer1(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int maxVer2(int a, int b) {
        return a > b ? a : b;
    }
}
