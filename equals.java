import java.util.*;
class equals{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string1: ");
		String s1=sc.next();
		System.out.println("enter string2: ");
		String s2=sc.next();
		boolean x=s1.equals(s2);
		if(x==true)
			System.out.println("strings are equal ");
		else
			System.out.println("strings are not equal");
		boolean y=s1.equalsIgnoreCase(s2);
		if(y==true)
			System.out.println("strings are equal by ignoring case ");
		else
			System.out.println("strings are not equal even  ignoring case");
	}
}
