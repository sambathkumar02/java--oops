import java.util.*;

class First extends Thread
{
	
	public synchronized  void run()
	{
		Random r=new Random();
		int a;
		a=r.nextInt(100);
		System.out.println("\n"+a);
		Second s=new Second(a);
		Third t=new Third(a);
		if(a%2==0)
			s.start();
		else 
			t.start();
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("\n deos nt wait..");
		}
	}
	
}
class Second extends Thread
{
	int c;
	Second(int a)
	{
		c=a;
		
	}
	public synchronized void run()
	{
		System.out.println("\n The Square is:"+c*c);
		
	}
	
}
class Third extends Thread
{
	int c;
	Third(int a)
	{
		c=a;
		
	}
	public synchronized  void run()
	{
		System.out.println("\n The cube is:"+c*c*c);
		
	}
	
}
public class MultiThread {
	public static  void main(String []args)
	{
		for(int i=0;i<5;i++)
		{
			First f=new First();
			f.start();
			try
			{
			f.join();
			}
			catch(Exception e)
			{
				System.out.println("\n error...");
			}
		}
	}

}
