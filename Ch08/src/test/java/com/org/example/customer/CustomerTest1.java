package com.org.example.customer;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());

		Customer customerKim = new VIPCustomer(10020, "김유신", 12345);
		customerKim.bonusPoint = 1000;


		System.out.println(customerKim.showCustomerInfo());

		int price = 10000;
		int leePrice = customerLee.calcPrice(price);
		int kimPrice = customerKim.calcPrice(price);

		System.out.println(customerLee.getCustomerName() + " 님이 " + leePrice + "원 지불하였습니다.");
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.getCustomerName() + " 님이 " + kimPrice + "원 지불하였습니다.");
		System.out.println(customerKim.showCustomerInfo());


		System.out.println(customerKim.showCustomerInfo());
	}
}
