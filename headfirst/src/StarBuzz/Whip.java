package StarBuzz;

public class Whip extends CondimentDecorationor {
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + " Whip!";
	}
	
	public double cost() {
		return 0.4+beverage.cost();
	}

}
