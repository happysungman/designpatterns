package pattern.creational_patterns.singleton;

public class BasicSynchronizedSingleton {
	private static BasicSynchronizedSingleton instance;

	private BasicSynchronizedSingleton() { }

	public static synchronized BasicSynchronizedSingleton getInstance() {
		if (instance == null) {
			instance = new BasicSynchronizedSingleton();
		}
		return instance;
	}
}
