package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tip extends JFrame {

	/**
	 * 
	 */
	JLabel jLabeltitle;
	private static final long serialVersionUID = 1L;
	public Tip(String tip) {
		jLabeltitle=new JLabel(tip);
		add(jLabeltitle);
		setSize(200, 100);
		setLocation(500, 300);
		setVisible(true);
	}
}
