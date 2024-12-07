import java.util.*;
import java.util.regex.*;
class CharacterType{
	public static void main(String[] args)
	{
		 String a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		
		if(Pattern.matches("[a-zA-z]",a))
		{
			System.out.println("Alphabet");
		}
		else if(Pattern.matches("[0-9]",a))
		{
			System.out.println("Number");

		}
		else
		{
			System.out.println("SpecialCharacter");

		}
		
}
}
