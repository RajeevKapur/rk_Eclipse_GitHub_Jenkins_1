package rkHelloJunitTestCases;

import rkHello.*; 
import junit.framework.Assert;
import org.junit.Test; 

public class TestBankAccount {

	public TestBankAccount() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testDebitWithSufficientFunds() {
			BankAccount bankAccount = new BankAccount(10); 
			double amount = bankAccount.debit(5.0); 
			Assert.assertEquals(5.0, amount);
		}
}


