
	import student.Student;
	import faculty.Faculty;

	public class q2a {

		public static void main(String[] args) {
			
			Student s1=new Student();
			s1.student_getval(1234,"Pooja", 99, 99, 100, 9.9);
			s1.student_disp();
			Faculty f1=new Faculty();
			f1.faculty_getval(23, "xyz", "proffessor", 5);
			f1.faculty_disp();

		}

	}
