package org.fulldev.ticketing.view;
import java.time.LocalDateTime;

import org.fulldev.ticketing.exception.BookingException;
import org.fulldev.ticketing.model.Booking;
import org.fulldev.ticketing.model.Customer;
import org.fulldev.ticketing.model.Event;
import org.fulldev.ticketing.model.Ticket;
import org.fulldev.ticketing.service.BookingService;

public class BookTicketView extends BaseView {

	public BookTicketView() {
		super("Réserver un billet");
	}

	public static void showHelp() {
		System.out.println("Page de réservation d'un billet.");
		System.out.println("Veuillez sélectionner un événement et renseigner votre nom.");
	}
	
	@Override
	public void renderBody() {
		//super.show();
		
		try {
			// saisie utilisateur
			Event javaDay = new Event();
	        javaDay.setName("Java Day");
	        javaDay.setId(23);
	        javaDay.setPrice(15.0);
	        //javaDay.setScheduledAt("2025-12-20 14:00");
	        javaDay.setScheduledAt(LocalDateTime.of(2025,12,20,14,0));
	
	        Customer cust = new Customer();
	        cust.setId(27);
	        cust.setFirstName("Émile");
	        cust.setLastName("Lampion");
	        cust.setEmail("emile@mail.com");
	        
	        int nbOfTickets = 2;
	        
	        // métier : réserver un billet
	        BookingService service = new BookingService();
	        //Booking booking = service.bookTicket(javaDay, cust);
	        Booking booking = service.bookTickets(javaDay, cust, nbOfTickets);
	        //Ticket ticket = service.ticket;
	        //Ticket createdTicket = 
	        
	        // affiche les informations du billet
	        System.out.println("Ticket n° " +  booking.getBookingNumber() + " pour " + booking.getEvent().getName());
	        System.out.println("Client : " + booking.getCustomer().getFirstName() + " " + booking.getCustomer().getLastName());
	        System.out.println("Statut : " + booking.getStatus());
	        System.out.println("Date : " + booking.getBookingDate());
	        
	        System.out.println("Prix de l'événement : " + javaDay.getPrice());
	        
	        System.out.println("Nombre de billets : " + booking.getTickets().size());
	        for (Ticket ticket : booking.getTickets()) {
	        	System.out.println("  - " + ticket.getId());			
			}
		} catch (BookingException e) {
			System.out.println("Veuillez renseigner l'événement");
		}
	}
	
	@Override
	public String getDescription() {
		return "Réserver un billet";
	}

}
