package Banking;
import Banking.*;
import java.util.Scanner;
public class Main {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total balace");
		double bal=sc.nextDouble();
		double amount;
		ATM obj= new ATM(bal);
		int choice;
		do {
			System.out.println("***************M E N U****************************");
			System.out.println("1. Withdraw money");
			System.out.println("2. Deposite money");
			System.out.println("3. checkBalance ");
			System.out.println("4. Exit");
			System.out.println("Enter the choice:");
			 choice=sc.nextInt();
			 switch(choice) {
			 case 1:
				 System.out.println("Enter the amount to withdraw:");
				  amount=sc.nextDouble();
				 obj.withdraw(amount);
				 break;
			 case 2:
				 System.out.println("Enter the amount to deposite");
				  amount=sc.nextDouble();
				  obj.deposit(amount);
				  break;
			 case 3:
				 obj.checkBalance();
				 break;
				 
			 case 4:
				 System.out.println("Existing the program");
				 break;
				 default:
					 System.out.println("plz enter the valid choice ");	 
			 }
		}while(choice !=5);
		
	
		
		
		
		
	}

}
