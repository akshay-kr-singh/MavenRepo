package com.demo.qa.test;

import org.testng.annotations.Test;

public class HomeLoanTest {
	
	@Test
	public void WebHomeLoan() {
		System.out.println("HomeLoanWebLogin");
	}
	
	@Test
	public void MobileHomeLoan() {
		System.out.println("HomeLoanMobileLogin");
	}
	
	@Test(groups= {"API"})
	public void APIHomeLoan() {
		System.out.println("HomeLoanAPILogin");
	}

}
