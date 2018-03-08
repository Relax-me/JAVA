package 作业3;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;




public class Exit extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton exit;
	private JPanel panel;	
	public Exit() throws HeadlessException {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initComp();
		initUI();
		setVisible(true);
	}
	private void initComp() {
		exit=new JButton("点我退出");
		exit.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				System.exit(0);
			}
	     }); 
		panel=new JPanel();
		panel.add(exit);
	}
	private void initUI() {
		setSize(600, 400);
		setLocation(400, 200);
		panel.setBackground(java.awt.Color.green);
		add(panel);
	}
}
