package Week3.day2;

public class Singlenum {

	public static void main(String[] args) {
		int[] Arr= {4,1,2,1,2}; 
		//1,2,1,2

		int leng=Arr.length;
		int i,j,k;

		for (i=0; i<leng; i++ )
		{
			k=0;
			for(j=1; j<leng; j++)
			{
				if(Arr[i]==Arr[j])
				{
					k++;
				}
			}
			if (k==0)
			{
				System.out.println(Arr[i]);	 
			}
		}

	}
}
