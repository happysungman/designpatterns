package pattern.creational_patterns.singleton;

public enum EnumSingleton {
	INSTANCE;
	
	public int value;
	public static EnumSingleton getInstance() {
		return INSTANCE;
	}
}
