package service;

import java.util.List;

import dao.BookDao;
import model.Book;

public class BookService {

	//�����Ʒ
	public void addBook(Book book){
		BookDao bd = new BookDao();
		bd.addBook(book);
	}
	//ɾ
	public void deleteBook(String book){
	}
	//��
	public void updateBook(String book){


	}
	//��
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
