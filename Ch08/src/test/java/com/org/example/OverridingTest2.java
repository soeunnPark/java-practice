package com.org.example;

import com.org.example.customer.Customer;
import com.org.example.customer.VIPCustomer;

public class OverridingTest2 {
	public static void main(String[] args) {
		VIPCustomer vc = new VIPCustomer(10030, "나몰라", 2000);
		// vc.bonusPoint = 1000;

		System.out.println(vc.getCustomerName() + "지불 금액은 " + vc.calcPrice(10000)+ "원입니다.");
	}
}
