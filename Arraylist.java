import java.util.Scanner;
import java.util.*;
class Operations
{
    ArrayList<String> a=new ArrayList<String>();
    Scanner s=new Scanner(System.in);
    void add_elements()
    {
        System.out.println("Enter the number of elements to be inserted:");
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter element "+i);
            String elem=s.next();
            a.add(elem);
        }
        
        
    }
    void display()
    {
        System.out.println("Your list\n"+a);
    }
    void add_pos()
    {
        System.out.println("Enter the number of elements to be inserted:");
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter element "+i);
            String elem=s.next();
            System.out.println(" Enter the position:");
            int pos=s.nextInt();
            a.add(pos,elem);
        }
        
        
    }
    void search()
    {
        System.out.println("Enter the element to be searched:");
        String key=s.next();
        int flag=0,pos=0;
        for(int i=0;i<a.size();i++)
        {
            if(key.equals(a.get(i)))
            {
                flag=1;pos=i;
            }
        }
        if(flag==1)
            System.out.println("The key element is found in position"+pos);
        else
            System.out.println(" The key element is not found....");
        
    }
    void names()
    {
        int j=0;
        System.out.println(" Enter the starting letter:");
        char start=s.next().charAt(0);
        String str;
        char first;
        int flag=0;
        for(int i=0;i<a.size();i++)
        {
            str=a.get(i);
            first=str.charAt(j);
            if(first==start)
            {
                System.out.println("\n"+str);
                flag=1;
            }
            
            
            
                
        }
        if(flag==0)
            System.out.println(" No elements matched...");
    }
}

public class Arraylist {
    public static void main(String []args)
    {
    Operations op=new Operations();
    Scanner s=new Scanner(System.in);
    while(true)
    {
        System.out.println("****OPERATIONS*****");
        System.out.println("\n1.Add\n2.Add at required position\n3.display\n4.search\n5.elements starting with soecified latter\n6.exit");
        System.out.println("Enter your choice:");
        int opt =s.nextInt();
        switch(opt)
        {
            case 1:op.add_elements();break;
            case 2:op.add_pos();break;
            case 3:op.display();break;
            case 4:op.search();break;
            case 5:op.names();break;
            case 6:System.exit(0);break;
            default:System.out.println("Enter correct choice");
        }
    }
            
    
}
    
}