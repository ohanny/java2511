package org.fulldev.ticketing.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Booking {
		
	private int id;
	private String bookingNumber;
	private LocalDateTime bookingDate;
	private BookingStatus status;

	private Event event;
	private Customer customer;
	//Ticket ticket;
	private List<Ticket> tickets;// = new ArrayList<>();
	//private List<Ticket> tickets = new ArrayList<>();
	
	public Booking() {
		super();
	}

	public Booking(int id, Customer customer, Event event, List<Ticket> tickets,  LocalDateTime bookingDate, String bookingNumber, BookingStatus status) {
		super();
		this.id = id;
		this.bookingNumber = bookingNumber;
		this.bookingDate = bookingDate;
		this.status = status;
		this.event = event;
		this.customer = customer;
		this.tickets = tickets;
	}
	
	
	public void addTicket(Ticket ticket) {
		if (this.tickets == null) {
			this.tickets = new ArrayList<>();
		}
		this.tickets.add(ticket);
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
	public LocalDateTime getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDateTime bookingDate) {
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
	public List<Ticket> getTickets() {
		return tickets;
	}
	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
}
