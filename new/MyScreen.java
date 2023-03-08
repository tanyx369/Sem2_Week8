import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.Random;



public class MyScreen extends JComponent implements ActionListener
{
	
	Random rand = new Random();
	
	
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		
		for(int i = 100; i >= 0 ; i --) {
			
			int x = rand.nextInt(500);
			int y = rand.nextInt(500);
			int width = rand.nextInt(500);
			int height = rand.nextInt(500);
			
			
			g2.drawLine(x, y, width, height);
			g2.drawRect(x, y, width, height);
			
			if(i == 0 ) {
				
				Timer time = new Timer(100 , this);
				time.start();
			}
				
		}
		
	
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		removeAll();
		repaint();
		
	}
	

	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyScreen m = new MyScreen();
		
		
		frame.add(m);
		frame.setVisible(true);
		
	}


	
	
    
}
