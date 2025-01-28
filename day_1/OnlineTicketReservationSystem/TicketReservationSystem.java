package OnlineTicketReservationSystem;

public class TicketReservationSystem {
    private TicketNode head;
    private TicketNode tail;

    public TicketReservationSystem() {
        this.head = null;
        this.tail = null;
    }

    // Add a new ticket reservation at the end of the circular list
    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newNode = new TicketNode(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;  // Make it circular
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;  // Maintain circular nature
        }
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketId) {
        if (head == null) return;

        TicketNode current = head;
        TicketNode prev = tail;
        do {
            if (current.ticketId == ticketId) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                    if (current == tail) {
                        tail = prev;
                    }
                }
                break;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    // Display the current tickets in the list
    public void displayTickets() {
        if (head == null) return;

        TicketNode current = head;
        do {
            System.out.println("Ticket ID: " + current.ticketId + ", Customer Name: " + current.customerName + ", Movie Name: " + current.movieName + ", Seat Number: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
            current = current.next;
        } while (current != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public TicketNode searchTicket(String customerName, String movieName) {
        if (head == null) return null;

        TicketNode current = head;
        do {
            if ((customerName != null && current.customerName.equalsIgnoreCase(customerName)) ||
                    (movieName != null && current.movieName.equalsIgnoreCase(movieName))) {
                return current;
            }
            current = current.next;
        } while (current != head);
        return null;
    }

    // Calculate the total number of booked tickets
    public int countTotalTickets() {
        if (head == null) return 0;

        int count = 0;
        TicketNode current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);
        return count;
    }
}
