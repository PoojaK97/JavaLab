import java.util.Scanner;

class AgeOutOfRangeException extends Exception
{
	private static final long serialVersionUID = 1L;

	public String toString()
	{
		return ("Age is greater than 25 exception");
	}
	
}

class LowCgpaException extends Exception
{
	private static final long serialVersionUID = 1L;

	public String toString()
	{
		return ("CGPA is below 8 exception");
	}
}


public class q6a {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter age :");
		int age=input.nextInt();
		System.out.println("Enter CGPA :");
		float cgpa=input.nextFloat();
		
		try{
			if(age>25)
			{
				throw new AgeOutOfRangeException();
			}
			try
			{
				if(cgpa<8)
				{
					throw new LowCgpaException(); 	
				}
				System.out.println("Application accepted ");
			}
			catch(LowCgpaException e)
			{
				System.out.println(e);
			}
		}
		
		catch(AgeOutOfRangeException e)
		{
			System.out.println(e);
		}
	}
}