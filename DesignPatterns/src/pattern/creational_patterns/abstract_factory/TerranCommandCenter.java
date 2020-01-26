package pattern.creational_patterns.abstract_factory;

public class TerranCommandCenter extends Building {

	@Override
	public void createWorker() {
		System.out.println("scv를 생성한다");
	}

}
