package main;
import java.util.Random;
public class Account {

	String accountName;
	public static float deposit,withdraw;
	public float balance;
	private int randomId;

	Account(){
		accountName = "Luigi Neil";
		balance = 10000;
	}
	Account(String accountName, float balance){
		this.accountName = accountName;
		this.balance = balance;
	}
	void depositAccount() {
		getRandomId();
		System.out.println("\nAccount Name: " + accountName);

	}
	void withdrawAccount() {
		getRandomId();
		System.out.println("\nAccount Name: " + accountName);
		System.out.println("Your Balance: " + balance);
	}
	private int getRandomId() {
		Random r = new Random();
		System.out.print("\nYour Transaction Number: ");
		for(int i = 0; i < 8; i++) {
			int rgId = r.nextInt(10);
			System.out.print(rgId);
		}
		return randomId;
	}
}
