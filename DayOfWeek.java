import java.util.*;
class DayOfWeek{
	public static void main(String[] args)
	{
		int h,q,m,K,J;
		Scanner sc=new Scanner(System.in);
		q=sc.nextInt();
		m=sc.nextInt();
		if(m>12)
		m=m-12;
		K=sc.nextInt();
		if(K>100)
		K=K%100;
		J=sc.nextInt();
		if(J>100)
		J=J%100;
		h=(q+((13*(m+1))/5)+K+(K/4)+(J/4)-(2*J))%7;
		switch (h)
		{	
		case 1:
		System.out.println("Monday");
		break;
		case 2:
		System.out.println("Tuesday");
		break;
		case 3:
		System.out.println("Wednesday");
		break;
		case 4:
		System.out.println("Thursday");
		break;
		case 5:
		System.out.println("Fidayday");
		break;
		case 6:
		System.out.println("Saturday");
		break;
		case 7:
		System.out.println("Sunday");
		break;
	}
		
}
}
