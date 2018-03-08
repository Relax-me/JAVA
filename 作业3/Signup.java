package 作业3;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Signup extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel1;	
	private JPanel panel2;
	private JTextField email;
	private JTextField password;
	private JTextField email2;
	private JTextField password1;
	private JTextField password2;
	private JTextField yzm;
	private JTextArea emailtip;
	private JTextArea email2tip;
	private JTextArea passwordtip;
	private JTextArea yzmtip;
	private JTextArea fsyzmtip;
	private JTextArea password1tip;
	private JTextArea password2tip;
	private JButton signup;
	private JButton sign;
	private JButton fsyzm;
	private JButton exit;
	private JButton ok;
	public Signup() throws HeadlessException {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initComp1();
		initUI1();
		setVisible(true);
	}
	private void initComp1() {
		signup=new JButton("注册");
		sign=new JButton("登陆");
		signup.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Signup.this.initComp2();
				Signup.this.initUI2();
			}
	     });
		email=new JTextField(20);
		password=new JTextField(20);
		emailtip=new JTextArea("邮箱：");
		passwordtip=new JTextArea("密码：");
		panel1=new JPanel();
		panel1.add(signup);
		panel1.add(sign);
		panel1.add(email);
		panel1.add(password);
		panel1.add(emailtip);
		panel1.add(passwordtip);
	}
	private void initUI1() {
		setSize(400, 200);
		setLocation(400, 100);
		setLayout(null);
		panel1.setBounds(0,0,400, 180);
		panel1.setBackground(Color.lightGray);
		panel1.setLayout(null);
		emailtip.setBackground(Color.lightGray);
		email.setBounds(150, 30, 150, 20);
		password.setBounds(150, 60, 150, 20);
		emailtip.setBounds(100, 30, 50, 20);
		passwordtip.setBackground(Color.lightGray);
		passwordtip.setBounds(100, 60, 50, 20);
		signup.setBounds(100, 120, 80, 20);
		sign.setBounds(220, 120, 80, 20);
		add(panel1);
	}
	private void initComp2() {
		fsyzm=new JButton("发送验证码");
		exit=new JButton("取消");
		ok=new JButton("确认");
		fsyzm.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Signup.this.fsyzm.setEnabled(false);
				Signup.this.panel2.add(fsyzmtip);
				Signup.this.fsyzmtip.setBackground(Color.lightGray);
				Signup.this.fsyzmtip.setBounds(260, 60, 50, 20);
			}
	     });
		exit.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Signup.this.setSize(400, 200);
			}
	     });
		password1=new JTextField(20);
		password2=new JTextField(20);
		yzm=new JTextField(20);
		yzmtip=new JTextArea("验 证 码：");
		fsyzmtip=new JTextArea("发送成功！");
		password1tip=new JTextArea("密        码：");
		password2tip=new JTextArea("确认密码：");
		email2tip=new JTextArea("邮        箱：");
		email2=new JTextField(20);
		panel2=new JPanel();
		panel2.add(email2tip);
		panel2.add(email2);
		panel2.add(fsyzm);
		panel2.add(yzmtip);
		panel2.add(yzm);
		panel2.add(password1tip);
		panel2.add(password1);
		panel2.add(password2tip);
		panel2.add(password2);
		panel2.add(exit);
		panel2.add(ok);
	}
	private void initUI2() {
		setSize(400, 480);
		panel2.setBounds(0,180,400, 300);
		panel2.setBackground(Color.lightGray);
		panel2.setLayout(null);
		email2tip.setBackground(Color.lightGray);
		email2tip.setBounds(100, 30, 50, 20);
		email2.setBounds(150, 30, 150, 20);
		fsyzm.setBounds(150, 60, 100, 20);
		yzmtip.setBackground(Color.lightGray);
		yzmtip.setBounds(100, 90, 150, 20);
		yzm.setBounds(150, 90, 150, 20);
		password1tip.setBackground(Color.lightGray);
		password1tip.setBounds(100, 120, 150, 20);
		password1.setBounds(150, 120, 150, 20);
		password2tip.setBackground(Color.lightGray);
		password2tip.setBounds(100, 150, 150, 20);
		password2.setBounds(150, 150, 150, 20);
		exit.setBounds(100, 180, 80, 20);
		ok.setBounds(220, 180, 80, 20);
		add(panel2);
	}
}
