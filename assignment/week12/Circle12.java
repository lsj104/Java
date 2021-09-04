import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Circle12 extends JFrame{
	private class MyPanel extends JPanel{
		private Point[] points; 
		private int count = 0;
		
		public MyPanel() {
			points = new Point[20];
			
			this.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {
					if(count < points.length) {
						points[count++] = new Point(e.getX(), e.getY());
						repaint();
					}
				}
				public void mouseReleased(MouseEvent e) {}
				public void mousePressed(MouseEvent e) {}
				public void mouseExited(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {}
				
			});
			
		}
		@Override
		protected void paintComponent(Graphics g) {
			g.setColor(Color.BLUE);
			for(int i=0; i<count; i++) {
				if (i % 3 == 0) {
					g.setColor(Color.RED);
				} else if (i % 3 == 1) {
					g.setColor(Color.GREEN);
				} else {
					g.setColor(Color.BLUE);
				}
				g.fillOval(points[i].x, points[i].y, 50, 50);
			}
		}
		
	}
	
	public Circle12() {
		setSize(400,300);
		setTitle("마우스로 원 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		
	}

	public static void main(String[] args) {
		(new Circle12()).setVisible(true);

	}

}
