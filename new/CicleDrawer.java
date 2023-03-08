import javax.swing.*;

import java.awt.*;

import java.awt.event.*;



public class CicleDrawer extends JFrame 
{
	
	float radius;
	int x;
	int y;
	boolean status;
	
	JTextField field1;
	JTextField field2 ;
	JTextField field3;
	
	CicleDrawer(){
		
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.LEADING));
		panel2.setLayout(new FlowLayout(FlowLayout.LEADING));
		panel3.setLayout(new FlowLayout(FlowLayout.LEADING));
		panel1.setBounds(10, 10, 400,50);
		panel2.setBounds(10, 60, 400,30);
		panel3.setBounds(10, 100, 400,30);
		
		
		// Giving prompt
		JLabel label1 = new JLabel("Enter the radius for the circle: ");
		JLabel label2 = new JLabel("Enter the x-coordinate for the circle: ");
		JLabel label3 = new JLabel("Enter the y-coordinate for the circle: ");
		
		// Carry input
		field1 = new JTextField();
		field2 = new JTextField();
		field3 = new JTextField();
		// make Jpanel add text and put textfield , then set bounds on frame
		
		field1.setPreferredSize(new Dimension(150, 20));
		field2.setPreferredSize(new Dimension(150, 20));
		field3.setPreferredSize(new Dimension(150, 20));
		//field1.setCaretPosition(JTextField.BOTTOM);
		
		panel1.add(label1);
		panel1.add(field1);
		
		panel2.add(label2);
		panel2.add(field2);
		
		panel3.add(label3);
		panel3.add(field3); 
		

		
		JButton button = new JButton();
		button.setText("Sumbit");
		button.addActionListener(new ActionListener() {
			int count = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				count ++;
				check();
				if(status) {
					//System.out.println("yes");
					radius = Float.parseFloat(field1.getText());
					x = Integer.parseInt(field2.getText());
					y = Integer.parseInt(field3.getText());
					
					if(count>0) {
						new newFrame();
					}
					else {
						
					}
				}
				else {
					System.out.println("NO fill");
					
				}
				
			}
			
		});
		//button.setPreferredSize(new Dimension(50, 50 ));
		button.setBounds(250, 200 , 100, 50);
		
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		this.add(button);
		
		
		this.setVisible(true);
		
		// also can direct add label into frame
	}
	
	
	public void check() {
		
		if(field1.getText().isEmpty()) {
			status = false;
		}
		else if (field2.getText().isEmpty()) {
			status = false;
		}
		else if (field3.getText().isEmpty()) {
			status = false;
		}
		else {
			status = true;
		}
	}
	
	
	
	class Draw extends JComponent{
		
		public void setRadius(int r) {
			radius = r;
		}
		
		public void setX(int xc) {
			x = xc;
		}
		
		public void setY(int yc) {
			y = yc;
		}
		
		public void paintComponent(Graphics g) {
			
			Graphics2D g2 = (Graphics2D) g;
			g2.drawOval(x, y, (int) (radius*2), (int) (radius*2));
			
			double diameter = radius*2;
			double area = radius * Math.PI; 
			double circum = 2*Math.PI*radius;
			
			g2.drawString("Area = " + area, 0, 400);
			g2.drawString("Diameter = " + diameter, 0, 420);
			g2.drawString("Circumference = " + circum , 0, 440);
			
		}
		
			
	}
	
	
	class newFrame extends JFrame{
		
		newFrame(){
			
			this.setSize(500, 500);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Draw d = new Draw();
			
			this.add(d);
			this.setVisible(true);
			
		}
		
		
	
	}
	
    public static void main(String[] args) {
    	new CicleDrawer();
    }
}
