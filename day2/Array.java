package week1.day2;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int[] numbers = {22,67,98,1,34,58,99};
		Arrays.sort(numbers);
		int length = numbers.length;	
		System.out.println(numbers[length-2]);

	}

}
