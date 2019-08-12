import java.util.Scanner;
interface Method
{
    void create();
    void push();
    void pop();
    void display();
}
class Defenition implements Method
{
    Scanner s= new Scanner(System.in);
    int size=10,top=-1;
    int stk[]=new int[size];
    int max;
    public void create()
            {
                
                System.out.println("Enter the number of elements of stack:");
                max=s.nextInt();
                
                try
                {
                System.out.println(" Enter the elements of stack");
                for(int i=0;i<max;i++)
                {
                    System.out.println("Enter element "+(i+1));
                    stk[i]=s.nextInt();
                    top++;
                }
                System.out.println("Stack is creted sucessfully");
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Enter the correct size less than "+size);
                }
                
            }
    public void push()
    {
        int elem;
        try
        {
        
        
        System.out.println(" Enter the element to be ppushed:");
        elem=s.nextInt();
        stk[top+1]=elem;
        top++;
        System.out.println(" Element pushed sucessfully");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(" The stack is full");
        }
            
            
            
        
        
        
    }
    public void pop()
    {
        
    
        if(top==-1)
            System.out.println(" stack is empty");
        else
        {
    
        System.out.println(" The element poped is"+stk[top]);
        top--;
        }
        
    }
    public void display()
    {
         if(top==-1)
            System.out.println(" stack is empty");
        else
         {
        System.out.println(" The elements of the stack are:");
        for(int i=top;i>=0;i--)
            System.out.println("\n"+stk[i]);
         }
    }
    
}
public class Stack {
    public static void main(String args[])
    {
        int opt;
        Method m=new Defenition();
        Scanner s =new Scanner(System.in);
        do
        {
        System.out.println("**MAIN MENU \n 1.create\n 2.push \n 3.pop\n 4.display\n 5.exit");
        System.out.println(" Enter the choice:");
        opt=s.nextInt();
        switch(opt)
        {
            case 1:m.create();break;
            case 2:m.push();break;
            case 3:m.pop();break;
            case 4:m.display();break;
            case 5:break;   
            default: System.out.println("INVALID OPTION");   
                
        }
        
        
        
    }while(opt!=5);
    
    }
}
