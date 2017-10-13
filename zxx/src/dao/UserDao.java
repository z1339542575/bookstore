package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.User;
import utils.JDBCUtil;


public class UserDao {
	public User findUserByNamePwd(String bname,String pwd){
		//jdbc
		Connection conn = JDBCUtil.getConnection();
		String sql = "select * from buser where bname=? and pwd = ?";
		User user = null;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, bname);
			ps.setString(2, pwd);
			ResultSet rs =ps.executeQuery();
			if(rs.next()){
				user=new User();
				user.setId(rs.getInt(1));
				user.setbname(rs.getString(2));
				user.setpwd(rs.getString(3));
				user.setmail(rs.getString(4));
				user.setphone(rs.getString(5));
				user.setaddress(rs.getString(6));
				user.settype(rs.getInt(7));
				System.out.println("@@@@@@@@@@"+user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JDBCUtil.closeConnection(conn);
		}
		
		return user;
	}
	
	public void addUser(User user){
		Connection conn = JDBCUtil.getConnection();
		String sql = "insert into buser"
				+ "(bname,pwd,mail,phone,address,type) "
				+ "values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user.getbname());
			ps.setString(2, user.getpwd());
			ps.setString(3, user.getmail());
			ps.setString(4, user.getphone());
			ps.setString(5, user.getaddress());
			ps.setInt(6, user.gettype());
			ps.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally{
			JDBCUtil.closeConnection(conn);
		}
	}
	
	public void modifyUser(User user){
		Connection conn = JDBCUtil.getConnection();
		String sql = "update buser set [pwd]=?,[mail]=?,[phone]=?,"
				+ "[address]=? where bname=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user.getpwd());
			ps.setString(2, user.getmail());
			ps.setString(3, user.getphone());
			ps.setString(4, user.getaddress());
			ps.setString(5, user.getbname());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JDBCUtil.closeConnection(conn);
		}
	}

	public List<User> queryUser(){
			Connection conn = JDBCUtil.getConnection();
			String sql = "select * from buser";
			List<User> list = new ArrayList<User>();
			try {
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				User u ;
				while(rs.next()){
					 u = new User();
					u.setbname(rs.getString("bname"));
					u.setpwd(rs.getString("pwd"));
					u.setmail(rs.getString("mail"));
					u.setphone(rs.getString("phone"));
					u.setaddress(rs.getString("address"));
					u.settype(rs.getInt("type"));
					list.add(u);
				}
			} catch (SQLException e) {
				e.printStackTrace();
				}
				return list;
		}
}	
