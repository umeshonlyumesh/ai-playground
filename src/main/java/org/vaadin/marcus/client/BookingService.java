package org.vaadin.marcus.client;

import org.vaadin.marcus.service.BookingDetails;
import org.vaadin.marcus.service.FlightService;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;

import java.util.List;

@BrowserCallable
@AnonymousAllowed
public class BookingService {
    private final FlightService flightBookingService;

    public BookingService(FlightService flightBookingService) {
        this.flightBookingService = flightBookingService;
    }

    public List<BookingDetails> getBookings() {
        return flightBookingService.getBookings();
    }
}
