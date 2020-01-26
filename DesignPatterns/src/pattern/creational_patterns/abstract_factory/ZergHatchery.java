package pattern.creational_patterns.abstract_factory;

public class ZergHatchery extends Building {

	@Override
	public void createWorker() {
		System.out.println("드론을 생성한다");
	}

	
}
