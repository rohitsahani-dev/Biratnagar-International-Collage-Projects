//7. Implement a parameterized constructor for the BankAccount class that initializes the account attributes. Create an object using this constructor.
package Week_3;

class Bankaccount {
    private double current_money;

    public Bankaccount(double Balance) {
        if (Balance >= 0) {
            current_money = Balance;
        } else {
            System.out.println("Invalid balance");
        }
    }

    public void depositMoney(double money) {
        if (money > 0) {
            current_money += money;
        }
    }

    public void withdrawMoney(double money) {
        if (money <= current_money && money > 0) {
            current_money -= money;
        } else {
            System.out.println("Invalid withdrawal");
        }
    }

    public double getBalance() {
        return current_money;
    }
}

public class Q_7 {
    public static void main(String[] args) {
    
        Bankaccount myObj = new Bankaccount(100000);

        System.out.println("Initial Balance: " + myObj.getBalance());
        myObj.depositMoney(5000);
        myObj.withdrawMoney(2000);
        System.out.println("Final Balance: " + myObj.getBalance());
    }
}