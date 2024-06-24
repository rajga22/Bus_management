class Bus {
    private String busNumber;
    private int capacity;
    private int bookedSeats;

    public Bus(String busNumber, int capacity) {
        this.busNumber = busNumber;
        this.capacity = capacity;
        this.bookedSeats = 0;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public boolean bookSeat() {
        if (bookedSeats < capacity) {
            bookedSeats++;
            return true;
        } else {
            return false;
        }
    }
}

class Ticket {
    private String ticketNumber;
    private String passengerName;
    private Bus bus;

    public Ticket(String ticketNumber, String passengerName, Bus bus) {
        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
        this.bus = bus;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public Bus getBus() {
        return bus;
    }
}