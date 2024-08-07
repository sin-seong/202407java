package swing;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class MyFrame {
	public static void main(String[] ar) {
		new MouseLisnerEX();
	}
}

class MouseLisnerEX extends JFrame{
	JPanel jp = new JPanel();
	JLabel la = new JLabel("No Mouse Event");
	
	MouseLisnerEX() {
		this.setContentPane(jp);  //판위에 뒤덮고 그위에 la 를 출력
		jp.add(la);
		this.setSize(300, 400);  //사이즈 크기
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jp.addMouseListener(new MyMouseLisner());
		jp.addMouseMotionListener(new MyMouseLisner());
	}
	class MyMouseLisner implements MouseListener, MouseMotionListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			la.setText("("+ e.getX() + "," + e.getY() + ")" );
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("("+ e.getX() + ","+ e.getY() + ")" );
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("("+ e.getX() + ","+ e.getY() + ")" );
	
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			jp.setBackground(Color.magenta);
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			jp.setBackground(Color.ORANGE);
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("("+ e.getX() + ","+ e.getY() + ")" );
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("("+ e.getX() + ","+ e.getY() + ")" );
			
		}
		
	}
}
