package org.fulldev.ticketing.printer;

import org.fulldev.ticketing.model.Ticket;

public class ConsoleTicketPrinter implements TicketPrinter, Cloneable {

	@Override
	public void printTicket(Ticket ticket) {
		// appel de la méthode par défaut
		beforePrint();
		
		System.out.println("===== BILLET =====");
		System.out.println("N° " + ticket.getId());
		System.out.println("Évènement : " + ticket.getEvent().getName());
		System.out.println("Client : " + ticket.getCustomer().getFirstName() + " " + ticket.getCustomer().getLastName());
		System.out.println("==================");	
	}

}
