class T1 extends Thread
{
  public void run()
  {
	System.out.println("Thread 1 running");  
  }
}

class T2 extends Thread
{
   public void run()
   {
	 System.out.println("Thread 2 running");  
   } 	
}

class T3 extends Thread
{
	 public void run()
	  {
		System.out.println("Thread 3 running");  
	  }	
}

class T4 extends Thread
{
	 public void run()
	  {
		System.out.println("Thread 4 running");  
	  }	
}

class T5 extends Thread
{
	 public void run()
	  {
		System.out.println("Thread 5 running");  
	  }	
}

public class q12a 
{
  public static void main(String args[])
  {
	T1 t1=new T1();
	T2 t2=new T2();
	T3 t3=new T3();
	T4 t4=new T4();
	T5 t5=new T5();
	
	t1.setPriority(10);
	t2.setPriority(9);
	t3.setPriority(8);
	t4.setPriority(7);
	t5.setPriority(6);
	
	Thread t=Thread.currentThread();
	t.setName("Parent");
	
	System.out.println(t);
	System.out.println(t1);
	System.out.println(t2);
	System.out.println(t3);
	System.out.println(t4);
	System.out.println(t5);
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();

	System.out.println(t.isAlive());
	System.out.println(t1.isAlive());
	System.out.println(t2.isAlive());
	System.out.println(t3.isAlive());
	System.out.println(t4.isAlive());
	System.out.println(t5.isAlive());
	try
	{
	  t1.join();
	  t2.join();
	  t3.join();
	  t4.join();
	  t5.join();
	}
	catch(InterruptedException e)
	{
		
	}
  }
}