public class MyFan 
{
	int speed = 0;
	String color;
	double radius;
	boolean state;
	
	String real_speed = "SLOW";
	String real_state = "off";
	
    //constuctor to initialise the variable
	  public MyFan() 
	  {
		 this.speed = 1;
		 this.color = "red";
		 this.radius = 5 ;
		 this.state = false;
	  }
	
	 //methods that needed to complete this question
	  public void setSpeed(int num) {
		  
		  
		  if (num == 1) {
			  real_speed = "SLOW";
		  }
		  else if (num == 2) {
			  real_speed = "MEDIUM";
		  }
		  else if (num == 3) {
			  real_speed = "FAST";
		  }
		  
	  }
	  
	  public void setColor(String colour) {
		  
		  this.color = colour;
		  
	  }
	  
	  public void setRadius(double radius) {
		  
		  this.radius = radius;
	  }
	  
	  public void setState(String stated) {
		  
		  
		  if(stated == "on") {
			  real_state = "on";
			  state = true;
		  }
		  else if (stated == "off") {
			  real_state = "off";
			  state = false;
		  }
		  
	  }
	  
	  
     public String getSpeed() {
		  
		  return real_speed;
		  
	  }
	  
	  public String getColor() {
		  
		  return this.color;
		  
	  }
	  
	  public double getRadius() {
		  
		  return this.radius;
	  }
	  
	  public String getState() {
		  
		  return real_state;
		  
	
	  }
	  
	  
	  
	  
	  public static void main(String[] args) {
		  
		  MyFan f1 = new MyFan();
		  MyFan f2 = new MyFan();
		  
		  f1.setSpeed(2);
		  f1.setState("on");
		  System.out.println("speed: " + f1.getSpeed());
		  System.out.println("color: " + f1.getColor());
		  System.out.println("radius: " + f1.getRadius());
		  System.out.println("speed: " + f1.getState());
		  
		  
		  System.out.println("speed: " + f2.getSpeed());
		  System.out.println("color: " + f2.getColor());
		  System.out.println("radius: " + f2.getRadius());
		  System.out.println("speed: " + f2.getState());
	  }
	  
	  

}
