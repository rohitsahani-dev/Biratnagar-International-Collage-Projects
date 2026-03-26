package Week_3;

//3.Define a class named BankAccount with attributes accountNumber, 
//balance, and accountHolderName, accountHolderAddress. 

class BankAccount{
	private int accountNumber;
	private double balance;
	private String accountHolderName;
	private String accountHolderAddress;
	
	public int getNumber() {
		return accountNumber;
	}
	public void setNumber(int number) {
		accountNumber = number;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getName() {
		return accountHolderName;
	}
	public void setName(String name) {
		accountHolderName = name;
	}
	
	public String getAddress() {
		return accountHolderAddress;
	}
	public void setAddress(String address) {
		accountHolderAddress = address;
		}
	
	
}
public class Q_3 {
	public static void main(String[] args) {
		BankAccount myObj = new BankAccount();
		myObj.setName("Rohit Sahani");
		myObj.setBalance(8000);
		myObj.setNumber(002010004567);
		myObj.setAddress("Biratnagar 12,laliguras tole");
		

        System.out.println("Account info : ");
        System.out.println("Account Number: " + myObj.getNumber());
        System.out.println("Name: " + myObj.getName());
        System.out.println("Name: " + myObj.getBalance());
        System.out.println("Name: " + myObj.getAddress());
	}
}
