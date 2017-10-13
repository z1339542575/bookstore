package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import model.Book;
import utils.JDBCUtil;


public class BookDao {
		//Ìí¼Ó
		public void addBook(Book book){
		Connection conn = JDBCUtil.getConnection();
		String sql = "insert into book"
				+ "(bookn,author,pub,sort,intr,price,stock) "
				+ "values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, book.getbookn());
			ps.setString(2, book.getauthor());
			ps.setString(3, book.getpub());
			ps.setString(4, book.getsort());
			ps.setString(5, book.getintr());
			ps.setFloat(6, book.getprice());
			ps.setInt(7, book.getstock());
			ps.executeUpdate();
			} catch (SQLException e) {

			e.printStackTrace();
			} finally{
			JDBCUtil.closeConnection(conn);
			}
	   }
		//É¾³ý
		public void deleteBook(Book book){

				
		}
		//ÐÞ¸Ä
		public void updateBook(Book book){
				Connection conn = JDBCUtil.getConnection();
				
				String sql = "update book set [author]=?,[pub]=?,[intr]=?"
						+ "[sort]=?,[stock]=? where bookn=?";
				try {
					PreparedStatement ps = conn.prepareStatement(sql);
					ps.setString(1, book.getauthor());
					ps.setString(2, book.getpub());
					ps.setString(4, book.getsort());
					ps.setString(5, book.getintr());
					ps.setFloat(6, book.getprice());
					ps.setInt(6, book.getstock());
					ps.setString(7, book.getbookn());
					ps.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally{
					JDBCUtil.closeConnection(conn);
				}
			}

		//²éÑ¯
		public Book queryBookBybookn(Book book){
			return null;
		}
		public List<Book> queryBook(){
			Connection conn = JDBCUtil.getConnection();
			String sql = "select * from book";
			List<Book> list = new ArrayList<Book>();
			try {
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				Book b ;
				while(rs.next()){
					b = new Book();
					b.setbookn(rs.getString("bookn"));
					b.setauthor(rs.getString("author"));
					b.setpub(rs.getString("pub"));
					b.setsort(rs.getString("sort"));
					b.setintr(rs.getString("intr"));
					b.setprice(rs.getFloat("price"));
					b.setstock(rs.getInt("stock"));
					list.add(b);
				}
			} catch (SQLException e) {
				e.printStackTrace();
				}
				return list;
		}

}


	

