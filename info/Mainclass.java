package bank.info;

public class Mainclass {

	public static void main(String[] args) {
		
		Bankinfo bi=new Bankinfo();
		Axisbank ax= new Axisbank();
		
	bi.depBlc();
	bi.fixedDep();
	bi.savingInfo();
	System.out.println(    );
	
	ax.depBlc();
	ax.fixedDep();
	ax.savingInfo();
	ax.ourdepBlc();
	}
}
