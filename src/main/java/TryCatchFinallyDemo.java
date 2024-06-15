public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        // try catch
        // try finally
        // try catch finally

        try {
            // ArithmeticException: Lỗi quy ước số học
            int a = 0;
            int b = 1;
            System.out.println("a");
            System.out.println(a / b);
            // Những dòng ở dưới ngoại lệ sẽ không được chạy
            System.out.println("d");

            // NullPointerException
            String s = null;
            System.out.println(s.length());

            // ArrayIndexOutOfBoundsException
            int[] array = {1, 2, 3};
            System.out.println(array[100]);

            // Exception
            throw new Exception("Lỗi không xác định");
        } catch (ArithmeticException exception) {
            System.out.println("Không thể chia cho 0");
            System.out.println("b");
        } catch (NullPointerException | ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
            // Bắt tất cả ngoại lệ
        } catch (
                Exception exception) {
            System.out.println("Đã có lỗi, vui lòng thử lại sau");
            System.out.println("c");
        }finally {
            System.out.println("Khối finally luôn được gọi dù có ngoại lệ hay không");
        }
    }
}
