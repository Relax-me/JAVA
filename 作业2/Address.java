package ��ҵ2;


//2�� ����һ��ͨѶ¼��Address���������������绰�Լ�E-mail��ַ����������ʾ���еĳ�Ա��������������ʼ�࣬�ù��췽������3��������ʾͨ��¼��Ϣ��
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
		System.out.println("������"+name+"\n�绰��"+tel+"\nE-mail��ַ��"+email);
	}
}