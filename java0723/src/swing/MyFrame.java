package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	
	String[] stn = {"stand.gif"};
	String[] wak = {"walk1.gif","walk2.gif"};
	String[] run = {"run1.gif","run2.gif","run3.gif"};
	
	MyFrame(){
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Field field = new Field();
		Control control = new Control();
		this.add(field, BorderLayout.CENTER);
		this.add(control, BorderLayout.SOUTH);
		this.setBounds(1200,100,500,500);
		this.setVisible(true);
		Thread thread = new Thread(field);
		thread.start();
		
		
	}
	
	private class Field extends JPanel implements Runnable{
		@Override
		public void run() {
			while (true) {
				String[] path = stn;
									
					for (int i = 0; i< path.length; i++) {
							lb1.setIcon(new ImageIcon("./src/"+ path[i] ) );	
							try {
								Thread.sleep(300);
							} catch (InterruptedException e) {
								
							}
				
				}
				
		
			}
			
		}
		JLabel lb1;
		Field() {
			this.setLayout(new BorderLayout());
			lb1 = new JLabel();
			lb1.setIcon(new ImageIcon("./src/stand.gif"));
			this.add(lb1, BorderLayout.CENTER);
		}
		
	}
	private class Control extends JPanel implements ActionListener{
	
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==standingBtn) {
				
			}else if(e.getSource()==walkingBtn) {
				
				
			}else if(e.getSource()==runningBtn) {
				
			}
			
			
		}
		private JButton standingBtn, walkingBtn, runningBtn;
		public Control() {
			this.setLayout(new FlowLayout());
			
			standingBtn = new  JButton("Standing");
			walkingBtn = new JButton("Walking");
			runningBtn = new JButton("Running");
			
			standingBtn.addActionListener(this);
			walkingBtn.addActionListener(this);
			runningBtn.addActionListener(this);
			this.add(standingBtn);
			this.add(walkingBtn);
			this.add(runningBtn);
			
				
		}
	}		
public static void main(String[] ar) {
	new MyFrame();
	
}
}
