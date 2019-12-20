package student;

public class Student {
	
	int USN;
	String DeptName;
	float m1,m2,m3;
	double sgpa;
	
	public Student()
	{
	}
	
	public void student_getval(int usn,String d,float m1,float m2,float m3,double sgpa)
	{
		this.USN=usn;
		this.DeptName=d;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.sgpa=sgpa;	
	}
	
	public void student_disp()
	{
		System.out.println("USN : "+USN+"DEPT : "+DeptName+" M1,M2,M3 : "+m1+","+m2+","+m3+" sgpa: "+sgpa);
	}

}
