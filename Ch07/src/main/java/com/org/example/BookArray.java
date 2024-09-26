package com.org.example;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];

		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "조정래");
		library[2] = new Book("어떻게 살 것인가", "조정래");
		library[3] = new Book("토지", "조정래");
		library[4] = new Book("어린왕자", "조정래");

		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
			System.out.println(library[i]);
		}

	}
}
