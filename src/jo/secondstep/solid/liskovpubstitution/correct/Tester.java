package jo.secondstep.solid.liskovpubstitution.correct;

public class Tester<T> {
	
	 
	public void test(safe Safe) {

		Safe.openSafe(ProviderFactory.getPassProvider(Safe), 123456);
		Safe.closeSafe();
	}

}
