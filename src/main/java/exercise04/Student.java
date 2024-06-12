package exercise04;

public class Student {
    private String id;
    private String name;
    private String hometown;
    private double grade;

    // Constructor
    public Student(String id, String name, String hometown) {
        this.id = id;
        this.name = name;
        this.hometown = hometown;
        this.grade = 0.0;
    }

    // Method để set điểm
    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Method để cộng thêm điểm
    public void addGrade(double grade) {
        this.grade += grade;
    }

    // Method để in ra thông tin của sinh viên
    public void printStudentInfo() {
        String gradeDescription;
        if (this.grade < 4.0) {
            gradeDescription = "Yếu";
        } else if (this.grade < 6.0) {
            gradeDescription = "Trung bình";
        } else if (this.grade < 8.0) {
            gradeDescription = "Khá";
        } else {
            gradeDescription = "Giỏi";
        }
        System.out.printf("|------------|----------------------|------------|------------|--------------|\n");
        System.out.printf("| %-10s | %-20s | %-10s | %-10s | %-12s |\n", "ID", "Name", "Hometown", "Grade", "Description");
        System.out.printf("| %-10s | %-20s | %-10s | %-10.2f | %-12s |\n", this.id, this.name, this.hometown, this.grade, gradeDescription);
        System.out.printf("|------------|----------------------|------------|------------|--------------|\n");
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public double getGrade() {
        return grade;
    }
}

