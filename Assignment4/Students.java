package Assignment4;

public class Students {
	public static void main(String[] args) {
		Students st=new Students();
		st.getStudentInfo(1234);
		st.getStudentInfo(1244, "Testname");
		st.getStudentInfo(90012330, "Testemail@gamil.com");
		
	}

	
		
		public void getStudentInfo(int id)
		{
			System.out.println(id);
		}
		
		public void getStudentInfo(int id , String name)
		{
			System.out.println(id+ "  " + name);
		}
		
	
		public void getStudentInfo(double phone, String email)
		{
			System.out.println(phone+"  " +email);
		}
}
