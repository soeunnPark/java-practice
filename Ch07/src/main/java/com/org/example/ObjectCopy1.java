package com.org.example;

public class ObjectCopy1 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];


		bookArray1[0]= new Book ("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어살", "유시민");

		System.out.println("--bookArray1--");

		for(int i = 0; i < bookArray1.length; i++){
			bookArray1[i].showBookInfo();
		}

		System.arraycopy(bookArray1, 0, bookArray2, 0, bookArray1.length);

		System.out.println("--bookArray2--");

		for(int i = 0; i < bookArray2.length; i++){
			bookArray2[i].showBookInfo();
		}

		bookArray1[0].setBookName("바꿨지롱");
		bookArray1[0].setAuthor("이것더 바꿔지롱");

		System.out.println("--bookArray1 변경--");

		System.out.println("--bookArray1--");

		for(int i = 0; i < bookArray1.length; i++){
			bookArray1[i].showBookInfo();
		}

		System.out.println("--bookArray2--");


		for (int i = 0; i < bookArray2.length; i++){
			bookArray2[i].showBookInfo();
		}
	}
}
