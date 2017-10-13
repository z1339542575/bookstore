package model;

public class Book {
	   private String bookn;
	   private String author;
	   private String pub;
	   private String sort;
	   private String intr;
	   private float price;
	   private int stock;
	   
	public String getbookn() {
		return bookn;
	}
	public void setbookn(String bookn) {
		this.bookn = bookn;
	}
	public String getauthor() {
		return author;
	}
	public void setauthor(String author) {
		this.author = author;
	}
	public String getpub() {
		return pub;
	}
	public void setpub(String pub) {
		this.pub = pub;
	}
	public String getsort() {
		return sort;
	}
	public void setsort(String sort) {
		this.sort = sort;
	}
	public String getintr() {
		return intr;
	}
	public void setintr(String intr) {
		this.intr = intr;
	}
	public float getprice() {
		return price;
	}
	public void setprice(float price) {
		this.price = price;
	}
	public int getstock() {
		return stock;
	}
	public void setstock(int stock) {
		this.stock = stock;
	}

	public Book(String bookn, String author, String pub, String sort, String intr, float price, int stork, int stock) {
		super();
		this.bookn = bookn;
		this.author = author;
		this.pub = pub;
		this.sort = sort;
		this.intr = intr;
		this.price = price;
		this.stock = stock;
	}
	
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [bookn=" + bookn + ", author=" + author + ", pub=" + pub + ", sort=" + sort + ", intr=" + intr
				+ ", price=" + price + ", stork=" + stock + "]";
	}
}


