import java.util.*;
import java.util.regex.*;
class PasswordChecker{
	public static void main(String[] args)
	{
		 String a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		
		if((Pattern.matches("[a-zA-z]",a))&&(Pattern.matches("[0-9]",a))&&(Pattern.matches("[!@#$%^&*]",a)))
		{
			System.out.println("Strong Password");
		}
		else
		{
			System.out.println("Weak Password");

		}
		
}
}
