import java.util.Scanner;
public class MyPalindrome 
{
	
	Scanner input = new Scanner(System.in);
	static int result;
	public void AskInput() {
		System.out.println("Enter a positive integer: ");
		result = input.nextInt();
	}
	
    //check if is a palindrome
    public void isPalindrome(int number) 
    {
    	String keep = String.valueOf(result);
    	String collect = "";
    	for (int x = keep.length() - 1; x >= 0;x--) {                 // .length() 是造着从一开始算 length , 和index 不同
    		collect += keep.charAt(x);           
    	}
    	
    	if (keep.equals(collect)) {
    		System.out.println(keep + " is a palindrome");
    	}
    	else {
    		System.out.println(keep + " is not a palindrome");
    	}
    	
    	
   
    }
    
    //reverse a number for palindrome checking
    /*public int reverse(int number) 
    {
    
    }*/
    
    
    public static void main(String[] args) {
    	
    	MyPalindrome p1 = new MyPalindrome();
    	p1.AskInput();
    	p1.isPalindrome(result);
    }
    
}
