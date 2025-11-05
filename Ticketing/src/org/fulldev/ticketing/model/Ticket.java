package org.fulldev.ticketing.model;

public class Ticket {
	private static int nextId;
	
	private int id;
	//String seat;
	private Event event;
	private Customer customer;
	
	public Ticket(Event event, Customer customer) {
		this.id = ++nextId;
		this.event = event;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	
}
