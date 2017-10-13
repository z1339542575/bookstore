package service;

import java.util.List;

import dao.BookDao;
import model.Book;

public class BookService {

	//添加商品
	public void addBook(Book book){
		BookDao bd = new BookDao();
		bd.addBook(book);
	}
	//删
	public void deleteBook(String book){
	}
	//改
	public void updateBook(String book){


	}
	//查
	public Book queryBookBybookn(String book){
			return null;
	}
	
	public List<Book> queryBook(){
		BookDao bd = new BookDao();
		return bd.queryBook();
	}
	public void modifyBook(Book book) {
		// TODO Auto-generated method stub
		
	}
}
