/**
 * 
 */
package credit_card_project;

import java.util.Scanner;

/**
 * 
 */
public class Main 
{
	public static void main(String[] args)
	{
       System.out.println("Welcome to our ATM Banking, please enter the pin to proceed");
       ATMmachine atm = new ATMmachine(10000);
       try (Scanner sc = new Scanner(System.in)) 
       {
		   int pin = sc.nextInt();
		   
		   int userpin = atm.getUserA().getUserpin();
		   while(pin != userpin)
		   {
			  System.out.println("Your pin it's wrong, try entering again!");
			  pin = sc.nextInt();
		   }
		   int option = 0;
		   do
		   {
			   System.out.println("Enter the transaction: \n"
	   		             +"---------------------\n"
	   		             +"1. Deposit : \n"
	   		             +"2. Withdraw :\n"
	   		             +"3. Check Balance \n"
	   		             +"4. Exit :");
	   
	            option = sc.nextInt(); 
	            switch(option)
	            {
	                case 1:
	                	System.out.println("Enter the amount you want to deposit");
	                	double amount = sc.nextDouble();
	                	atm.deposit(amount);
	                	System.out.println("Thanks for choosing this ATM");
	                	break;
	                case 2:
	                	System.out.println("Enter the amount you want to withdraw");
	                	double amount2 = sc.nextDouble();
	                	atm.withdrawing(amount2);
	                	System.out.println("Thanks for choosing this ATM");
	                	break;
	                case 3:
	                	atm.checkBalance();
	                	break;
	                case 4:
	                	System.out.println("Thank you for using the ATM!");
	                    sc.close();
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please choose again.");
	            }
		   }
		   while(option < 0 || option > 4 || option != 4);
	   }
	}
}
