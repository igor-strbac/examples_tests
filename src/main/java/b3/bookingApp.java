package b3;

import java.util.ArrayList;
import java.util.List;

public class bookingApp {

    private List<flight> flights;

    public bookingApp() {
        flights = new ArrayList<>();
    }

    public void addFlight(flight flight) {
        flights.add(flight);
    }

    public flight findFlight(String flightNumber) {
        for (flight fl : flights) {
            if (fl.getFlightNumber().equalsIgnoreCase(flightNumber)) {
                return fl;
            }
        }
        return null;
    }

    public boolean bookFlight(String flightNumber, int seatsToBook) {
        flight fl = findFlight(flightNumber);
        if (fl != null && fl.getAvailableSeats() >= seatsToBook) {
            fl.setAvailableSeats(fl.getAvailableSeats() - seatsToBook);
            return true;
        }
        return false;
    }
}
