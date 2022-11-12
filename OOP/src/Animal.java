/*
 * This class represents an Animal.  A class consists of two main parts:
 *  - Instance variables describe characteristics or qualities
 *  - Methods describe behaviors
 */

public class Animal {

	private String species;
	private int weight;
	private boolean isColdBlooded;

	public String getSpecies() {
		return species;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public boolean getIsColdBlooded() {
		return isColdBlooded;
	}
	
	public void setSpecies(String s) {
		species = s;
	}
	
	public void setWeight(int w) {
		weight = w;
	}
	
	public void setIsColdBlooded(boolean b) {
		isColdBlooded = b;
	}
	
	public Animal(String s, int w, boolean b) {
		setSpecies(s);
		setWeight(w);
		setIsColdBlooded(b);
	}
	
	public void eat() {
		System.out.println("The " + species + " is enjoying a hearty meal!");
	}

	public void sleep() {
		System.out.println("The " + species + " is getting some rest!");
	}

	public void reproduce() {
		System.out.println("The " + species + " is NOT getting some rest!");
	}
	
}
