package pizza;

abstract class PizzaStore {
	
	void orderPizza(String type){
		Pizza pizza = createPizza(type);
		pizza.preparePizza();
		System.out.println("A new pizza order");
	}
	protected abstract Pizza createPizza(String type); 
	
}
