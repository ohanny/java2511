package org.fulldev.ticketing;
import org.fulldev.ticketing.view.BookTicketView;
import org.fulldev.ticketing.view.BookingListView;
import org.fulldev.ticketing.view.HelpView;
import org.fulldev.ticketing.view.ViewManager;

public class TicketApp {
	public static void main(String[] args) {
		ViewManager manager = new ViewManager();
		manager.showView(new BookTicketView());
		manager.showView(new BookingListView());
		manager.showView(new HelpView());
		//manager.showView(new BaseView("xxx"));
		
		/*
		BookTicketView.showHelp();
		
		BookTicketView view1 = new BookTicketView();
		BookingListView view2 = new BookingListView();
		
		view1.show();
		view2.show();
		*/
	}
	
	/*
	public static void main_(String[] args) {
		
		Event javaDay = new Event();
        javaDay.name = "Java Day";
        javaDay.id = 23;
        javaDay.price = 15.0;
        javaDay.scheduledAt = "2025-12-20 14:00";
		
        Ticket ticket1 = new Ticket();
        ticket1.id = 1;
        ticket1.event = javaDay;
        
        Customer cust1 = new Customer();
        cust1.id = 27;
        cust1.firstName = "Émile";
        cust1.lastName = "Lampion";
        cust1.email = "emile@mail.com";
        
        ticket1.customer = cust1;
        ticket1.status = "PAID";

        Ticket ticket2 = new Ticket();
        ticket2.id = 2;
        
        ticket2.event = javaDay;
        
        ticket2.customer = new Customer();
        ticket2.customer.id = 41;
        ticket2.customer.firstName = "Adèle";
        ticket2.customer.lastName = "Blanc-Sec";
        ticket2.customer.email = "adele@mail.com";
        ticket2.status = "PAID";
        
        System.out.println("Ticket n°" +  ticket1.id + " pour " + ticket1.event.name);
        System.out.println("Client : " + ticket1.customer);
        System.out.println("Statut : " + ticket1.status);

        System.out.println();
        
        ticket2.status = "CANCELLED";
        
        System.out.println("Ticket n°" +  ticket2.id + " pour " + ticket2.event.name);
        System.out.println("Client : " + ticket2.customer);
        System.out.println("Statut : " + ticket2.status);
	}
	*/
}
