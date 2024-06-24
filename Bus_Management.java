import java.util.ArrayList;
import java.util.List;

class Bus_Management {
    List<Bus> buses = new ArrayList<>();
    List<Ticket> tickets = new ArrayList<>();

    void addBus(Bus bus) 
    {
        buses.add(bus);
    }

    boolean bookTicket(String ticketNumber, String passengerName, String busNumber) 
    {
        Bus bus = findBusByNumber(busNumber);
        if (bus != null && bus.bookSeat()) 
        {
            Ticket ticket = new Ticket(ticketNumber, passengerName, bus);
            tickets.add(ticket);
            return true;
        } 
        else 
        {
            return false;
        }
    }

    Bus findBusByNumber(String busNumber) 
    {
        for (Bus bus : buses) 
        {
            if (bus.getBusNumber().equals(busNumber)) 
            {
                return bus;
            }
        }
        return null;
    }
    
    void display_allBus()
    {
        for (Bus bus : buses) 
            System.out.println("Bus No=>"+bus.getBusNumber());
    }
}