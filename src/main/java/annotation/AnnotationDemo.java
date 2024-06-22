package annotation;

public class AnnotationDemo {
    public static void main(String[] args) {
        // Cú pháp: @ + tên

        // @Override
        AnnotationDemo demo = new AnnotationDemo();
        System.out.println("demo = " + demo);

        // @Deprecated
        int max = Math.maxVer1(1, 0);
        System.out.println("max = " + max);

        // @SuppressWarning
        @SuppressWarnings("deprecation")
        int m = Math.maxVer1(10, 0);
        System.out.println("m = " + m);
    }

    @Override
    public String toString() {
        return "This is Annotation class";
    }
}
