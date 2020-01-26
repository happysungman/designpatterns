package pattern.creational_patterns.abstract_factory;

import java.util.List;

public abstract class InitializationFactory {

	abstract public Building createBuilding();
	abstract public List<Worker> createUnit();
}
