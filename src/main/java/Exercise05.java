import java.util.Arrays;

public class Exercise05 {
    void question6(){
        System.out.println("question-06");
        String[] phongBan = {"Accounting", "Boss of director", "Marketing", "Sale", "Waiting room"};

        // Sắp xếp mảng theo thứ tự tăng dần
        Arrays.sort(phongBan);

        // In ra danh sách phòng ban
        for (String pb : phongBan) {
            System.out.println(pb);
        }
    }
}
