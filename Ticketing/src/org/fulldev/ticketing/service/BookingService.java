package org.fulldev.ticketing.service;
import java.util.Arrays;

import org.fulldev.ticketing.model.Booking;
import org.fulldev.ticketing.model.BookingStatus;
import org.fulldev.ticketing.model.Customer;
import org.fulldev.ticketing.model.Event;
import org.fulldev.ticketing.model.Ticket;
import org.fulldev.ticketing.printer.ConsoleTicketPrinter;
import org.fulldev.ticketing.printer.TicketPrinter;

public class BookingService { // stateless
	
	private final static Event[] EVENTS = new Event[] {
		new Event(1, "Pièce de théâtre'Le Misanthrope'", "2025-10-24 20:30:00", 20),
		new Event(2, "ConférenceTech & Innovation", "2025-10-28 14:00:00", 23)
	};
	
	private final static Ticket[] TICKETS = new Ticket[] {
		new Ticket(EVENTS[0], new Customer(1, "Émile", "Lampion", "emile@example.com")),
		new Ticket(EVENTS[1], new Customer(1, "Émile", "Lampion", "emile@example.com")),
		new Ticket(EVENTS[1], new Customer(2, "Adèle", "Blanc-Sec", "adele@example.com"))
	};
	
	private final static Booking[] BOOKINGS = new Booking[] {
		new Booking(1, TICKETS[0].getCustomer(), TICKETS[0].getEvent(), new Ticket[] { TICKETS[0] }, "2025-09-27 10:52:15", "RES-1", BookingStatus.STATUS_BOOKED),
		new Booking(2, TICKETS[1].getCustomer(), TICKETS[1].getEvent(), new Ticket[] { TICKETS[1] }, "2025-10-04 15:02:31", "RES-2", BookingStatus.STATUS_BOOKED),
		new Booking(3, TICKETS[2].getCustomer(), TICKETS[2].getEvent(), new Ticket[] { TICKETS[2] }, "2025-10-05 08:14:17", "RES-3", BookingStatus.STATUS_BOOKED)
	};
	
	
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
	
	/*
	public Booking[] findBookingByCustomer(int customerId) {
		Customer cust1 = new Customer(customerId, "Émile", "Lampion", "emile@example.com");
		Event event1 = new Event(1, "Pièce de théâtre'Le Misanthrope'", "2025-10-24 20:30:00", 20);
		Event event2 = new Event(2, "ConférenceTech & Innovation", "2025-10-28 14:00:00", 23);
		Ticket[] tickets1 = new Ticket[] { new Ticket(event1, cust1) };
		Ticket[] tickets2 = new Ticket[] { new Ticket(event2, cust1) };
		Booking booking1 = new Booking(1, cust1, event1, tickets1, "2025-09-27 10:52:15", "RES-1", Booking.STATUS_BOOKED);
		Booking booking2 = new Booking(2, cust1, event2, tickets2, "2025-10-04 15:02:31", "RES-2", Booking.STATUS_BOOKED);
		Booking[] bookings = new Booking[] { booking1, booking2 };
	
		return bookings;
	}
	*/

	public Booking[] findBookingByCustomer(int customerId) {
		Booking[] bookings = new Booking[BOOKINGS.length];
		int count = 0;
		for (Booking b : BOOKINGS) {
			if (b.getCustomer().getId() == customerId) {
				bookings[count++] = b;
			}
		}
		return Arrays.copyOf(bookings, count);
	}
	
	public Booking[] findBookingByCustomer(Customer customer) {
		System.err.println("Recherche des résa pour : " + customer);
		
		Booking[] bookings = new Booking[BOOKINGS.length];
		int count = 0;
		for (Booking b : BOOKINGS) {
			if (b.getCustomer().equals(customer)) {
				bookings[count++] = b;
			}
		}
		return Arrays.copyOf(bookings, count);
	}
	
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
        
        TicketPrinter.showPrinterInfo();        
        
        TicketPrinter printer = new ConsoleTicketPrinter();
        for (Ticket ticket : booking.getTickets()) {
        	printer.printTicket(ticket);
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
        booking.setStatus(BookingStatus.STATUS_BOOKED);
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
