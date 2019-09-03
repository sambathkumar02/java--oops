import java.util.Scanner;
abstract class Stack
{
	abstract void push();
	abstract void pop();
	
}
class StackOperations extends Stack
{
	int size=10,top=-1;
	int stk[]=new int[size];
	Scanner s=new Scanner(System.in);
	void push()
	{
		if(top>=size-1)
			System.out.println("\n Stack is full..");
		else
		{
			System.out.println("\n Enter the element to be pushed:");
			int elem=s.nextInt();
			top++;
			stk[top]=elem;
			System.out.println("\n Elemnet pushed sucessfully");
			
		}
		
	}
	void pop()
	{
		if(top==-1)
			System.out.println("\n The stack is empty");
		else
		{
		System.out.println("\n The element poped :"+stk[top]);
		top--;
		}
	}
	void display()
	{
		System.out.println("\n Elements of Stack are..");
		for(int i=top;i>=0;i--)
			System.out.println("\n "+stk[i]);
	}
}
	

public class Mystack {
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		StackOperations st=new StackOperations();
		int opt;
		do
		{
		System.out.println("-----STACK OPERATIONS------");
		System.out.println("\n 1.push\n2.pop\n3.display\n4.exit");
		System.out.println("\n Enter your option:");
		opt=s.nextInt();
		switch(opt)
		{
		case 1:st.push();break;
		case 2:st.pop();break;
		case 3:st.display();break;
		case 4:System.exit(0);
		default:System.out.println("\n Enter the correct option..");
		}
		
		}while(opt!=4);		
	}

}
