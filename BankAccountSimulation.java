package Ques_04;
import java.util.Scanner;

public class BankAccountSimulation {

	  private static double balance = 0.0;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the amount to deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    deposit(depositAmount);
	                    break;
	                case 2:
	                    System.out.print("Enter the amount to withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    withdraw(withdrawAmount);
	                    break;
	                case 3:
	                    checkBalance();
	                    break;
	                case 4:
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	            System.out.println();
	        }
	
	        private static void deposit(double amount) {
	            if (amount > 0) {
	                balance += amount;
	                System.out.println("Deposit successful. Current balance: " + balance);
	            } else {
	                System.out.println("Invalid amount. Deposit failed.");
	            }
	        }

	        private static void withdraw(double amount) {
	            if (amount > 0) {
	                if (amount <= balance) {
	                    balance -= amount;
	                    System.out.println("Withdrawal successful. Current balance: " + balance);
	                } else {
	                    System.out.println("Insufficient funds. Withdrawal failed.");
	                }
	            } else {
	                System.out.println("Invalid amount. Withdrawal failed.");
	            }
	        }

	        private static void checkBalance() {
	            System.out.println("Current balance: " + balance);
	        }
	    }    
	
}
