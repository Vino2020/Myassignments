package week1.day2;

public class Calculator {

	public int addNumbers(int a, int b, int c)
	{
		int d = a+b+c;
		return d;
	}

	public int subNumbers(int a, int b)
	{
		int c =a-b;
		return c;	
	}
	public double mulNumbers(double a, double b)	
	{
		double c=a*b;
		return c;
	}

	public float divNumbers(float a, float b)
	{
		float c=a/b;
		return c;
	}
	public static void main(String[] args) {

		Calculator obj1 = new Calculator();
		int add = obj1.addNumbers(30, 20, 60);
		System.out.println(add);
		int sub = obj1.subNumbers(20, 60);
		System.out.println(sub);
		double mul =obj1.mulNumbers(300, 400);
		System.out.println(mul);
		float div =obj1.divNumbers(29.99f, 30.77f);
		System.out.println(div);

	}	

}

