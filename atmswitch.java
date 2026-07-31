import java.util.Scanner;

public class atmswitch {
    
    static double balance=0.0;
    static Scanner sc=new Scanner(System.in);

    public static void checkbalance() 
    {
        System.out.println("Current balance :"+balance);
    }
    public static void deposit()
    {
        System.out.println("Enter amount to deposit:");
        double amount=sc.nextInt();
        balance+=amount;
        System.out.println("Deposited successfully...");
    }
    public static void withdraw()
    {
        
        System.out.println("Enter amount to withdraw:");
        double amount=sc.nextInt();
        if(amount<=balance)
        {
            balance-=amount;
            System.out.println("Withdrawed successfully...");
        }
        else
        {
            System.out.println("Amount does not exist.. Transaction declined...");
        }
    }
    public static void checkpin()
    {
        int pin =2802;
        System.out.println("Enter your pin");
        int upin=sc.nextInt();
        if(pin==upin)
        {
            boolean flag=true;
            while (flag)
            {
                System.out.println("Enter you choice:\n 1. Check balence\n 2. Deposit\n 3. Withdrawal\n 4. Exit");
                int c=sc.nextInt();
                switch(c)
                {
                case 1:
                    checkbalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    flag=false;
                    break;
                default:
                    System.out.println("Invalid entry");
                    break;
            }
            }
            System.out.println("Thanks for using...");
        } 
        else
        {
            System.out.println("Invalid pin");
        }
    }
    public static void main(String[] args) 
    {
         checkpin();
    }
}
