package exercise01;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        // Khởi tạo Department bằng constructor không có parameters
        Department department1 = new Department();

        // Khởi tạo Department bằng constructor có 1 parameter
        Department department2 = new Department("Sales");

        // Khởi tạo Account bằng constructor không có parameters
        Account account1 = new Account();

        // Khởi tạo Account bằng constructor có các parameter là id, Email, Username, FirstName, LastName
        Account account2 = new Account(1, "email@example.com", "username", "First", "Last");

        // Khởi tạo Account bằng constructor có các parameter là id, Email, Username, FirstName, LastName và Position của User, default createDate = now
        Account account3 = new Account(2, "email2@example.com", "username2", "First2", "Last2", "Position");

        // Khởi tạo Account bằng constructor có các parameter là id, Email, Username, FirstName, LastName và Position của User, createDate
        Account account4 = new Account(3, "email3@example.com", "username3", "First3", "Last3", "Position", new Date());

        // Khởi tạo Group bằng constructor không có parameters
        Group group1 = new Group();

        // Khởi tạo Group bằng constructor có các parameter là GroupName, Creator, array Account[] accounts, CreateDate
        Account creator = new Account("creator");
        Account[] accounts = {new Account("user1"), new Account("user2")};
        Group group2 = new Group("Group 2", creator, accounts, new Date());

        // Khởi tạo Group bằng constructor có các parameter là GroupName, Creator, array String[] usernames , CreateDate
        String[] usernames = {"user3", "user4"};
        Group group3 = new Group("Group 3", creator, usernames, new Date());

        // In ra thông tin của group3
        System.out.println("Group Name: " + group3.groupName);
        System.out.println("Creator: " + group3.creator.username);
        System.out.print("Accounts: ");
        for (Account account : group3.accounts) {
            System.out.print(account.username + " ");
        }
        System.out.println("\nCreate Date: " + group3.createDate);
    }
}
