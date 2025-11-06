package org.fulldev.ticketing.view;

import org.fulldev.ticketing.model.Booking;
import org.fulldev.ticketing.model.Customer;
import org.fulldev.ticketing.service.BookingService;

public class BookingListView extends BaseView {
	//private String title = "Mes réservations";
	
	public BookingListView() {
		super("Mes réservations");
	}

	@Override
	public void renderBody() {
		// afficher le titre
		//super.show();
		
        Customer cust = new Customer();
        cust.setId(1);
        cust.setFirstName("Émile");
        cust.setLastName("Lampion");
        cust.setEmail("emile@mail.com");
		
		// récupérer les réservations de l'utilisateur
		BookingService service = new BookingService();
		//Booking[] bookings = service.findBookingByCustomer(1);
		Booking[] bookings = service.findBookingByCustomer(cust);
		
		// afficher les réservations
		for (Booking b : bookings) {
			System.out.println(b.getBookingNumber() + " : " + b.getEvent().getName());
		}
	
	}
	
	@Override
	public String getDescription() {
		return "Afficher les réservations utilisateur";
	}
}
