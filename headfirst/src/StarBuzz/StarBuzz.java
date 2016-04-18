package StarBuzz;

public class StarBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage = new Espresso();
		beverage = new Whip(beverage);
		beverage = new Soy(beverage);
		System.out.println(beverage.getDescription()+" $"+beverage.cost());
		
	}

}
