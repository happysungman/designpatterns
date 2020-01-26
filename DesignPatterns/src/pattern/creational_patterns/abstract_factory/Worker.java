package pattern.creational_patterns.abstract_factory;

public abstract class Worker implements Gatherable, Buildable {
	int power;
	int hp;
	
	public Worker(int power, int hp) {
		this.power = power;
		this.hp = hp;
	}
}
