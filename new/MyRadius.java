import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;


public class MyRadius extends JFrame implements MouseListener
{
	
	MyRadius(){
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.addMouseListener(this);
		//this.setLayout(null);
		this.setVisible(true);
	
	}
	
	circle c = new circle();
	int count = 0;
	@Override
	public void mouseClicked(MouseEvent e) {
		
	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		count++;
		//System.out.println("Hello world");
		if (count%2 == 0) {
			c.setX2(e.getX());
			c.setY2(e.getY());
			System.out.println(c.x2);
			System.out.println(c.y2);
			if(count>2) {
				c.redraw(true);
			}
			this.add(c);
			this.setVisible(true);
			System.out.println(c.getLocationOnScreen());
		}
		else {
			c.setX1(e.getX());
			c.setY1(e.getY());
			System.out.println(c.x1);
			System.out.println(c.y1);
		}
		
	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	class circle extends JComponent{
		
		int x1;
		int y1;
		int x2;
		int y2;
		double radius;
		
		public void setX1(int x) {
			this.x1 = x;
		}
		
		public void setY1(int y) {
			this.y1 = y;
		}
		
		public void setX2(int x) {
			this.x2 = x;
		}
		
		public void setY2(int y) {
			this.y2 = y;
		}
		
		public void cal() {
			radius = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );
		}
		
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			cal();
			Ellipse2D.Double e = new Ellipse2D.Double((x1-radius) , (y1-radius) , (radius*2) , (radius*2));
			Rectangle r = new Rectangle(((int)(x1-radius)), ((int)(y1-radius)) , ((int)(radius*2)), ((int)(radius*2)));
			//g2.drawOval((x1- (int) radius),(y1-(int) radius) , (int) radius , (int) radius );
			g2.drawLine(x1, y1, x2, y2);
			g2.draw(e);
			g2.draw(r);
			
		}
		
		public void redraw(boolean status) {
			if(status == true) {
				repaint();
			}
		}
	}

	public static void main(String[] args) {
		new MyRadius();
	}
	
}
