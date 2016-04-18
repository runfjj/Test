package StarBuzz;

public class Moca extends CondimentDecorationor {
	Beverage beverage;
	
	public Moca(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + "Moca";
	}
	
	public double cost() {
		return 0.2 +  beverage.cost();
	}
}
	