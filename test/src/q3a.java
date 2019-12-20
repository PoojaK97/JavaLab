import java.util.Scanner;

class NameNotCorrect extends Exception{
	private static final long serialVersionUID = -8926676391842626697L;
	public String toString()
	{
		return("Name Not Correct");
	}
}
class AgeLimitException extends Exception{
	private static final long serialVersionUID = -5905555464719582453L;
	public String toString()
	{
		return("Age Limit Exception");
	}
}
class emp{
	int age;
	String name;
	emp(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
public class q3a{
	public static void main(String Args[])
	{
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("ËNTER NAME :");
		String name=input.next();
		System.out.println("ËNTER AGE :");
		int age=input.nextInt();
		int k=1, c=1;
		try{
			try{
				int s=Integer.parseInt(name);
			}
			catch(Exception e)
			{
				k=0;
			}
			if(k==1)
			{
				throw new NameNotCorrect();
			}
		}
		catch(NameNotCorrect e)
		{
			c=0;
			e.printStackTrace();
		}
		
		try{
			if(age>50)
				throw new AgeLimitException();
			
		}
		catch(AgeLimitException e)
		{
			c=0;
			e.printStackTrace();
		}
		if(c==1)
		{
			emp obj=new emp(name,age);
			System.out.println("Object created ");
			System.out.println("Name: "+obj.name);
			System.out.println("Age: "+obj.age);
		}
		else
			System.out.println("Object not created ");
	}

}