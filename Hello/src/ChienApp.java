public class ChienApp {
	
	public static void main(String[] args) {
		
		
		Chien monChien = new Chien();
		int ageDuChien = 5;

		Chien.ageMaxi = 20;
		//monChien.ageMaxi = 25;
		int max = Chien.ageMaxi;
		

		
		monChien.setAge(ageDuChien);
		// valeur de age et monChien.age ?
		
		
		System.out.println();
		System.out.println("hello");
		System.out.println(5);
		System.out.println(monChien);
		
	}
	
	
}
