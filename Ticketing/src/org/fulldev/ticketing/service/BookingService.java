package org.fulldev.ticketing.service;
import org.fulldev.ticketing.model.Booking;
import org.fulldev.ticketing.model.Customer;
import org.fulldev.ticketing.model.Event;
import org.fulldev.ticketing.model.Ticket;

public class BookingService { // stateless
	
	/*
	Booking bookTicket(Event event, Customer customer) {
        Ticket ticket = new Ticket(event, customer);
    
        Booking booking = new Booking();
        booking.id = 1;
        booking.bookingNumber = "RES-" + ticket.id;
        booking.bookingDate = "2025-11-04 14:24";
        booking.event = event;
        booking.customer = customer;
        booking.status = Booking.STATUS_BOOKED;
        
        booking.tickets = new Ticket[] { ticket };
        
        return booking;
	}
	*/

	public Booking bookTicket(Event event, Customer customer) {		
		return bookTickets(event, customer, 1);
	}
		
	// plusieurs billets pour le même événement sélectionné 
	public Booking bookTickets(Event event, Customer customer, int numberOfTickets) {
        Booking booking = createBooking(event, customer);

        booking.setTickets(new Ticket[numberOfTickets]);
        for (int i = 0; i < booking.getTickets().length; i++) {
			booking.getTickets()[i] = new Ticket(event, customer);
		}
        
        return booking;
	}

	private Booking createBooking(Event event, Customer customer) {
		Booking booking = new Booking();
        booking.setId(1);
        booking.setBookingNumber("RES-012");
        booking.setBookingDate("2025-11-04 14:24");
        booking.setEvent(event);
        booking.setCustomer(customer);
        booking.setStatus(Booking.STATUS_BOOKED);
		return booking;
	}
	
	// plusieurs billets pour des événements différents
	public Booking[] bookTickets(Event[] events, Customer customer, int[] numberOfTicketsArray) {
		int nbOfBookings = events.length;
		Booking[] bookings = new Booking[nbOfBookings];
		for (int i = 0; i < bookings.length; i++) {
			bookings[i] = bookTickets(events[i], customer, numberOfTicketsArray[i]);
		}
		
		return bookings;
	}
	
}
