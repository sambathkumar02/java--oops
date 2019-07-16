import java.util.Scanner;
class Details
{
int consumerno;
String consumer_name;
double pre;double cur;
int ctype;
double price;

void domestic()
{
	double rate,unit;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the previous month reading:");
	pre=obj.nextDouble();
	System.out.println("enter the current month reading:");
	cur=obj.nextDouble();
	unit=cur-pre;
	if(unit<=100)
	 	rate=unit*1;
	else if(unit>100 && unit<=200)
		rate=unit*2.50;
	else if(unit>200 && unit<=500)
		rate=unit*4;
	else
		rate=unit*6;
	price=rate;

}
void commercial()
{
	double rate,unit;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the previous month reading:");
	pre=obj.nextDouble();
	System.out.println("enter the current month reading:");
	cur=obj.nextDouble();
	unit=cur-pre;
	if(unit<=100)
	        rate=unit*2;
	else if(unit>100 && unit<=200)
		rate=unit*4;
	else if(unit>200 && unit<=500)
		rate=unit*6;
	else
		rate=unit*7;
	price=rate;
	
}

}

public class Eb
{
	public static void main(String []args)
	{
		Scanner obj=new Scanner(System.in);
		Details c=new Details();
		int choice;
		System.out.print("\n Welcome to Anna university electricity board");
		System.out.println("Enter the consumer name:");
		c.consumer_name=obj.next();
		System.out.println("Enter the consumer number:");
		c.consumerno=obj.nextInt();
		System.out.println("1.domestic");
		System.out.println("2.commercial");
		System.out.println("Enter your connection type: 1 0r 2:");
		choice=obj.nextInt();
		switch(choice)
		{
		case 1:
			c.domestic();
			break;
		case 2:
			c.commercial();
			break;
		default:
			System.out.println(" invalid option");
		}
		System.out.print("\n please wait your bill is processing.....");
		for(int i=0;i<=10000;i++);
		System.out.println("ANNA UNIVERSITY ELECTRICITY BOARB");
		System.out.println("**** Electricity bill****");
		System.out.println("NAME:"+ c.consumer_name);
		System.out.println("CONSUMER NUMBER:"+c.consumerno);
		System.out.println("RATE:"+ c.price);

		}
		}


