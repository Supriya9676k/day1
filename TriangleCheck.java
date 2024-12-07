import java.util.*;
class TriangleCheck{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if((a==b)&&(b==c))
		{
			System.out.println("Valid Triangle");
		}
		else
		{
			System.out.println("InValid Triangle");

		}
		
}
}
