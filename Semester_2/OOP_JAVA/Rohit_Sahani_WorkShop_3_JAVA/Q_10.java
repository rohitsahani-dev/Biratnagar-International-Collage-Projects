//10.Set the balance attribute in the BankAccount class as private. 
//Provide public getter methods for the balance.
package Week_3;

class Bankbalance{
	private double balance = 0;
	
	public void setBalance(double money) {
		this.balance = money;
	}
	
	public double getBalance() {
		return balance;
	}
}

public class Q_10 {
	public static void main() {
		Bankbalance myObj = new Bankbalance();
		myObj.setBalance(2000);
		System.out.println(myObj.getBalance());
		}
}
