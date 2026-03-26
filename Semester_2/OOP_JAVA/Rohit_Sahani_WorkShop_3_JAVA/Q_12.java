//12.Create a class Customer with private attributes customerId, name, and a BankAccount attribute. 
//Implement a parameterized constructor and encapsulate the attributes. Provide getter method.
//Instantiate multiple Customer objects with different values and demonstrate the use of getters and setters.

package Week_3;
class Bank_Account {
    private double balance;

    public Bank_Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void depositMoney(double amount) {
        balance += amount;
    }

    public void withdrawMoney(double amount) {
        balance -= amount;
    }
}

class Customer {
    private int customerId;
    private String name;
    private Bank_Account account;

    public Customer(int customerId, String name, Bank_Account account) {
        this.customerId = customerId;
        this.name = name;
        this.account = account;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public Bank_Account getAccount() {
        return account;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Q_12 {
    public static void main(String[] args) {
        Bank_Account acc1 = new Bank_Account(1056);
        Bank_Account acc2 = new Bank_Account(5800);

        Customer cust1 = new Customer(1, "Rohit", acc1);
        Customer cust2 = new Customer(2, "Ayush", acc2);

        System.out.println(cust1.getName() + " Balance: " + cust1.getAccount().getBalance());
        System.out.println(cust2.getName() + " Balance: " + cust2.getAccount().getBalance());

       
        cust1.setName("Rohit Sahani");
        System.out.println("Updated Name: " + cust1.getName());

       
        cust2.getAccount().depositMoney(2000);
        System.out.println("Customer 2 New Balance: " + cust2.getAccount().getBalance());
    }
}
