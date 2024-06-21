package fileDemo;

import java.io.File;
import java.io.IOException;

public class FileManager {
    public static boolean createNewFile(String path) throws IOException {
        File file = new File(path);
        return file.createNewFile();
    }

    public static boolean exists(String path) {
        File file = new File(path);
        return file.exists();
    }

    public static boolean isFile(String path) {
        return new File(path).isFile();
    }

    public static boolean isDirectory(String path) {
        return new File(path).isDirectory();
    }

    //Liệt kê tên file, thư mục bên trong đường dẫn
    public static String[] list(String path) {
        return new File(path).list();
    }

    public static boolean delete(String path) {
        return new File(path).delete();
    }

    public static boolean mkdirs(String path) {
        return new File(path).mkdirs();
    }

    public static boolean moveTo(String source, String destination) {
        File from = new File(source);
        File to = new File(destination);
        // Phương thức rename, tuy nhiên, nếu destination đã tồn tại, sẽ tương tự như hàm move
        return from.renameTo(to);
    }
}
