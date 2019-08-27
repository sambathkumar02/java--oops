import java.util.*;

interface Queueoperations
{
    void insert();
    void delete();
    void display();
     
    
}
 class Myqueue implements Queueoperations
 {
     Scanner s=new Scanner(System.in);
     
    int front,rear;
    int size=6;
    int q[]=new int[size];
    Myqueue()
    {
        front=-1;
        rear=-1;
    }
    public  void delete()
     {
         if(front==-1)
             System.out.println("\n queue underflow.. ");
         else
         {
         System.out.println(" Element deleted :"+q[front]);
         front++;
         }
         
         
     }
     public void insert()
     {
        if(rear<size-1)
        {
         System.out.println("\n Enter the element to be inserted:");
         int elem=s.nextInt();
         rear++;
         q[rear]=elem;
         
         if(front==-1)
             front++;
         System.out.println("Elemnet inserted sucessfully..");
        }
            
        else
        {
            System.out.println("\n queue overflow ");
        }
         
     }
     public void display()
     {
       
     
        System.out.println("\n Elements of queue are:");
        for(int i=0;i<=rear;i++)
            System.out.println("\t "+q[i]);
        
         
     
     }
         
         
         
         
         
}
     


 
public class Queue {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        Myqueue ob=new Myqueue();
        int opt;
        
        do
        {
        System.out.println("\n ****queue operations*****");
        System.out.println("\n1.insert\n 2.delete\n 3.display\n4.exit");
        System.out.println("\n Enter your option:");
        opt=s.nextInt();
        switch(opt)
        {
            case 1:ob.insert();break;
            case 2:ob.delete();break;
            case 3:ob.display();break;
            case 4:System.exit(0);
            default:System.out.println("\n INVALID OPTION.");
            
        }
        }while(opt!=4);
        
        
    }
    
}
