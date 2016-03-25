package duck_test;

interface FlyBehavior {
	public abstract void fly();
}

class FlyWithSwing implements FlyBehavior {
	public void fly() {
		System.out.println("Fly with swing!");
	}
}

class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("Fly no way!");
	}
}

