package Banking;

public class ATM {
	 double balance=0;
     ATM(double balance){
    	 this.balance=balance;
     }
     public void withdraw(double amount) {
    	 if(balance>=amount) {
    		balance=balance-amount;
    		System.out.println("successfully withdraw the money");
    	 }
    	 else {
    		 System.out.println("insuffient balance ");
    	 }
     
     }
     
     public void deposit(double amount) {
    	 balance+=amount;
    	 System.out.println("sucessfully deposite your money");
     }
     
    public void  checkBalance() {
    	System.out.println("Your current balance is : "+balance);
    	
    }

}
