package IOtest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User("451220279@qq.com", "Lh19970228");
		IOUser ioUser=new IOUser();
		ioUser.write(user);
		User user2;
		user2=ioUser.read();
		System.out.println(user2.getUsername());
		System.out.println(user2.getPassword());
	}

}
