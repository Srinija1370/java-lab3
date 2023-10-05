import java.util.*;
class index{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string: ");
		String s1=sc.nextLine();
		System.out.println("enter string: ");
		String s2=sc.next();
		int ind=0,c=0;
		//int  i=s1.indexOf(s2);
		/*if(i==0)
		{
			c++;
			System.out.println(i);
		}*/
		while(ind>-1)
		{	
			c++;
			ind=s1.indexOf(s2,ind);
			System.out.println(ind);
			ind=ind+1;
		}
		System.out.println("Total number of occurances of alphabet: "+c);
	}
}
