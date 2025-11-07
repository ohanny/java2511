package org.fulldev.ticketing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.fulldev.ticketing.model.Event;

public class EventSetDemo {
	public static void main(String[] args) {
		
		List<Event> eventsAvecDoublons = new ArrayList();
		
		Event e1 = new Event(1, "Salon de la Gastronomie", "2025-10-12 14:00", 10.0);
		Event e2 = new Event(1, "Salon de la Gastronomie", "2025-10-12 14:00", 10.0);
		Event e3 = new Event(2, "Conférence Tech & Innovation", "2025-10-28 09:00", 15.0);
		
		eventsAvecDoublons.add(e1);
		eventsAvecDoublons.add(e2);
		eventsAvecDoublons.add(e3);
		
		System.out.println("événements dans la list : " + eventsAvecDoublons);
		
		Set<Event> eventsSansDoublons = new HashSet<>(eventsAvecDoublons);

		System.out.println("événements dans le set : " + eventsSansDoublons);
	}

	public static void main_(String[] args) {
		Set<Event> events = new HashSet<>();
		
		Event e1 = new Event(1, "Salon de la Gastronomie", "2025-10-12 14:00", 10.0);
		Event e2 = new Event(1, "Salon de la Gastronomie", "2025-10-12 14:00", 10.0);
		Event e3 = new Event(2, "Conférence Tech & Innovation", "2025-10-28 09:00", 15.0);
		
		events.add(e1);
		events.add(e2);
		events.add(e3);
		
		System.out.println("Nombre d'événements dans le set : " + events.size());
		
		for (Event e : events) {
			System.out.println(e.getId() + " - " + e.getName());
		}
	}
}
