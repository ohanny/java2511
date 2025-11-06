package org.fulldev.ticketing.view;

public abstract class BaseView {
	private final String title;
	
	public BaseView(String title) {
		this.title = title;
	}

	public final void show() {
		renderTitle();
		renderBody();
	}
	
	protected abstract void renderBody();

	private void renderTitle() {
		// afficher le titre
		System.out.println("-----------------------------------");
		System.out.println(title);
		System.out.println("-----------------------------------");
	}
	
	public String getDescription() {
		return null;
	}
	
}
