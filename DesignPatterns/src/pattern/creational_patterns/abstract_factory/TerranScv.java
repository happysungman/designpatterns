package pattern.creational_patterns.abstract_factory;

public class TerranScv extends Worker {

	public TerranScv(int power, int hp) {
		super(power, hp);
	}

	@Override
	public void gather() {
		System.out.println("미네랄을 절단하다");
	}

	@Override
	public void build() {
		System.out.println("건물을 짓다");
	}
}
