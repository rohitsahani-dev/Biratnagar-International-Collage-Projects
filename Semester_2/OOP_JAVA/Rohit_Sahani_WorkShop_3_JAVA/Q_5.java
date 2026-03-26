// 5. Create a method, depositMoney() in the BankAccount class to deposit money. Implement another method, withdrawMoney() to withdraw money. (The current balance should also be printed). 
package Week_3;
class BankBalance{
	private double current_money = 0;
	
	public void depositeMoney(double money) {
		 if (money > 0) {
			 current_money += money;
			 System.out.println("Deposited Balance : "+ money);
			 System.out.println("Current Balance : "+ current_money);
		 }else {
			 System.out.println("Invalid deposit amount");
		 }
	}
	
	public void withdrawMoney(double money) {
		if (money > current_money) {
            System.out.println("Insufficient balance");
        } else if (money <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else {
            current_money -= money;
            System.out.println("Withdrawn: " + money);
            System.out.println("Current Balance: " + current_money);
        }
	}
	
}


public class Q_5 {
    public static void main(String[] args) {
    	BankBalance myObj = new BankBalance();
    	myObj.depositeMoney(200000);
    	myObj.withdrawMoney(3000);
    }
}