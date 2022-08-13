package week1.day2;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args)
	{
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter your number" );	
		int Prime = myobj.nextInt();
		int i;
		int j=6;
		int k=7;
		for ( i=2; i<= Prime-1; ++i)

		{
			if (Prime%i==0)
			{
				System.out.println("Is not Prime");
				break;
			}

		}

		if (Prime==i)
		{
			//System.out.println("Is prime");
			
			System.out.println(++j);
			System.out.println(k++);
		}

	}

}
