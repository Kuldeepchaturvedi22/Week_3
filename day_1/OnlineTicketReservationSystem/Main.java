package OnlineTicketReservationSystem;

public class Main {
    public static void main(String[] args) {
        TicketReservationSystem reservationSystem = new TicketReservationSystem();
        reservationSystem.addTicket(1, "Alice", "Inception", "A1", "2025-01-27 10:30");
        reservationSystem.addTicket(2, "Bob", "Inception", "A2", "2025-01-27 10:30");
        reservationSystem.addTicket(3, "Charlie", "Interstellar", "B1", "2025-01-28 12:00");
        reservationSystem.displayTickets();

        reservationSystem.removeTicket(2);
        System.out.println("After Deletion:");
        reservationSystem.displayTickets();

        TicketNode ticket = reservationSystem.searchTicket("Alice", null);
        if (ticket != null) {
            System.out.println("Ticket Found: " + ticket.customerName + " for " + ticket.movieName);
        } else {
            System.out.println("Ticket not found.");
        }

        System.out.println("Total Number of Booked Tickets: " + reservationSystem.countTotalTickets());
    }

}
