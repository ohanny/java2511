package org.fulldev.ticketing.printer;

import org.fulldev.ticketing.model.Ticket;

public interface TicketPrinter {
	void printTicket(Ticket ticket);
	
	// méthode par défaut : comportement commun et personnalisable
	default void beforePrint() {
		System.out.println("Préparation du ticket...");
	}

	// méthode statique : utilitaire global à l’interface
	static void showPrinterInfo() {
		System.out.println("=== TicketPrinter System ===");
		System.out.println("Version 1.0 - Compatible avec Ticketing App");
		System.out.println("=============================");
	}
}
