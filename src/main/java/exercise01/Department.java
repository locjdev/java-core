package exercise01;

public class Department {
    private int id;
    private String nameDepartment;

    // Constructor không có parameters
    public Department() {
        this.id = 0;
        this.nameDepartment = "Default Department";
    }

    // Constructor có 1 parameter là nameDepartment
    public Department(String nameDepartment) {
        this.id = 0;
        this.nameDepartment = nameDepartment;
    }

}
