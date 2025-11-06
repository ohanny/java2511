package org.fulldev.ticketing.view;

import org.fulldev.ticketing.model.Booking;
import org.fulldev.ticketing.service.BookingService;

public class BookingListView extends BaseView {
	//private String title = "Mes réservations";
	
	public BookingListView() {
		super("Mes réservations");
	}

	@Override
	public void show() {
		// récupérer les réservations de l'utilisateur
		BookingService service = new BookingService();
		Booking[] bookings = service.findBookingByCustomer(1);
		
		// afficher le titre
		super.show();
		
		// afficher les réservations
		for (Booking b : bookings) {
			System.out.println(b.getBookingNumber() + " : " + b.getEvent().getName());
		}
	
	}
}
