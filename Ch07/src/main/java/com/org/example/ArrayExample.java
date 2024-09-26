package com.org.example;

public class ArrayExample {


	int[] studentIDs4;
	public void makeStudentIds() {
		studentIDs4 = new int[] {101, 102, 103};
	}

	public static void main(String[] args) {
		int [] studentIDs = new int[10];
		int [] studentIDs2 = new int[] {101, 102, 203};
		int[] studentIDs3 = {101, 102, 203};

		studentIDs[0] = 10;
		for(int i : studentIDs) {
			System.out.println(i);
		}
	}

}
