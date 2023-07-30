package b3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class bookingAppTest {

    private bookingApp flightBookingApp;
    private flight flight1;
    private flight flight2;

    @BeforeEach
    public void setUp() {
        flightBookingApp = new bookingApp();

        // Create and add flights to the flight booking application
        flight1 = new flight("AS860", "Belgrade", "Tokyo", LocalDate.now(), LocalTime.now(), 200);
        flight2 = new flight("F860", "Berlin", "Paris", LocalDate.now().plusDays(1), LocalTime.now().plusHours(3), 150);
        flightBookingApp.addFlight(flight1);
        flightBookingApp.addFlight(flight2);
    }

    @Test
    public void testFindFlight() {
        // Test finding a flight by flight number
        assertNotNull(flightBookingApp.findFlight("AS860"), "Flight AS860 not found!");
        assertNull(flightBookingApp.findFlight("F986"), "Flight F986 should not be found!");
    }

    @Test
    public void testBookFlight() {
        // Test booking a flight
        assertTrue(flightBookingApp.bookFlight("AS860", 100), "Failed to book flight");
        assertEquals(100, flight1.getAvailableSeats(), "Failed to book seat");

        // Test booking more seats than available
        assertFalse(flightBookingApp.bookFlight("F860", 200), "Not enough seats on the flight");
    }

}