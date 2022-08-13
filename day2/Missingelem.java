package week1.day2;

import java.util.Arrays;

public class Missingelem {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,7,6,8};		
		int length = arr1.length;
		Arrays.sort(arr1);
		for(int i=arr1[0]; i<length; i++)
		{
			if (i!=arr1[i-1])
			{
				System.out.println(i);
				break;
			}
		}
	}

}
