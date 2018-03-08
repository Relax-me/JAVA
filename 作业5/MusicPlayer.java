package 作业5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MusicPlayer extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel imagePanel;
	private ImageIcon bgImage;
	private ImageIcon nowImage;
	private ImageIcon jinduImage;
	private JButton startButton;
	private ImageIcon startImage;
	private ImageIcon pruseImage;
	private boolean flag=true;
	private JButton lastButton;
	private ImageIcon lastImage;
	private JButton nextButton;
	private ImageIcon nextImage;
	private PlayerMusic mp3;
	private String lujing="C:\\Users\\songl\\Music\\";//
	private String[] music;
	private int now=0;
	private JLabel nowlabel;
	private JLabel jindulabel;
	private JLabel timelabel;
	private JLabel timenowlabel; 
	private Thread thread;
	private Thread timethread;
	private int[] time;
	private int nowtime;
	public MusicPlayer() {
		// TODO Auto-generated constructor stub
		music=new String[] {"NARUTO Main Theme.mp3",
				"いきものがかり - ブルーバード.mp3",
				"高梨康治 - 動天.mp3"};
		time=new int[] {4*60+26,3*60+36,3*60+3};
		Initcom();
		InitUi();
		thread = new Thread(){
			   public void run(){
				   mp3= new PlayerMusic(lujing+music[now]);
			       mp3.play();
			   }
			};
			thread.start();
	}
	@SuppressWarnings("static-access")
	private void Initcom() {
		jinduImage=new ImageIcon(".\\src\\作业5\\jindu.jpg");
		nowImage=new ImageIcon(".\\src\\作业5\\now.jpg");
		bgImage=new ImageIcon(".\\src\\作业5\\bg.jpg");
		startImage=new ImageIcon(".\\src\\作业5\\start.jpg");
		pruseImage=new ImageIcon(".\\src\\作业5\\pruse.jpg");
		lastImage=new ImageIcon(".\\src\\作业5\\last.jpg");
		nextImage=new ImageIcon(".\\src\\作业5\\next.jpg");
		nowlabel = new JLabel(nowImage);
		jindulabel = new JLabel(jinduImage);
		timelabel = new JLabel(time[now]/60+":"+time[now]%60);
		timenowlabel = new JLabel("00"+":"+"00");
		timethread = new Thread(){
			   public void run(){
				   while (nowtime <= time[now]+1) {
					   if(nowtime == time[now])
					   {
						   next();
					   }
					   	nowtime++;
					   	int nowm=nowtime/60;
						int nows=nowtime%60;
						//235    545   310
						double x=((nowtime*1.0)/time[now])*310;
						jindulabel.setBounds(235+(int)x, 555, 17, 17);
						timenowlabel.setText((nowm<10?"0"+nowm:nowm)+":"+(nows<10?"0"+nows:nows));
						try {
							timethread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				   }
			}
		};
		timethread.start();			   
		imagePanel = (JPanel)getContentPane();
		startButton=new JButton();
		startButton.setIcon(pruseImage);
		nowlabel.setBounds(670, 247+28*now, nowImage.getIconWidth(), nowImage.getIconHeight());
		startButton.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(flag==false)
				{	//播放操作
					flag=true;
					startButton.setIcon(pruseImage);
					thread.resume();
					timethread.resume();
				}else {//暂停操作
					flag=false;
					startButton.setIcon(startImage);
					thread.suspend();
					timethread.suspend();
				}
			}
		});
		lastButton=new JButton();
		lastButton.setIcon(lastImage);
		lastButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				last();
			}
		});
		nextButton=new JButton();
		nextButton.setIcon(nextImage);
		nextButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				next();
			}
		});
	}
	private void InitUi() {
		JLabel label = new JLabel(bgImage);
		  label.setBounds(0, 0, bgImage.getIconWidth(), bgImage.getIconHeight());
		  imagePanel.setOpaque(false);
		  imagePanel.setLayout(null);
		  startButton.setBounds(80, 540, startImage.getIconWidth()-20, startImage.getIconHeight());
		  startButton.setFocusPainted(false);
		  startButton.setBorderPainted(false);
		  imagePanel.add(startButton);
		  lastButton.setBounds(20, 540, lastImage.getIconWidth()-20, lastImage.getIconHeight());
		  lastButton.setFocusPainted(false);
		  lastButton.setBorderPainted(false);
		  imagePanel.add(lastButton);
		  nextButton.setBounds(140, 540, nextImage.getIconWidth()-20, nextImage.getIconHeight());
		  nextButton.setFocusPainted(false);
		  nextButton.setBorderPainted(false);
		  timenowlabel.setBounds(195, 558, 40, 10);
		  timelabel.setBounds(565, 558, 40, 10);
		  imagePanel.add(nextButton);
		  imagePanel.add(timenowlabel);
		  imagePanel.add(timelabel);
		  imagePanel.add(nowlabel);
		  imagePanel.add(jindulabel);
		  getLayeredPane().setLayout(null);
		  getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		  setDefaultCloseOperation(EXIT_ON_CLOSE);
		  setSize(bgImage.getIconWidth()+15, bgImage.getIconHeight()+25);
		  setResizable(false);
		  setLocation(100, 50);
		  setVisible(true);
	}
	@SuppressWarnings("deprecation")
	private void last() {
		if(now==0)now=2;
		else now--;
		thread.stop();
		thread = new Thread(){
			   public void run(){
				   mp3= new PlayerMusic(lujing+music[now]);
			       mp3.play();
			   }
			};
			thread.start();
			int m=time[now]/60;
			int s=time[now]%60;
			timelabel.setText((m<10?"0"+m:m)+":"+(s<10?"0"+s:s));
			nowtime=0;
			nowlabel.setBounds(670, 247+28*now, nowImage.getIconWidth(), nowImage.getIconHeight());
	
	}
	@SuppressWarnings("deprecation")
	private void next() {
		if(now==2)now=0;
		else now++;
		thread.stop();
		thread = new Thread(){
			   public void run(){
				   mp3= new PlayerMusic(lujing+music[now]);
			       mp3.play();
			   }
			};
			thread.start();
			int m=time[now]/60;
			int s=time[now]%60;
			timelabel.setText((m<10?"0"+m:m)+":"+(s<10?"0"+s:s));
			nowtime=0;
			nowlabel.setBounds(670, 247+28*now, nowImage.getIconWidth(), nowImage.getIconHeight());
	
	}
}
