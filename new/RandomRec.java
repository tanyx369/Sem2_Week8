import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.Timer;

public class RandomRec extends JComponent
{
	Random rand = new Random();
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
			
		int q = rand.nextInt(10);
		for(int i = q ; i > 0; i--) {
			
			int stroke = rand.nextInt(20);
			
			int x = rand.nextInt(500);
			int y = rand.nextInt(500);
			int width = rand.nextInt(300);
			int height = rand.nextInt(300);
			
			int r = rand.nextInt(255);
	    	int green = rand.nextInt(255);
	    	int b = rand.nextInt(255);
			
			g2.setColor(new Color(r , green ,b));
			g2.setStroke(new BasicStroke(stroke));
			g2.drawRect(x, y, width, height);
		}
				
		
	}
		
	public static void main(String[] args) {
	
		JFrame frame = new JFrame();
		frame.setSize(500 ,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		RandomRec r = new RandomRec();
		
		frame.add(r);
		frame.setResizable(false);
		frame.setVisible(true);
		
	}
	
    
}
