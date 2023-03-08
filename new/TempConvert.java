import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class TempConvert extends JFrame implements ActionListener
{
	double input;
	double result;
	JLabel label = new JLabel("Please enter reading in Celcius: ");
	JTextField field = new JTextField();
	JButton button = new JButton("Submit");
	
	TempConvert(){
		//this.setSize(300, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLayout(new BorderLayout(0, 10));
		
		field.setPreferredSize(new Dimension(300,50));
		
		button.addActionListener(this);
		
	
	//	this.setLayout(new FlowLayout());
		this.add(label, BorderLayout.NORTH );
		this.add(field, BorderLayout.CENTER);
		this.add(button, BorderLayout.SOUTH);
		this.pack();
		this.setVisible(true);
	}
	
	public void cal() {
		result = (input *(9/5) + 32);
	}
	
	/*
	public void newFrame() {
		JFrame frame = new JFrame();
	}
	*/
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JButton exit = new JButton("Exit");
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
			
		});
		

		JButton button_r = new JButton("Return");
		button_r.addActionListener(new status());
		
		if(! field.getText().isEmpty()) {
			input = Double.parseDouble(field.getText());
			label.setText("Conversion result: ");
			cal();
			//field.setEnabled(false);
			field.setText(input + "Celcius = " + result + "Ferenhite");
			field.setEditable(false);
			button.setVisible(false);
			panel.add(button_r);
			panel.add(exit);
			this.add(panel, BorderLayout.SOUTH);
			this.setVisible(true);
			/*
			this.add(exit, BorderLayout.SOUTH);
			this.add(button_r, BorderLayout.SOUTH);
			*/
		}
		
	}
	
	
	private class status implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new TempConvert();
		}
		
	}
	
	public static void main(String[] args) {
		new TempConvert();
	}
    
}
