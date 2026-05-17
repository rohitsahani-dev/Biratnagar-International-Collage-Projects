package week_7;

class Customer {
 protected String firstName;
 protected String lastName;

 public Customer(String firstName, String lastName) {
     this.firstName = firstName;
     this.lastName = lastName;
 }
}

class Account extends Customer {
 private String accountNumber;
 private double balance;

 public Account(String firstName, String lastName, String accountNumber, double balance) {
     super(firstName, lastName);
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println(firstName + " deposited: " + amount + ". New Balance: " + balance);
 }

 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println(firstName + " withdrew: " + amount + ". New Balance: " + balance);
     } else {
         System.out.println("Insufficient funds for " + firstName);
     }
 }

 public double getBalance() { return balance; }
 public String getAccountNumber() { return accountNumber; }
}


class Transaction {

 public void transfer(Account source, Account destination, double amount) {
     if (source.getBalance() >= amount) {
         source.withdraw(amount);
         destination.deposit(amount);
         System.out.println("Transfer of " + amount + " successful.");
     } else {
         System.out.println("Transfer failed: Insufficient funds.");
     }
 }
}

public class Test {
 public static void main(String[] args) {
     Account acc1 = new Account("Alice", "Smith", "ACC001", 1000.0);
     Account acc2 = new Account("Bob", "Jones", "ACC002", 500.0);
     
     Transaction tx = new Transaction();
     tx.transfer(acc1, acc2, 300);
 }
}
