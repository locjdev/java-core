package exercise06.question02_03;

public class Program {
    public static void main(String[] args) {
        // Create instances of Employee, Manager, and Waiter
        Employee employee = new Employee("John Doe", 2.5);
        Manager manager = new Manager("Jane Smith", 3.2);
        Waiter waiter = new Waiter("Bob Brown", 1.8);

        // Display information for each
        System.out.println("Employee:");
        employee.displayInfor();

        System.out.println("\nManager:");
        manager.displayInfor();

        System.out.println("\nWaiter:");
        waiter.displayInfor();
    }
}

