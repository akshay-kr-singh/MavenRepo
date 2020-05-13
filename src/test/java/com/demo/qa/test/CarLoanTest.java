package com.demo.qa.test;

import org.testng.annotations.Test;

public class CarLoanTest {
	
	@Test
	public void WebCarLoan() {
		System.out.println("CarLoanWebLogin");
	}
	
	@Test
	public void MobileCarLoan() {
		System.out.println("CarLoanMobileLogin");
	}
	
	@Test(groups= {"API"})
	public void APICarLoan() {
		System.out.println("CarLoanAPILogin");
	}

}
