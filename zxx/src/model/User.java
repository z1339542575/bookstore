package model;

public class User {
	   private int id;
	   private String bname;
	   private String pwd;
	   private String mail;
	   private String phone;
	   private String address;
	   private int type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getbname() {
		return bname;
	}

	public void setbname(String bname) {
		this.bname = bname;
	}

	public String getpwd() {
		return pwd;
	}

	public void setpwd(String pwd) {
		this.pwd = pwd;
	}

	public String getmail() {
		return mail;
	}

	public void setmail(String mail) {
		this.mail = mail;
	}

	public String getphone() {
		return phone;
	}

	public void setphone(String phone) {
		this.phone = phone;
	}
	
	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public int gettype() {
		return type;
	}

	public void settype(int type) {
		this.type = type;
	}


	public User(int id, String bname, String pwd, String mail, String phone, String address, int type) {
		super();
		this.id = id;
		this.bname = bname;
		this.pwd = pwd;
		this.mail = mail;
		this.phone = phone;
		this.address = address;
		this.type = type;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", bname=" + bname + ", pwd=" + pwd + ", mail=" + mail + ", phone=" + phone
				+ ", address=" + address + ", type=" + type + "]";
	}


}

