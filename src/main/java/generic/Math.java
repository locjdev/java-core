package generic;

public class Math {
    // Dùng Comparable để có thể so sánh được
    public static <T extends Number & Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) >= 0 ? a : b;
    }
}
