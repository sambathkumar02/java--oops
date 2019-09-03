import java.util.Scanner;
class AgeNotWithinRangeException extends Exception
{
	public String toString()
	{
		return "Enetr age between 25 and 65";
	}
	
}
class NameNotValidException extends Exception
{
	public String toString()
	{
		return "Name not valid\n Enter correct name:";
	}
	
}
class Doctor
{
	Scanner s=new Scanner(System.in);
	String id,name,dept;
	int age;
	int isalpha(char c)
	{
		if((c>='a'&& c<='z')||(c>='A' && c<='Z'))
			return 1;
		else 
			return 0;
	}
	void get()
	{
		System.out.println("\n Enter details:\n Enter Id and department:");
		id=s.next();
		dept=s.next();
		try
		{
			
		System.out.println("\n Enter name:");
		name=s.next();
		for(int i=0;i<name.length();i++)
		{
			char a=name.charAt(i);
			if((isalpha(a))==0)
				throw new NameNotValidException();
		}
		System.out.println("\n Enter age:");
		age=s.nextInt();
		if((age<25)||(age>65))
			throw new AgeNotWithinRangeException();
	}
		catch(AgeNotWithinRangeException e)
		{
			while(age>25 && age>65)
			{
				System.out.println(e);
				age=s.nextInt();
			}
		}
		catch(NameNotValidException e)
		{
			for(int i=0;i<name.length();i++)
			{
				char a=name.charAt(i);
				if((isalpha(a))==0)
				{
					System.out.println(e);
					name=s.next();
				}
				
			}
			
		}
	
		
		
}
	void display()
	{
		System.out.println("\n -----Details--------");
		System.out.println("\nNAME:"+name);
		System.out.println("\nID:"+id);
		System.out.println("\nAGE"+age);
		System.out.println("\nDEPARTMENT:"+dept);
		System.out.println("\n-----thank u---------");
		
	}
}


	
public class DocExp {
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		Doctor d=new Doctor();
		d.get();
		d.display();
	}

}
