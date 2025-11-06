package org.fulldev.ticketing.view;

public class ViewManager {

	public void showView(BaseView view) {
		if (view != null) {
			view.show();			
		} else {
			System.err.println("Erreur : la vue n'existe pas");
		}
	}
	
}
