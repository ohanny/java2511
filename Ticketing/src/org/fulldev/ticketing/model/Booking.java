package org.fulldev.ticketing.model;

public class Booking {
	
	public final static String STATUS_BOOKED = "BOOKED";
	public final static String STATUS_PAID = "PAID";
	public final static String STATUS_CANCELLED = "CANCELLED";
	
	private int id;
	private String bookingNumber;
	private String bookingDate;
	private String status;

	private Event event;
	private Customer customer;
	//Ticket ticket;
	private Ticket[] tickets;
	
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
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
