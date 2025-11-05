package voitureapp.model;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class VoitureApp {

	public static void main(String[] args) throws Exception {
		
		Voiture v1 = new Voiture();
		
		//v1.modele = "Twingo";
		if (v1.modele != null) {
			var modele = v1.modele.toUpperCase();
			System.out.println(modele);
		}
		
		v1.couleur = "bleu";
		v1.puissance = 5;
		
		Voiture v2 = new Voiture();
		v2.modele = "Fiesta";
		v2.couleur = "rouge";
		v2.puissance = 5;
		
		//v2.modele = "Kangoo";
		v2.setModele("Kangoo");
		
		Voiture v3 = new Voiture("Yaris", "vert", 5);
		
		new Voiture();
		new Voiture();
		new Voiture();
		new Voiture();
		new Voiture();
		
		
		String[] modeles = { "Twingo", "Fiesta" };
		int[] puissances = { 5, 7, 9};
		
		Voiture[] voitures = { v1, v2 };

		//
		String[] modelesBis = new String[] { "Twingo", "Fiesta" };
		Voiture[] voituresBis = new Voiture[] { v1, v2 };
		
		
		String texte = "La Terre, le Ciel et le Soleil";
		
		String[] words = texte.split(" ");
		for (String word : words) {
			System.out.println(word);
		}
		
		
//		Event javaDay = new Event();
//        javaDay.name = "Java Day";
//        javaDay.id = 23;
//        javaDay.setPrice(15.0);
//        javaDay.scheduledAt = "2025-12-20 14:00";
//
//        Customer cust = new Customer();
//        cust.id = 27;
//        cust.firstName = "Émile";
//        cust.lastName = "Lampion";
//        cust.email = "emile@mail.com";
//
//        var service = new BookingService();
//        var booking = service.bookTicket(javaDay, cust);
//
//        System.out.println("DEPUIS VOITURE APP");
//        System.out.println("Ticket n° " +  booking.bookingNumber + " pour " + booking.event.name);
//        System.out.println("Client : " + booking.customer.firstName + " " + booking.customer.lastName);
//        System.out.println("Statut : " + booking.status);
//        System.out.println("Date : " + booking.bookingDate);


		v1.rouler();
		
	}
	
}
