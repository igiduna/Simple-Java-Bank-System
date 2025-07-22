package main;
import java.util.Scanner;
public class Main {

	static Scanner scnr = new Scanner(System.in);
	static int password = 1234;
	static int choice;

	public static void main(String[] args) {

		boolean bankSystem = false;

		System.out.println("WELCOME TO MY BANK SYSTEM!!!\n");
		System.out.print("Enter Password: ");
		int passwordInput = scnr.nextInt();
		while(passwordInput != password) {
			System.out.println("Wrong Password!\n");
			System.out.print("Enter Password: ");
			passwordInput = scnr.nextInt();
		}

		while(!bankSystem) {
			System.out.println("\nWhat Would You Like To Do? [ 1 = Withdraw, other = Deposit ]");
			choice = scnr.nextInt();
			if(choice == 1) {
				withdrawMoney();
			} else {
				depositMoney();
			}
		}
	}
	public static void withdrawMoney() {
		Money m = new Money();
		m.withdraw();
	}
	public static void depositMoney() {
		Money m = new Money();
		m.deposit();
	}
}
