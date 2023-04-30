package com.testmyclass.org;
import com.book.org.Book;
import java.util.Scanner;
public class TestBook {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("bookid  bookname  bookauthor  bookprice");
		Book b=new Book(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
		b.display();
		
	}

}
