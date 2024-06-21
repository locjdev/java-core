package fileDemo;

import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        // Đường dẫn tuyệt đối
//        String path1 = "C:/Users/DELL/Desktop/VTI/demoFileIO/abc.txt";
//        FileManager.createNewFile(path1);

        // Đường dẫn tương đối
        String path = "src/main/resources";

        System.out.println(FileManager.exists(path));
        System.out.println(FileManager.isFile(path));
        System.out.println(FileManager.isDirectory(path));

        FileManager.createNewFile(path + "/abc.txt");
        FileManager.mkdirs(path + "/database");
        String[] names = FileManager.list(path);
        for (String name : names) {
            System.out.println(" - " + name);
        }

        // Đổi tên và đưa abc.txt vào thư mục database
        FileManager.moveTo(
                path + "/abc.txt",
                path + "/database/lesson.sql"
        );

        // Hàm delete chỉ xóa được file và thư mục rỗng
        FileManager.delete(path + "/database/lesson.sql");
        FileManager.delete(path + "/database");
        FileManager.delete(path + "/abc.txt");
    }
}
