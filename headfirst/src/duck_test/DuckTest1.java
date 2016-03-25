package duck_test;

public class DuckTest1 {
	public static void main(String[] args) {
		Duck d = new RedDuck();
		d.setColor("Red");
		d.display();
		d.setFlyBehavior(new FlyNoWay());
		d.performFly();
		d.setQuackBehavior(new SilentQuack());
		d.performQuack();
		
		Duck d2 = new GreenDuck();
		d2.setColor("Green");
		d2.display();
		d2.setFlyBehavior(new FlyWithSwing());
		d2.performFly();
	}		
}