package pattern.creational_patterns.abstract_factory;

import java.util.List;

public class Game {
	public static void main(String[] args) {
		InitializationFactory[] initFactory = {new InitializationFactoryTerran(), new InitializationFactoryZerg()};
		
		for (InitializationFactory factory : initFactory) {
			Building building = factory.createBuilding();
			List<Worker> workers = factory.createUnit();
			workers.get(0).gather();
			workers.get(1).build();
			building.createWorker();
			System.out.println("================");
		}
	}
}
