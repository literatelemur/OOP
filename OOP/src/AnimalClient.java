/*
 * AnimalClient contains a main method that creates some Animal objects
 * and calls methods using them.
 * 
 */

public class AnimalClient {

	public static void main(String[] args) {

		Animal jim = new Animal("cold-blooded sloth", 40, true);
		Animal tony = new Animal("tiger", 800, false);

		System.out.println(jim.getSpecies());
		System.out.println(jim.getWeight());
		System.out.println(jim.getIsColdBlooded());
		
		jim.sleep();
		tony.eat();
	}

}
