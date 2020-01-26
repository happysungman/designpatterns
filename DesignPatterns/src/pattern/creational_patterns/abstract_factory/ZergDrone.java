package pattern.creational_patterns.abstract_factory;

public class ZergDrone extends Worker {

	public ZergDrone(int power, int hp) {
		super(power, hp);
	}

	@Override
	public void gather() {
		System.out.println("침을 뱉다");
	}
	
	@Override
	public void build() {
		System.out.println("건물용 번데기로 변한다");
	}
}
