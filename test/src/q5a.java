class Prime
{
  void displayPrime(int n)
  { 
	 if(n<=1)
	 return;	 
	 else if(n==2||n==3)
     System.out.println(n);
	 else if(n%2==0)
	 return; 
     else
     {
       int i;
       boolean p=true;
       
       for(i=3;i<n;i+=2)
       if(n%i==0)
       {
    	 p=false;
    	 break;
       }
       
       if(p)
       System.out.println(n);	   
     }
  }
}

class Thread1 extends Thread
{ 
  Prime p;
  Thread1(Prime p)
  {
	this.p=p;  
  }
  public void run()
  { 
	synchronized(p)
	{
	int i;
	
	System.out.println("Thread 1: Prime Nos 1-100");
    for(i=1;i<=100;++i)
    p.displayPrime(i);
	}
  }
}

class Thread2 extends Thread
{
   Prime p;
   Thread2(Prime p)
   {
	 this.p=p;  
   }
   public void run()
   { 
	  synchronized(p)
	  {
        int i;
		
	    System.out.println("Thread 2: Prime Nos 101-200");
	    for(i=101;i<=200;++i)
	    p.displayPrime(i);	
	  }
   }	
}

public class q5a 
{
  public static void main(String args[])
  {
	Prime p=new Prime();
	
	Thread1 t1=new Thread1(p);
	Thread t2=new Thread2(p);
	
	t1.start();
	t2.start();
	
	try
	{
	  t1.join();
	  t2.join();
	}
	catch(InterruptedException e)
	{
	  System.out.println("Error");	
	}
  }
}