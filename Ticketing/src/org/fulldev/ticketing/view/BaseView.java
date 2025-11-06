package org.fulldev.ticketing.view;

public class BaseView {
	private final String title;
	
	public BaseView(String title) {
		this.title = title;
	}

	public void show() {
		// afficher le titre
		System.out.println("-----------------------------------");
		System.out.println(title);
		System.out.println("-----------------------------------");
		
	}
	
}
