package org.fulldev.ticketing.printer;

import org.fulldev.ticketing.model.Ticket;

public class PdfTicketPrinter implements TicketPrinter, Cloneable {

	@Override
	public void printTicket(Ticket ticket) {
		System.out.println("===== BILLET (PDF) =====");
		System.out.println("N° " + ticket.getId());
		System.out.println("Évènement : " + ticket.getEvent().getName());
		System.out.println("Client : " + ticket.getCustomer().getFirstName() + " " + ticket.getCustomer().getLastName());
		System.out.println("==================");	
	}

}
