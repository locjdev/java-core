package exercise04;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void credit(int amount) {
        this.balance += amount;
    }

    public void debit(int amount) {
        if (amount > this.balance) {
            System.out.println("Số dư không đủ để thực hiện giao dịch");
        } else {
            this.balance -= amount;
        }
    }

    public void transferTo(Account account, int amount) {
        if (amount > this.balance) {
            System.out.println("Số dư không đủ để thực hiện giao dịch");
        } else {
            this.balance -= amount;
            account.balance += amount;
        }
    }

}
