import java.util.*;
class  substr{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string: ");
		String s1=sc.nextLine();
		System.out.println("enter substring: ");
		String s2=sc.nextLine();
		int flag=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.startsWith(s2,i))
			{
				flag=1;
				System.out.println("found");
				break;
			}
		}
		if(flag==0)
			System.out.println("not found");
	}	
	}
		
