package Org.system;

public class Mainclass {
	public static void main(String[] args) {
		
		Student st=new Student();
		Department dp=new Department();
		Collage cl=new Collage();
		
		st.collageCode();
		st.collageRank();
		st.collegeName();
		st.deptName();
		st.studentName();
		st.studentId();
		st.studentDept();
	System.out.println(   );	
		
		dp.collageCode();
		dp.collageRank();
		dp.collegeName();
		dp.deptName();
	System.out.println(   );	
		
		cl.collageCode();
		cl.collageRank();
		cl.collegeName();
		
	}

}
