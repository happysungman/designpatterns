package pattern.creational_patterns.abstract_factory;

public class ZergDrone extends Worker {

	public ZergDrone(int power, int hp) {
		super(power, hp);
	}

	@Override
	public void gather() {
		System.out.println("ħ�� ���");
	}
	
	@Override
	public void build() {
		System.out.println("�ǹ��� ������� ���Ѵ�");
	}
}
