package org.fulldev.ticketing.model;

public class Booking {
		
	private int id;
	private String bookingNumber;
	private String bookingDate;
	private BookingStatus status;

	private Event event;
	private Customer customer;
	//Ticket ticket;
	private Ticket[] tickets;
	
	public Booking() {
		super();
	}

	public Booking(int id, Customer customer, Event event, Ticket[] tickets,  String bookingDate, String bookingNumber, BookingStatus status) {
		super();
		this.id = id;
		this.bookingNumber = bookingNumber;
		this.bookingDate = bookingDate;
		this.status = status;
		this.event = event;
		this.customer = customer;
		this.tickets = tickets;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookingNumber() {
		return bookingNumber;
	}
	public void setBookingNumber(String bookingNumber) {
		this.bookingNumber = bookingNumber;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public BookingStatus getStatus() {
		return status;
	}
	public void setStatus(BookingStatus status) {
		this.status = status;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Ticket[] getTickets() {
		return tickets;
	}
	public void setTickets(Ticket[] tickets) {
		this.tickets = tickets;
	}
}
