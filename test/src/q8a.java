class T
{
  boolean flag=true;
  int n;
  
  synchronized void put(int n)
  {
	while(!flag)
	{
	  try
	  {
		Thread.sleep(1000);  
		wait();  
	  }
	  catch(InterruptedException e)
	  {
		  
	  }
	}
	System.out.println("Put:"+n);
	this.n=n;
	flag=false;
	notify();
  }
  
  synchronized void get()
  {
	while(flag)
	{
	  try
	  {
		Thread.sleep(1000);  
		wait();  
	  }
	  catch(InterruptedException e)
	  {
		  
	  }
	}
	System.out.println("Get:"+n);
	flag=true;
	notify();
  }
}

class Producer extends Thread
{
  T t;
  Producer(T t)
  {
	this.t=t;  
  }
  public void run()
  {
	int i=0;  
	while(true)
	t.put(++i);
  }
}

class Consumer extends Thread
{
  T t;
  Consumer(T t)
  {
	this.t=t;  
  }
  public void run()
  {
	while(true)
	t.get();	
  }
}

public class q8a
{
  public static void main(String args[])
  {
    T t=new T();
    Producer t1=new Producer(t);
    Consumer t2=new Consumer(t);
  
    t1.start();
    t2.start();
    
    try
    {
      t1.join();
      t2.join();
    }
    catch(InterruptedException e)
    {
	  
    }
  }
}