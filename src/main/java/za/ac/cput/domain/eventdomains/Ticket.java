package za.ac.cput.domain.eventdomains;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity
public class Ticket {

    @Id
    private Long ticketId;
    private Long eventId;
    private double price;
    private String seatNumber;

    protected Ticket() {
    }

    private Ticket(Builder builder) {
        this.ticketId = builder.ticketId;
        this.eventId = builder.eventId;
        this.price = builder.price;
        this.seatNumber = builder.seatNumber;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public Long getEventId() {
        return eventId;
    }

    public double getPrice() {
        return price;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", eventId=" + eventId +
                ", price=" + price +
                ", seatNumber='" + seatNumber + '\'' +
                '}';
    }

    public static class Builder {
        private Long ticketId;
        private Long eventId;
        private double price;
        private String seatNumber;

        public Builder setTicketId(Long ticketId) {
            this.ticketId = ticketId;
            return this;
        }

        public Builder setEventId(Long eventId) {
            this.eventId = eventId;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setSeatNumber(String seatNumber) {
            this.seatNumber = seatNumber;
            return this;
        }

        public Builder copy(Ticket ticket) {
            this.ticketId = ticket.ticketId;
            this.eventId = ticket.eventId;
            this.price = ticket.price;
            this.seatNumber = ticket.seatNumber;
            return this;
        }

        public Ticket build() {
            return new Ticket(this);
        }
    }


}
