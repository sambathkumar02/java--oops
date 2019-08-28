import java.util.Scanner;
interface CreditCard
{
    void VeiwCreditAmount();
    void ViewPin();
    void ChangePin();
    void PayBalance();
}
class Customer implements CreditCard
{
    Scanner s =new Scanner(System.in);
    String pin="3006";
    String name,cardno;
    double CreditAmount=0;
    public void VeiwCreditAmount()
    {
        CreditAmount=20000;
        System.out.println("\n your credit amount :"+CreditAmount);
        
    }
    public void ViewPin()
    {
        System.out.println(" your pin number is:"+pin);
        
    }
    public void ChangePin()
    {
        String newpin,cur;
        int count=0;
        cur=" ";
        while(cur.compareTo(pin)!=0 && count!=5)
        {
            System.out.println("\n Enter your current pin number:");
            cur=s.next();
            if(cur.compareTo(pin)!=0)
                System.out.println(" wrong pin..");
            count++;
            if(count==5)
            {
                System.out.println(" your chances are over please try again..");
                 return;
            }
        }
        System.out.println("\n Enter your new pin:");
        pin=s.next();
        System.out.println("\n pin changed sucessfully..");
    }
        
                    
                
        
        
        
    
    public void PayBalance()
    {
        VeiwCreditAmount();
        System.out.println("\n Enter the amount you want to pay..");
        double bal=s.nextDouble();
        if(CreditAmount<bal)
        {
            System.out.println("\n Enter correct balance Amount.....");
            return;
        }
        else if(CreditAmount==0)
        {
            System.out.println("\n your credit amount is fully paid..");
            return;
        }
        else
        {
            CreditAmount-=bal;
            System.out.println("\n Amount paid sucessfully\n your current Credit amount:"+CreditAmount);
        }
    }
}
public class Credit{
    public static void main(String []args)
    {
        int opt;
        Scanner s=new Scanner(System.in);
        Customer c=new Customer();
        do
        {
        System.out.println("\n ***Credit Card Operations***");
        System.out.println("\n1.veiw credit amount\n2.veiw pin\n3.change pin\n4.pay balance\n5.exit");
        System.out.println("\n Enter your option:");
        opt=s.nextInt();
        switch(opt)
        {
            case 1:c.VeiwCreditAmount();break;
            case 2:c.ViewPin();break;
            case 3:c.ChangePin();break;
            case 4:c.PayBalance();break;
            case 5:System.exit(0);
            default:System.out.println("\n invalid option");
        }
        }while(opt!=5);
            
    }
        
}

