package pattern.creational_patterns.abstract_factory;

import java.util.ArrayList;
import java.util.List;

public class InitializationFactoryZerg extends InitializationFactory {

	@Override
	public Building createBuilding() {
		return new ZergHatchery();
	}

	@Override
	public List<Worker> createUnit() {
		int power = 4;
		int hp = 50;
		
		List<Worker> droneList = new ArrayList<>();
		for (int i = 0; i < 4; ++i) {
			droneList.add(new ZergDrone(power, hp));
		}
		return droneList;
	}

}
