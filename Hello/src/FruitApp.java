import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FruitApp {

	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<>();
		
		fruits.add(new Fruit(1, "Pomme"));
		fruits.add(new Fruit(3, "Kiwi"));
		fruits.add(new Fruit(2, "Orange"));
		
		Collections.sort(fruits); //----> ["Kiwi", "Orange", "Pomme"]
		
		System.out.println(fruits);
	}
	
	public static void main3(String[] args) {
		//List<String> fruits = List.of(new String[] {"pomme", "kiwi", "poire", "ddd"});
		List<String> fruits = List.of("pomme", "kiwi", "poire", "ddd");
		
		List<String> fruits2 = Arrays.asList("pomme", "kiwi", "poire", "ddd");
		
		Collections.sort(fruits);
	}
	
	public static void main2(String[] args) {
		Collection<String> fruits = new ArrayList<>();
		fruits.add("pomme");
		fruits.add("orange");
		fruits.add("kiwi");
		
		// api stream / lambda
		fruits = fruits.stream()
				.filter(f -> !f.equals("orange"))
				.toList();
		System.out.println(fruits);		
	}

	public static void main_(String[] args) {
		Collection<String> fruits = new ArrayList<>();
		fruits.add("pomme");
		fruits.add("orange");
		fruits.add("kiwi");
		
		// avec iterator
		for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
			String fruit = (String) it.next();
			if ("kiwi".equals(fruit)) {
				it.remove();
			}
			System.out.println(fruit);
		}
		
		System.out.println(fruits);
		
		System.out.println("-----------------------------------------");
		
		// avec for each
		for (String fruit : fruits) {
			System.out.println(fruit);
			
			/*
			if ("kiwi".equals(fruit)) {
				fruits.remove(fruit);
			}
			 */
			
		}
		
	}
}
