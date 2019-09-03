import java.util.Scanner;
class Exp extends Exception
{
	public String toString()
	{
		return "oops...Enter the correct word";
	}
}
public class HelloExp {
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		String str;
		try
		{
			System.out.println("\n Enter the word: ");
			str=s.next();
			if(str.compareTo("hello")==0)
				throw new Exp();
		}
		catch(Exp e)
		{
			System.out.println(e);
		}
		
			
	}
		
}


