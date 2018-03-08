package 作业2;


//2、 定义一个通讯录类Address。它包含姓名、电话以及E-mail地址，方法有显示所有的成员变量。并定义起始类，用构造方法创建3个对象，显示通信录信息。
public class Address {
	private String name;
	private String tel;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address(String name, String tel, String email) {
		super();
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	public void Show(){
		System.out.println("姓名："+name+"\n电话："+tel+"\nE-mail地址："+email);
	}
}