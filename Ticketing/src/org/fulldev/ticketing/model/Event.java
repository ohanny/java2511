package org.fulldev.ticketing.model;

public class Event {
	private int id;
	private String name;
	private String scheduledAt;
	private double price;
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;			
		}
		else {
			System.err.println("Le prix renseigné est incorrect");
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
