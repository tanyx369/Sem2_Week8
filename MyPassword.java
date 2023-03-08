import java.util.Scanner;

public class MyPassword 
{
	Scanner input = new Scanner(System.in);
	String result;
	String[] split ;
	
	public MyPassword()
	{
		
	}
	
	public void Askinput()
	{
		System.out.println("Please enter your password for validation: ");
		result = input.nextLine();
		split = result.split("");
		
		
	}
	
	public String getinput() {
		return result;
	}
	
	
	public boolean validSize(String password)
	{
		System.out.println("Validating Size ......");
		if (password.length() >= 10) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean isNumeric(String in) {
		
		int intValue;
		try {
			intValue = Integer.parseInt(in);
			return true;
		}
		catch(NumberFormatException e) {
			return false;
		}
	}
	
	public boolean validCombination(String password)
	{
		
		System.out.println("Validating Combination ......");
		boolean outcome = true;
		
		for (int x = 0 ; x < split.length; x++) {
			
			if (split[x].matches("[a-zA-Z]+") || isNumeric(split[x])) {
				outcome = true;
			}
			else {
				outcome = false;
				break;
			}
			
			
			
		}
		
		return outcome;
	
	}
	
	
	
	public boolean validNumber(String password)
	{
		System.out.println("Validating Number......");
		int times = 0;
		
		for(int y = 0; y < result.length(); y++) {
			
			if (isNumeric(split[y])) {
				times ++;
			}
			
		}
		
		if (times >= 3) {
			return true;
		}
		else {
			return false;
		}
	
	}
	
	
	public static void main(String[] args) {
		MyPassword p1 = new MyPassword();
		p1.Askinput();
		//p1.validSize(p1.getinput());
		
		//p1.validCombination(p1.getinput());
		//p1.validNumber(p1.getinput());
		
		if(p1.validSize(p1.getinput()) && p1.validCombination(p1.getinput()) && p1.validNumber(p1.getinput())) {
			System.out.println("Password is Good");
		}
		else {
			System.out.println("Password is Bad");
		}
	}
}

