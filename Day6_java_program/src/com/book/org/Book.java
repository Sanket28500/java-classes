package com.book.org;
public class Book {

	private int bookid;
	private String bname;
	private String bookauthor;
	private int bookprice;
	
	
	public Book()
	{
		this.bookid=1;
		this.bname="myname";
		this.bookauthor="author";
		this.bookprice=1;
	}

	public Book(int bookid, String bname, String bookautor, int bookprice) {
		super();
		this.bookid = bookid;
		this.bname = bname;
		this.bookauthor = bookautor;
		this.bookprice = bookprice;
	}
	
	public int getBookid() {
		return bookid;
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public String getBookautor() {
		return bookauthor;
	}


	public void setBookautor(String bookauthor) {
		this.bookauthor = bookauthor;
	}


	public int getBookprice() {
		return bookprice;
	}


	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}

	public void display()
	{
		System.out.println(" " +bookid+ " " +bname+ " " +bookauthor+ " " +bookprice);
	}

	
}

