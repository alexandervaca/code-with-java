package code.example.threadsynchronization;

public class TicketBooking {

    private int availableTickets = 10; // Shared resource (available tickets)

    // Synchronized method for booking tickets
    public synchronized void bookTicket(int tickets) {
        if (availableTickets >= tickets) {
            availableTickets -= tickets;
            System.out.println("Booked " + tickets + " tickets, Remaining tickets: " + availableTickets);
        } else {
            System.out.println("Not enough tickets available to book " + tickets);
        }
    }

    public int getAvailableTickets() {
        return availableTickets;
    }
}
