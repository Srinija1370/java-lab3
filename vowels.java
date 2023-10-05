import java.util.*;
class  vowels{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string: ");
		String s=sc.nextLine();
		int v=0,c=0;
		System.out.println("vowels: ");
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ||s.charAt(i)=='A' ||s.charAt(i)=='I' ||s.charAt(i)=='E' ||s.charAt(i)=='O' ||s.charAt(i)=='U' )
			{
				System.out.println(s.charAt(i));
				v++;
			}
			else
			{
				c++;
			}
		}
		System.out.println("Number of vowels: "+v);
		System.out.println("Number of consonants: "+c);
	}
}
