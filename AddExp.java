import java.util.Scanner;
class Add extends Exception
{
	public String toString()
	{
		return " oops Enter input less than 10";
		
	}
}
public class AddExp {
	public static void main(String []args)
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		try
		{
		System.out.println("\n ENter the two numbers:");
		a=s.nextInt();
		b=s.nextInt();
		if((a>=10) | (b>=10))
			throw new Add();
		}
		catch(Add e)
		{
			System.out.println(e);
			
		}
		
		
	}

}
