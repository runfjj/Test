package StarBuzz;

public class Soy extends CondimentDecorationor {
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + " Soy!";
	}
	
	public double cost() {
		return 0.3+beverage.cost();
	}
}
