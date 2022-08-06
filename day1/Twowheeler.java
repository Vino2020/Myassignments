package week1.day1;

public class Twowheeler {

		public int noOfWheels = 2;
		public short noOfMirrors = 1;
		public long chassisNumber = 2000;
		public boolean isPunctured = false;
		public String bikeName = "Honda";
		public double runningKM = 200;
		
public static void main(String[] args)
{
Twowheeler asg1 = new Twowheeler();
System.out.println(asg1.noOfWheels);
System.out.println(asg1.noOfMirrors);
System.out.println(asg1.chassisNumber);
System.out.println(asg1.isPunctured);
System.out.println(asg1.bikeName);
System.out.println(asg1.runningKM);
}
}