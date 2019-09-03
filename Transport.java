import java.util.Scanner;
abstract class Car
{
    String reg_no,model,reg_date;
    abstract void GetData(int no);
    abstract void display(int no);
    
    
}
class TransportVehicle extends Car
{
    Scanner s=new Scanner(System.in);
    String validity_no,start_date,period;
    void GetData(int no)
    {
    	System.out.println("\n Enter the details of vehicle "+no);
        System.out.println("\n Enter registration number :");
        reg_no=s.next();
        System.out.println("\n Enter model :");
        model=s.next();
        System.out.println("\n Enter registration date:");
        reg_date=s.next();
        System.out.println("\n Enter validity number :");
        validity_no=s.next();
        System.out.println("\n Enter start date :");
        start_date=s.next();
        System.out.println("\n Enter period :");
        period=s.next();
        
    }
    public void display(int no)
    {
        System.out.println("\n -------Details of Transport vehicle"+no+"--------");
        System.out.println("\n Registration  number :"+reg_no);
        System.out.println("\n model                :"+model);
        System.out.println("\n registration date    :"+reg_date);
        System.out.println("\n validity number      :"+validity_no);
        System.out.println("\nstart date            : "+start_date);
        System.out.println("\n period               :"+period);
        System.out.println("\n --------------thank you-------------------------");
           
        
        
    }
    
}
class PrivateVehicle extends Car
{
	Scanner s=new Scanner(System.in);
	String owner_name,owner_add;
	
	void display(int no)
	{
		 	System.out.println("\n -------Details of Transport vehicle"+no+"--------");
	        System.out.println("\n Registration  number :"+reg_no);
	        System.out.println("\n model                :"+model);
	        System.out.println("\n registration date    :"+reg_date);
	        System.out.println("\n validity number      :"+owner_name);
	        System.out.println("\nstart date            : "+owner_add);
	        System.out.println("\n --------------thank you-------------------------");
	           
		
	}
	
	void GetData(int no) {
		System.out.println("\n Enter the details of vehicle "+no);
	 	System.out.println("\n Enter registration number :");
        reg_no=s.next();
        System.out.println("\n Enter model :");
        model=s.next();
        System.out.println("\n Enter registration date:");
        reg_date=s.next();
        System.out.println("\n Enter owner name :");
        owner_name=s.next();
        System.out.println("\n Enter owner address:");
        owner_add=s.next();
		
		
	}
}
public class Transport{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int opt,i,n;
        System.out.println("\n ---welcome to vehicles details portl---");
        System.out.println("\n 1.Transport vehicles\n 2.private vehicles\n3.exit");
        System.out.println("\n Enter vehicle type in option: ");
        opt=s.nextInt();
        switch(opt)
        {
        case 1:
        	 System.out.println("\n Enter the number of vehicles:");
        	 n=s.nextInt();
        	 TransportVehicle[] t=new TransportVehicle[n];
      
        	 
        	 for(i=0;i<n;i++)
        	 {
        		 
        		 t[i].GetData(i);
        		 t[i].display(i);
        		 
        	 }
       case 2:
        	System.out.println("\n Enter the number of vehicles:");
        	n=s.nextInt();
        	PrivateVehicle[] p=new PrivateVehicle[n];
       	 	
       	 	for(i=1;i<=n;i++)
       	 	{
       		 p[i].GetData(i);
       		 p[i].display(i);
       		 
       	 	}
        	
        case 3:
        	System.exit(0);
        	
        default:System.out.println("\n Enter corect option..");
        	
        }
        
    }
}
        
        
       
        
    
    
