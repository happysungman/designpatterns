package pattern.creational_patterns.abstract_factory;

public class TerranScv extends Worker {

	public TerranScv(int power, int hp) {
		super(power, hp);
	}

	@Override
	public void gather() {
		System.out.println("�̳׶��� �����ϴ�");
	}

	@Override
	public void build() {
		System.out.println("�ǹ��� ����");
	}
}
