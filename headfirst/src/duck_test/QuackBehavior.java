package duck_test;

interface QuackBehavior {
	void quack();
	
}

class SilentQuack implements QuackBehavior {
	public void quack() {
		System.out.println("canot quck: silence");
	}
} 

class HightQuack implements QuackBehavior {
	public void quack() {
		System.out.println("High quack");
	}
}