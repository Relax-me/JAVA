package GUI;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String id;
	public String pw;
	public User(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
}
