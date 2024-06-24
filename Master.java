import java.util.Scanner;
public class Master 
{
    public static void main(String[] args) 
    {
        Bus_Management ob = new Bus_Management();
        Scanner sc = new Scanner(System.in);
        int n,i,bseat,ch,tc=1;;
        String bno="",tno="";
        System.out.print("Enter total no of bus for testing=>");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
            {
                bno="B00"+Integer.toString(i);
                System.out.println("Bus no=>"+bno);
                System.out.print("Enter total no of seat=>");
                bseat=sc.nextInt();
                ob.addBus(new Bus(bno, bseat));
            }
        
        while (true) {
            System.out.println("1. Display All Bus No");
            System.out.println("2. Book Ticket");
            System.out.println("3. Exit");
            System.out.print("Enter choice =>");
            ch = sc.nextInt();
            if (ch == 1)
            {
                ob.display_allBus();
            }
            else if (ch == 2) 
            {
                sc.nextLine();
                tno="T00"+Integer.toString(tc);
                System.out.println("Ticket Number: "+tno);
                System.out.print("Enter Passenger Name: ");
                String passengerName = sc.nextLine();
                System.out.print("Enter Bus Number: ");
                String busNumber = sc.nextLine();
                Bus bus = ob.findBusByNumber(busNumber);
                if (bus != null)
                {
                    boolean success = ob.bookTicket(tno, passengerName, busNumber);
                    if (success) 
                    {
                        System.out.println("Ticket booked successfully!");
                        tc++;
                    }    
                    else 
                    {
                        System.out.println("Failed to book ticket due to all seat are reserved");
                    }
                }
                else
                {
                    System.out.println("Invalid bus number.......");
                }
            } 
            else if (ch == 3) 
            {
                System.out.println("Program end.....");
                break;
            }
            else
            {
                System.out.println("Invalid choice enter....");
            }
        }        
    }
}