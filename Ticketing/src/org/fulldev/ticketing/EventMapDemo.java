package org.fulldev.ticketing;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.fulldev.ticketing.model.Event;

public class EventMapDemo {

	public static void main(String[] args) {
		Event e1 = new Event(1, "Salon de la Gastronomie", LocalDateTime.now(), 10.0);
		Event e2 = new Event(1, "Salon de la Gastronomie", LocalDateTime.now(), 10.0);
		Event e3 = new Event(2, "Conférence Tech & Innovation", LocalDateTime.now(), 15.0);
		
		Map<Integer, Event> events = new HashMap<>();
		events.put(e1.getId(), e1);
		events.put(e2.getId(), e2);
		events.put(e3.getId(), e3);
		
		System.out.println("Les clés du map :");
		Set<Integer> keys = events.keySet();
		for (Integer key : keys) {
			System.out.println(key);
			
			System.out.println("valeur => " + events.get(key));
		}
		
		System.out.println("\nLes valeurs du map :");
		Collection<Event> values = events.values();
		for (Event event : values) {
			System.out.println(event);
		}

		System.out.println("\nLes entrées du map :");
		Set<Map.Entry<Integer, Event>> entries = events.entrySet();
		for (Map.Entry<Integer, Event> entry : entries) {
			System.out.println("clé => " + entry.getKey() + ", valeur => " + entry.getValue());
		}
	}
	
	public static void main1(String[] args) {
		
		int i = 10;
		Integer ii = Integer.valueOf(2);
		
		Integer entier = 10;
		//int entierPrimitif = entier.intValue();
		int entierPrimitif = entier;
		
		List<Integer> entiers = new ArrayList<>();
		entiers.add(Integer.valueOf(i));
		entiers.add(i);
		
		
		Event e1 = new Event(1, "Salon de la Gastronomie", LocalDateTime.now(), 10.0);
		Event e2 = new Event(1, "Salon de la Gastronomie", LocalDateTime.now(), 10.0);
		Event e3 = new Event(2, "Conférence Tech & Innovation", LocalDateTime.now(), 15.0);
		
		Map<Integer, Event> map = new HashMap<>();
		map.put(e1.getId(), e1);
		map.put(e2.getId(), e2);
		map.put(e3.getId(), e3);
		
		System.out.println("Taille => " + map.size());
		
		Event event = map.get(2);
		System.out.println(event);
		
	}
}
