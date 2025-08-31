package za.ac.cput.factory.eventfactories;

import za.ac.cput.domain.eventdomains.Ticket;

public class TicketFactory {

    public static Ticket buildTicket(Long eventId, double price, String seatNumber) {
        if (eventId == null || eventId <= 0)
            throw new IllegalArgumentException("Event ID must be a positive number.");
        if (price <= 0)
            throw new IllegalArgumentException("Price must be greater than zero.");
        if (seatNumber == null || seatNumber.isEmpty())
            throw new IllegalArgumentException("Seat number is required.");

        return new Ticket.Builder()
                .setEventId(eventId)
                .setPrice(price)
                .setSeatNumber(seatNumber)
                .build();
    }
}
