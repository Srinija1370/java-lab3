import java.util.*;
class strcmp{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string1: ");
		String s1=sc.next();
		System.out.println("enter string2: ");
		String s2=sc.next();
		int x=s1.compareTo(s2);     
		if(x>0)
			System.out.println("s1 is lexographically greater than s2");
		else if(x<0)
			System.out.println("s1 is lexographically lesser than s2 ");
		else
			System.out.println("s1 is equal to s2");
	}
}
