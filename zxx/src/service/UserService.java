package service;

import java.util.List;

import dao.UserDao;
import model.User;

public class UserService {
	//��¼
	public User loginCheck(String bname , String pwd){
		UserDao ud = new UserDao();
		User u = ud.findUserByNamePwd(bname, pwd);
		return u;
	}
	// ע��ҵ��
	public void addUser(User user) {
		UserDao ud = new UserDao();
		ud.addUser(user);
		}

		// �޸��û�ҵ��
	public void modifyUser(User user) {
		UserDao ud = new UserDao();
		ud.modifyUser(user);
		}
	public List<User> queryUser(){
		UserDao ud = new UserDao();
		return ud.queryUser();
		}
}


