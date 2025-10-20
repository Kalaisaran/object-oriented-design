package RealWorldProblems.ParkingLot;

import java.util.Date;

public class ParkingTicket {
    private int ticketNo;
    private Date entryTime;
    private Date exitTime;
    private Entrance entrance;
    private Exit exit;

    private Vehicle vehicle;
    private Payment payment; // Composition: Ticket owns Payment
    private double amount;
    private TicketStatus ticketStatus;

}
