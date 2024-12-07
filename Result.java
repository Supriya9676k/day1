import java.util.*;
class Result{
	public static void main(String[] args)
	{
		int marks;
		Scanner sc=new Scanner(System.in);
		marks=sc.nextInt();
		if(marks<35)
		{
			System.out.println("Fail");
	    }
	     else if(marks>35)
	     {
			System.out.println("Pass");
	     }
}
}
