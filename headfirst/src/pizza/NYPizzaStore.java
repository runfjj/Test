package pizza;

public class NYPizzaStore extends PizzaStore {
	
	@Override
	protected Pizza createPizza(String type) throws NullPointerException {
			if (type.equals("cheese")) {
				return new CheesePizza();
			}else if(type.equals("greek")) {
				return new GreekPizza();
			}
			return null;
	}

}
