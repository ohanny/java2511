package org.fulldev.ticketing.view;

public class HelpView extends BaseView {

	public HelpView() {
		super("Aide Ticketing");
	}

	@Override
	protected void renderBody() {
		// contenu spécifique à la vue d’aide
		System.out.println("Bienvenue dans l’application Ticketing !");
		System.out.println("Cette application vous permet de :");
		System.out.println(" - Consulter les événements disponibles");
		System.out.println(" - Réserver un ou plusieurs billets");
		System.out.println(" - Consulter vos réservations");
		System.out.println();
		System.out.println("Utilisez le menu principal pour naviguer entre les vues.");
		System.out.println("Bon spectacle !");		
	}

	@Override
	public String getDescription() {
		return "La vue d'aide";
	}
}
