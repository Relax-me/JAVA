package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Unsign extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel jPanel1;
	JPanel jPanel2;
	JPanel jPanel3;
	JPanel jPanel4;
	JLabel jLabeltitle;
	JLabel jLabelid;
	JLabel jLabelpw;
	JButton jButtonunsign;
	JTextField jTextFieldid;
	JTextField jTextFieldpw;
	GridLayout gridLayout;
	public Unsign() {
		// TODO Auto-generated constructor stub
		setTitle("注册界面");
		initCom();
		initUI();
		setVisible(true);
	}
	protected void initCom() {
		jPanel1=new JPanel();
		jPanel2=new JPanel();
		jPanel3=new JPanel();
		jPanel4=new JPanel();
		jLabeltitle=new JLabel("欢迎注册为通瀛动课用户！");
		jLabelid=new JLabel("用户名：");
		jLabelpw=new JLabel("密    码：");
		jTextFieldid=new JTextField(15);
		jTextFieldpw=new JTextField(15);
		jButtonunsign=new JButton("注册");
		jButtonunsign.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new IOuser().write(new User(jTextFieldid.getText(),jTextFieldpw.getText()));			
				new Tip("注册成功！");
			}
		});
		
	}
	protected void initUI() {
		gridLayout=new GridLayout(5, 1);
		setLayout(gridLayout);
		jPanel1.add(jLabeltitle);
		jPanel2.add(jLabelid);
		jPanel2.add(jTextFieldid);
		jPanel3.add(jLabelpw);
		jPanel3.add(jTextFieldpw);
		jPanel4.add(jButtonunsign);
		add(jPanel1);
		add(jPanel2);
		add(jPanel3);
		add(jPanel4);
		//add(jPanel3);
		setSize(400, 300);
		setLocation(400, 200);
	}
}
