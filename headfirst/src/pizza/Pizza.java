package pizza;

import java.util.ArrayList;

abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();
	void preparePizza() {
		System.out.println("Prepareing "+ name);
		System.out.println("Tossing dough..");
		System.out.println("Adding sauce..");
		System.out.println("Adding topping: ");
		for (int i=0; i<toppings.size(); i++) {
			System.out.println("  "+toppings.get(i));
		}
	}
	
	void bakePizza() {
		System.out.println("Bake for 25 minutes!");
	}
	
	public String getName() {
		return name;
	}
}
