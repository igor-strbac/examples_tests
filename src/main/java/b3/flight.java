package b3;

import java.time.LocalDate;
import java.time.LocalTime;

public class flight {

    private String flightNumber;
    private String origin;
    private String destination;
    private LocalDate departureDate;
    private LocalTime departureTime;
    private int availableSeats;

    public flight(String flightNumber, String origin, String destination, LocalDate departureDate,
                  LocalTime departureTime, int availableSeats) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.availableSeats = availableSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
}
