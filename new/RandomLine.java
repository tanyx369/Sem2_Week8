import java.awt.Color;


import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.Random;

import javax.swing.*;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class RandomLine extends JComponent
{
    Random rand = new Random();
    
    
    
    public void paintComponent(Graphics g) {
    	
    	Graphics2D g2 = (Graphics2D) g;
    	
    	for (int i = 5 ; i > 0 ; i --) {
    		
    		int stroke = rand.nextInt(100);
    	    int x1 = rand.nextInt(500);
    	    int y1 = rand.nextInt(500);
    	    int x2 = rand.nextInt(500);
    	    int y2 = rand.nextInt(500);
    	    
    	    int r = rand.nextInt(255);
    	    int green = rand.nextInt(255);
    	    int b = rand.nextInt(255);
    	    
    	    g2.setColor(new Color(r , green ,b));
    	    g2.setStroke(new BasicStroke(stroke));
        	g2.drawLine(x1, y1, x2, y2);
        	
    	}
    	
    	
    	
    }
    
  
    public static void main(String[] args) {
    	
    	JFrame frame = new JFrame();
    	RandomLine line = new RandomLine();
    	frame.setSize(500, 500);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.add(line);
    	frame.setVisible(true);
    	
    	
    
       
    }
    

 
    
}
