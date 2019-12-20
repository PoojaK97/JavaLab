package faculty;

public class Faculty {
	
	int staffid;
	String staffname;
	String design;
	int nosubj;
	
	public Faculty()
	{
	}
	
	public void faculty_getval(int staffid,String name,String desig,int subj)
	{
		this.staffid=staffid;
		this.staffname=name;
		this.design=desig;
		this.nosubj=subj;
	}
	
	public void faculty_disp()
	{
		System.out.println("STAFF ID : "+staffid+"Staffname : "+staffname+" designation: "+design+" no of subjects taught : "+nosubj);
	}

}