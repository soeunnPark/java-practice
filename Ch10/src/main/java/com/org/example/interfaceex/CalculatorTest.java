package com.org.example.interfaceex;

public class CalculatorTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;

		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
	}
}
