package week1.day2;

public class Car {

	public void printCarBrand() {
		System.out.println("BMW");
	}
	public String getCarColor() {
		return("blue");
	}
	public int getEngineNum() 
	{
		return (45678);
	}
	public int getSub(int a, int b)
	{
		int c= a-b;
		return c;
	}
	public int getMul(int a, int b)
	{
		int c= a*b;
		return c;
	}
	public int getCal(int a, int b)
	{
		int c= a/b;
		return c;
	}
	
	public static void main(String[] args) {
		Car obj= new Car();
		obj.printCarBrand();
		String color = obj.getCarColor();
		System.out.println(color);
		int eng =obj.getEngineNum();
		System.out.println(eng);
		int sub= obj.getSub(100, 50);
		System.out.println(sub);
		int mul= obj.getMul(20, 30);
		System.out.println(mul);
		int div= obj.getCal(100, 20);
		System.out.println(div);
	}
}
