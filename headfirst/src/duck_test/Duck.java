package duck_test;

abstract class Duck {
	String color;
	FlyBehavior flyB;
	QuackBehavior quackB;
	
	abstract void display(); 
	
	Duck () {}
	Duck (Integer i) {}
	Duck (Integer i, String s) {}
	
	void setColor(String color) {
		this.color = color;
	}
	
	void setFlyBehavior(FlyBehavior flyB) {
		this.flyB = flyB;
	}
	
	void setQuackBehavior(QuackBehavior quackB) {
		this.quackB = quackB;
	}
	
	void performFly() {
		flyB.fly();
	}
	
	void performQuack() {
		quackB.quack();
	}
	
}

class RedDuck extends Duck {
	RedDuck() {
//		this.color = "Red";
//		this.flyB = new FlyWithSwing();
	}
	
	void display() {
		System.out.println("this is a red duck" + this.color);
	}
}

class GreenDuck extends Duck {
	void display() {
		System.out.println("this is a green duck"+ this.color);
	}
}