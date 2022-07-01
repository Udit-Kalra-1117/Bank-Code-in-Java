import java.util.Scanner;
public class Bank_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userInput;
		int size = 0;
		double[] accountBalances = new double[500];
		String[] accountNames = new String[500];
		for(;true;){
			System.out.println("\nBank Admin Menu:");
			System.out.println("Please Enter a Menu Option:");
			System.out.println("(1): Add Customer to the Bank");
			System.out.println("(2): Change Customer Name");
			System.out.println("(3): Check Account Balance");
			System.out.println("(4): Modify Account Balance");
			System.out.println("(5): Summary of all Accounts");
			System.out.println("(-1): Quit");

			userInput = input.nextInt();

			if(userInput==1){
				System.out.println("Bank Add Customer Menu:");
				System.out.println("Please enter an Account Balance: ");
				double balance = input.nextDouble();
				accountBalances[size] =balance;
				System.out.println("Please enter Account Name: ");
				input.nextLine();
				String name = input.nextLine();
				accountNames[size] = name;
				System.out.println("Customer ID: " + size);
				size+=1;
			}
			else if(userInput==2){
				System.out.println("Bank Change Name Menu:");
				System.out.println("Please enter a Customer ID to change their Name: ");
				int index = input.nextInt();
				System.out.println("What is the Customer's new Name?");
				input.nextLine();
				accountNames[index] = input.nextLine();
			}
			else if(userInput==3){
				System.out.println("Bank Check Balance Menu:");
				System.out.println("Please enter a Customer ID to check the Balance: ");
				int index = input.nextInt();
				double balance = accountBalances[index];
				System.out.println("This Customer has $" + balance + " in their account.");
			}
			else if(userInput==4){
				System.out.println("Bank Modify Balance Menu:");
				System.out.println("Please enter a Customer ID to modify the Balance: ");
				int index = input.nextInt();
				System.out.println("Please enter the new Balance: ");
				accountBalances[index] = input.nextDouble();
			}
			else if(userInput==5){
				System.out.println("Bank all Customer Summary Menu:");
				double total = 0;
				for(int i=0; i<size; i++){
					total+= accountBalances[i];
					System.out.println(accountNames[i] + " has $" + accountBalances[i] + " in their account.");
				}
				System.out.println("In total there is $" + total + " in the bank.");
			}
			else if(userInput==-1){
				System.exit(-1);
			}
			else{
				System.out.println("ERROR: Invalid Input!");
			}
	}
}
}