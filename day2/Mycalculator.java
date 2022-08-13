package week1.day2;

public class Mycalculator {
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
