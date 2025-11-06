package org.fulldev.ticketing.view;

public class ViewManager {

	public void showView(BaseView view) {
		if (view != null) {
			view.show();
			
			//if (view.getDescription() != null) System.err.println("[INFO] " + view.getDescription());
			// détecter le type de vue avec instanceof
			if (view instanceof BookTicketView) {
				System.err.println("[INFO] Vous allez réserver un billet.");
			} else if (view instanceof BookingListView) {
				System.err.println("[INFO] Vous consultez vos réservations.");
			} else if (view instanceof HelpView) {
				System.err.println("[INFO] Affichage de l’aide de l’application.");
			} else {
				System.err.println("[INFO] Vue générique.");
			}
		} else {
			System.err.println("Erreur : la vue n'existe pas");
		}
	}
	
}
