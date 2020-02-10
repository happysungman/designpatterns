package pattern.creational_patterns.singleton;

public class LazyHolderSingleton {
	private LazyHolderSingleton() { }
	
	private static class LazyHolder {
		private static final LazyHolderSingleton INSTANCE = new LazyHolderSingleton();
	}
	
	public static LazyHolderSingleton getInstance() {
		return LazyHolder.INSTANCE;
	}
}
