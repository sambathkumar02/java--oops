import java.util.Scanner;
abstract class Shape
{
	int data1,data2;
	abstract void printArea();
}
class Circle extends Shape

{
	Scanner s=new Scanner(System.in);
	void printArea()
	{
		double area;
		System.out.println("Enter the radius of circle:");
		data1=s.nextInt();
		area=3.14*data1*data1;
		System.out.println("AREA:"+area+"sq.units");
		
	}
}

class Triangle extends Shape
{
	Scanner s=new Scanner(System.in);
	void printArea()
	{
		double area;
		System.out.println("Enter the base of triangle:");
		data1=s.nextInt();
		System.out.println("Enter the height of triangle:");
		data2=s.nextInt();
		area=0.5*data1*data2;
		System.out.println("AREA:"+area+"sq.units");
		
	}
	
}

class Rectangle extends Shape
{
	Scanner s=new Scanner(System.in);
	void printArea()
	{
		double area;
		System.out.println("Enter the length of rectangle:");
		data1=s.nextInt();
		System.out.println("Enter the breadth of rectangle:");
		data2=s.nextInt();
		area=data1*data2;
		System.out.println("AREA:"+area+"sq.units");
		 
	}
	
}
public class CalculateArea {
	public static void main(String []args)
	{
		int opt;
		Scanner s=new Scanner(System.in);
		Triangle t=new Triangle();
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Shape ref;
		do
		{
		System.out.println("*******AREA OF SHAPES ********");
		System.out.println("1.circle \n 2.rectangle \n3.triangle \n4.exit");
		System.out.println("Enter your option:");
		opt=s.nextInt();
		switch(opt)
		{
		case 1:ref=c;ref.printArea();break;
		case 2:ref=r;ref.printArea();break;
		case 3:ref=t;ref.printArea();break;
		case 4:break;
		default:
		}
		}while(opt!=4);
		
	}

}
