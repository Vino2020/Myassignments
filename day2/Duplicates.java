package week1.day2;

public class Duplicates {
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int len=arr.length;
		int count;
		int j;
		//int k;

		for (int i=0; i< len-1; i++)
		{
			count=0;
			//k=0;
			
			for(j=i; j< len; j++)
			{
				if (arr[i]==arr[j])
				{
					count= count+1;	
				}

			}

			if (count>1)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
