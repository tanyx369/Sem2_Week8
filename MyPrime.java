import java.util.*;

public class MyPrime 
{

	  Scanner input = new Scanner(System.in);
	  static String result;
	  
	  public void AskInput() {
		  System.out.println("Enter a number: ");
		  result = input.nextLine();
		  
	  }
	  
      // method to calculate and display prime number with a given parameter
	  public void isPrime(int number) 
	  {
		  int x = 0;  
		 
		  
		  for (x = 2; x < Integer.parseInt(result); x++ ) {
			  int condition1 = x % 3;
			  int condition2 = x % 2;
			  
			  if (x == 2) {
				  System.out.println(x);
			  }
			  else if (x == 3) {
				  System.out.println(x);
			  }
			  else if (condition1 != 0 && condition2 != 0) {
				  System.out.println(x);
				  continue;
			  }
			 
		  }
		
		  System.out.println(result);
		 
	   
	  }
	  
	  public static void main(String[] args) {
		  
		  MyPrime p1 = new MyPrime();
		  p1.AskInput();
		  p1.isPrime(Integer.parseInt(result));
	  }

}
