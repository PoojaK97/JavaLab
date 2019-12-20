import java.util.Scanner;

public class q11a {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int count=0;
	System.out.println("ENTER THE STRING :");
	String s =input.nextLine();
	s=s.toUpperCase();
	s=s.replaceAll(" ","");
	for(int i=0;i<s.length()-1;i++)
	{
		char c=s.charAt(i);
		char d=s.charAt(i+1);
		if(c==d)
			count++;
		
	}
	System.out.println("COUNT:"+count);
	}

}
