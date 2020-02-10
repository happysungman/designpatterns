package pattern.creational_patterns.singleton;

public class DoubleCheckedLockingSingleton {
	private static DoubleCheckedLockingSingleton instance;

	private DoubleCheckedLockingSingleton() {
	}

	public static DoubleCheckedLockingSingleton getInstance() {
		if (instance == null) {
			synchronized (instance) {
				if(instance == null) instance = new DoubleCheckedLockingSingleton();
			}
		}
		return instance;
	}
}
