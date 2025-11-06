package org.fulldev.ticketing.model;

import org.fulldev.ticketing.exception.InvalidPriceException;

public class Event {
	private int id;
	private String name;
	private String scheduledAt;
	private double price;
	
	public Event() {
		super();
	}

	public Event(int id, String name, String scheduledAt, double price) {
		super();
		this.id = id;
		this.name = name;
		this.scheduledAt = scheduledAt;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;			
		}
		else {
			//System.err.println("Le prix renseigné est incorrect");
			//throw new IllegalArgumentException("Le prix ne peut pas être négatif !");
			throw new InvalidPriceException("Le prix ne peut pas être négatif !");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScheduledAt() {
		return scheduledAt;
	}

	public void setScheduledAt(String scheduledAt) {
		this.scheduledAt = scheduledAt;
	}
	
}
