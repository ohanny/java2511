
public class HelloWorld {

	public static void main(String[] args) {
		int a = 1;
		while (a < 100) {
			int b = a * 5;
			if (b > 15) {
				int c = a + b;
				a = c * 2;
				System.out.println(c);
			}
			
		}
	}

	public static void main5(String[] args) {
		int i = 5;

		String result = i == 4 ? "quatre" : i == 5 ? "cinq" : "je ne sais pas";

		String result1 = null;
		if (i == 4) {
			result = "quatre";
		}

		/*
		 * if (i == 4) { result = "quatre"; } else { result = "je ne sais pas"; }
		 */

		System.out.println(result);
	}

	public static void main4(String[] args) {
		int i = 2;

		// i = i + 1;
		// ++i;

		int a = i++;

		System.out.println(a);
		System.out.println(i);

	}

	public static void main3(String[] args) {
		char shorcut = 'c';

		switch (shorcut) {
		case 'c':
			System.out.println("Copier");
			break;

		case 'y': // => popup + couper
		case 'w': // => popup + couper
			System.out.println("affiche popup");

		case 'x':
			System.out.println("Couper");
			break;

		case 'v':
			System.out.println("Coller");
			break;

		default:
			break;
		}

		switch (shorcut) {
		case 'c' -> System.out.println("Copier");
		case 'w', 'y' -> System.out.println("affiche popup");
		case 'x' -> System.out.println("Couper");
		case 'v' -> System.out.println("Coller");
		}

		// pattern matching

	}

	public static void main2(String[] args) {
		System.out.println("---- Menu ----");
		System.out.println("1. Consulter une fiche produit");
		System.out.println("2. Chercher des produits");
		System.out.println("3. Se connecter");
		System.out.println("4. Quitter");

		int input = 2;

		if (input == 1) {
			System.out.println("==== Fiche Produit ===");
		} else if (input == 2) {
			System.out.println("==== Chercher des Produits ===");
		} else if (input == 3) {
			System.out.println("==== Se connecter ===");
		} else if (input == 4) {
			System.out.println("Bye !");
		}

		switch (input) {
		case 1:
			System.out.println("==== Fiche Produit ===");
			break;

		case 2:
			System.out.println("==== Chercher des Produits ===");
			System.out.println("Mot clé ?");
			break;

		case 3:
			System.out.println("==== Se connecter ===");
			break;

		case 4:
			System.out.println("Bye !");
			break;

		default:
			break;
		}

	}

	public static void main1(String[] args) {

		int input = 17;

		if (input < 10) {
			System.out.println("Pas de réduction");
		} else if (input < 15) {
			System.out.println("5% réduction");
		} else if (input < 20) {
			System.out.println("10% réduction");
		} else {
			System.out.println("20% réduction");
		}

		var message = "Bonjour " + args[0];
		System.out.println(message);

		var ageDB = 25000000000L;

		// ...

		var age = (int) ageDB;

		System.out.println("age => " + age);

		var midi = true;

		System.out.println(midi);

		// var chat;

		int quantite = 20;

	}

}
