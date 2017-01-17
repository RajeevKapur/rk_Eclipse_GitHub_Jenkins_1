package rkHello2;

public class BankAccount2 {
	private double balance ; 
	
	public BankAccount2(double balance) {
		// TODO Auto-generated constructor stub
		this.balance = balance; 
	}

	public double debit(double amount){
		
		if(balance < amount){
			System.out.println("amount requested to be debitted is greater than the current balance ! Cannot proceed with transaction ..");
			return balance; 
		}
		
		balance = balance - amount; 
		return balance; 
		
	}
}
