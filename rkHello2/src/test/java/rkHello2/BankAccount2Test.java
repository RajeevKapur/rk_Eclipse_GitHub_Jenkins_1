package rkHello2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import rkHello2.BankAccount2;

public class BankAccount2Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBankAccount2() {
		// fail("Not yet implemented");
	}

	@Test
	public void testDebit() {
		// fail("Not yet implemented");
		BankAccount2 bankAccount = new BankAccount2(10); 
		double amount = bankAccount.debit(5.0); 
		assertEquals(5.0, amount, 0.0);
	}

}
