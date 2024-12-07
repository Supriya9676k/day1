import java.util.*;
class Polarity{
	public static void main(String[] args)
	{
		int value;
		Scanner sc=new Scanner(System.in);
		value=sc.nextInt();
		if(value>0)
		{
			System.out.println("+ve");
		}
		else if(value<0)
		{
			System.out.println("-ve");

		}
		else
		{
			System.out.println("Zero");

		}
		
}
}
