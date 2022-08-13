package week1.day2;

public class Intersection {

	public static void main(String[] args) {

		int arr[]={3,2,11,4,6,7};
		int arr3[]={1,2,8,4,9,7};

		int len1 = arr.length;
		int len2 = arr3.length;
		int i;
		//int j;

		for (i=0;i<len1; i++)

		for (int j=0; j<len2; j++)
		{	
			if(arr[i]==arr3[j])
			{
				System.out.println(arr[i]);	
				//System.out.println(len1);
				
			}
		}
	}
}
