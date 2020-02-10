package pattern.creational_patterns.singleton;

public class TestSingleton {
	
	public void testBasic() {
		BasicSingleton singleton = BasicSingleton.getInstance();
	}
	
	public void testDcl() {
		DoubleCheckedLockingSingleton singleton = DoubleCheckedLockingSingleton.getInstance();
	}
	
	public void testLazyHolder() {
		LazyHolderSingleton singleton = LazyHolderSingleton.getInstance();
	}
	
	public void testEnum() {
		EnumSingleton singleton = EnumSingleton.getInstance();
	}
}
