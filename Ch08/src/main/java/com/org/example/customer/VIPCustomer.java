package com.org.example.customer;

public class VIPCustomer extends Customer {

	private int agentID;
	double saleRatio;

	// public VIPCustomer() {
	// 	super(); // 컴파일러가 자동으로 추가하는 코드. 상위 클래스의 Customer()가 호출된다.
	// 	customerGrade = "VIP";
	// 	bonusRatio = 0.05;
	// 	saleRatio = 0.1;
	// }

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}

	public int calcPrice(int price) {
		bonusPoint += (int)(price * saleRatio);
		return price - (int)(price*saleRatio);
	}

	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + "입ㄴ다.";
	}

	public int getAgentID() {
		return agentID;
	}
}
