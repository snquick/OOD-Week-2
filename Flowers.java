import java.util.ArrayList;

public abstract class Flowers {
	String name;
	String type;
	String occasion; 
	ArrayList<String> arrangements = new ArrayList<String>();

	// gathers the name, type, and occasion strings from the specific class it is being called from
	// If the summer store is called, then those strings will be pulled and printed out
	void gather() {	
		System.out.println("Selecting your flowers for: " + name);
		System.out.println("Flowers: " + type);
		System.out.println("Event: " + occasion);

		
		System.out.println("Creating...");
		for (String arrangment : arrangements) {
			System.out.println("   " + arrangment);
		}
	}
	
	void prepare() {
		System.out.println("Cleaning the flowers...");
		System.out.println("Cutting the stems...");

	}
	
	void arrange() {
		System.out.println("Selecting vase...");
		System.out.println("Adding water and plant food...");
		
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(type + "\n");
		display.append(occasion + "\n");
		for (String arrangement : arrangements) {
			display.append(arrangement + "\n");
		}
		return display.toString();
	}
}
