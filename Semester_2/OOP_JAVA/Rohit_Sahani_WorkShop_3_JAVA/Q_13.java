package Week_3;

class bankAccount {
    private double balance;
    private String holder;

    public bankAccount() {
        this.balance = 0;
        this.holder = "Unknown";
    }

    public bankAccount(double balance) {
        this.balance = balance;
        this.holder = "Unknown";
    }

    public bankAccount(double balance, String owner) {
        this.balance = balance;
        this.holder = owner;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }
}

public class Q_13 {
    public static void main(String[] args) {
        bankAccount a1 = new bankAccount();
        System.out.println(a1.getHolder() + " Balance: " + a1.getBalance());

        bankAccount a2 = new bankAccount(5000);
        System.out.println(a2.getHolder() + " Balance: " + a2.getBalance());

        bankAccount a3 = new bankAccount(10000, "Rohit");
        System.out.println(a3.getHolder() + " Balance: " + a3.getBalance());
    }
}