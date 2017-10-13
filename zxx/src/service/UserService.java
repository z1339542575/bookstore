package service;

import java.util.List;

import dao.UserDao;
import model.User;

public class UserService {
	//登录
	public User loginCheck(String bname , String pwd){
		UserDao ud = new UserDao();
		User u = ud.findUserByNamePwd(bname, pwd);
		return u;
	}
	// 注册业务
	public void addUser(User user) {
		UserDao ud = new UserDao();
		ud.addUser(user);
		}

		// 修改用户业务
	public void modifyUser(User user) {
		UserDao ud = new UserDao();
		ud.modifyUser(user);
		}
	public List<User> queryUser(){
		UserDao ud = new UserDao();
		return ud.queryUser();
		}
}


